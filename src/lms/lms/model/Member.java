package lms.model;
public class Member {
    private String memberId;
    private String name;
    private int borrowedCount;
    private int maxBorrowLimit;
    public Member(String memberId, String name, int maxBorrowLimit) {

        setMemberId(memberId);
        setName(name);
        this.maxBorrowLimit = maxBorrowLimit;
        borrowedCount = 0;

    }
    public String getMemberId(){ return memberId;}
    public String getName(){ return name;}
    public int getBorrowedCount(){ return borrowedCount;}
    public int getMaxBorrowLimit(){ return maxBorrowLimit;}


    public void setMemberId(String memberId){
        if(memberId == null || memberId.isBlank()){
            throw  new IllegalArgumentException("Member ID cannot blank");
        }
        else {
            this.memberId = memberId;
        }
    }
    public void setName(String name){
        if(name == null || name.isBlank()){
            throw  new IllegalArgumentException("Name cannot blank");
        }
        else {
            this.name = name;
        }
    }

    public void setBorrowedCount(int count){
        if(count < 0){
            throw new IllegalArgumentException("Count cannot be negative");
        }
        else{
            borrowedCount = count;
        }
    }
    public void incrementBorrowedCount(){
        setBorrowedCount(borrowedCount + 1);
    }


    public String toString(){
        return "memberID: " + memberId +  "name: "+ name + "borrowedCount: "+ borrowedCount + "maxBorrowLimit: " + maxBorrowLimit;
    }

}