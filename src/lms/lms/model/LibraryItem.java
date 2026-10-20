package lms.model;

public abstract class LibraryItem {
private String id;
private String title;
private boolean isBorrowed;

public LibraryItem(String id, String title) {
    setId(id);
    setTitle(title);
    this.isBorrowed = false;

}

public String getId(){
    return this.id;
}
public String getTitle(){
    return this.title;
}
public boolean isBorrowed(){
    return this.isBorrowed;
}

public void setId(String id) {
    if(id == null || id.isBlank()){
        throw new IllegalArgumentException("Id cannot be blank");
    }
    else{
        this.id = id;
    }
}

public void setTitle(String title) {
    if(title == null || title.isBlank()){
        throw new IllegalArgumentException("Title cannot be blank");
    }
    else{
        this.title = title;
    }
}

public void borrowItem() { 
    isBorrowed = true;
 }

public void returnItem() { 
    isBorrowed = false;
}
public double calculateLateFee(int daysLate) {
        return daysLate * 10.0;
}
@Override
public String toString() {
    return "id = " + this.id + ", title = " + this.title + ", borrowed = " + this.isBorrowed;
}
}