package model;

public class Borrow {
    int book_id;
    int extra_days;
    int fine;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getExtra_days() {
        return extra_days;
    }

    public void setExtra_days(int extra_days) {
        this.extra_days = extra_days;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public Borrow(int book_id, int extra_days, int fine) {
        this.book_id = book_id;
        this.extra_days = extra_days;
        this.fine = fine;
    }

    public void totalfine(){
        System.out.println("The total fine for book id "+ this.book_id+ " for "+ this.extra_days+" is "+ this.fine);
    }
}