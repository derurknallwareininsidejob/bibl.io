package oszimt;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book {

    private int             id;
    private String          author;
    private String          title;
    private LocalDate       returnDate;
    private LibUser         currentUserId;
    private LibUser         reservedUserId;

    public Book (int id, String author, String title, LocalDate returnDate, BorrowCondition borrowCon, LibUser currentUserId, LibUser reservedUserId) {
        // number range
        this.id = (int)(Math.random()*((999999-100000)+1)) +1;
        this.author = author;
        this.title = title;
        this.returnDate = returnDate;
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

    public long returnBook () {
        long days; //init days
        long calcFee; //init calcfee

        LocalDate now = LocalDate.now(); //init localdate, get current time


        //check if returned in time
        if ( this.returnDate.isAfter(now) ) {
            //not returned in time

            days = this.returnDate.until(now, ChronoUnit.DAYS); //late by (days)

            //calc and set expiry fee
            calcFee = BorrowCondition.getExpiry_fee() * (days/7); //per week
            this.currentUserId.setFeeState( (int) (currentUserId.getFeeState() + calcFee));

            if ( this.currentUserId.getFeeState() > BorrowCondition.getMax_fee() ) {
                //unvalidate libCard of user
                this.currentUserId.setCardValid(false);
            }

        } else {
            //returned in time
            this.returnDate = null;
            this.currentUserId = null;
            days = 0;
        }

        if (this.reservedUserId != null) {
            this.borrow(this.reservedUserId, now);
        }

        return days;
    }

    public void reserve (LibUser reserver) {
        if (this.currentUserId != this.reservedUserId && this.reservedUserId != null) {
            this.reservedUserId = reserver;
            System.out.print("Reservation successful!");
        } else {
            System.out.print("Reservation not successful!");
        }
    }
}
