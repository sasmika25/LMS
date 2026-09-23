public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }


    public void setTitle(String title){
        this.title = title;
    }

    public boolean isBorrowed(){
        return this.isBorrowed;
    }

    public void setBorrowed(boolean status){
        this.isBorrowed = status;
    
    }

    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isBorrowed ? "Not Available" : "Available"));
    }
    
}
