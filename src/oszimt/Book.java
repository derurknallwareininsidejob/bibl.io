package oszimt;

import java.time.LocalDate;

public class Book {

    private int             id;
    private String          author;
    private String          title;
    private LocalDate       returnDate;
    private BorrowCondition status;
    private LibUser         currentUserId;
    private LibUser         reservedUserId;

    public Book(int id, String author, String title, LocalDate returnDate, BorrowCondition status, LibUser currentUserId, LibUser reservedUserId) {
        this.id = (int)(Math.random()*((999999-100000)+1)) +1;
        this.author = author;
        this.title = title;
        this.returnDate = returnDate;
        this.status = status;
        this.currentUserId = currentUserId;
        this.reservedUserId = reservedUserId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public BorrowCondition getStatus() {
        return status;
    }

    public void setStatus(BorrowCondition status) {
        this.status = status;
    }

    public LibUser getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(LibUser currentUserId) {
        this.currentUserId = currentUserId;
    }

    public LibUser getReservedUserId() {
        return reservedUserId;
    }

    public void setReservedUserId(LibUser reservedUserId) {
        this.reservedUserId = reservedUserId;
    }

    public void borrow (LibUser user, LocalDate date) {

    }

    public void returnBook () {

    }

    public void reserve () {

    }
}
