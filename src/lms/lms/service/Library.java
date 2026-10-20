package lms.service;
import lms.model.Book;
import lms.model.LibraryItem;
import lms.model.Member;
import java.util.ArrayList;
import java.util.List;
public class Library {
   List<LibraryItem> items = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();


    public void addItem(LibraryItem item){
        items.add(item);
    }
    public void addMember(Member member){
        members.add(member);
    }
    public void listItems(){
        for(LibraryItem item : items){
            item.toString();
        }
    }
    public void listmembers(){
        for(Member member : members){
            member.toString();
        }
    }

    // TODO: printAllLateFees(int daysLate)
    // for each item print: title + ": " + item.calculateLateFee(daysLate)
}
