package lms.model;

public class Staff extends Member {
    private static final int STUDENT_BORROW_LIMIT = 10;
    public Staff(String memberId, String name) {
        super(memberId,name,STUDENT_BORROW_LIMIT);
    }
}