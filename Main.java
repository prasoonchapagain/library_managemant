import model.Books;
import model.Borrow;
import model.Students;


public class Main {
    public static void main(String[] args) {

        Books book1 = new Books("A","James",1985,23456);
        Books book2 = new Books("B","Andrew",1995,43457);
        Books book3 = new Books("C","Sarah",2000,43875);

        Students student1 = new Students("Prasoon",12,5);
        Students student2 = new Students("Aashutosh",12,6);
        Students student3 = new Students("Sambridhi",11,15);

        Borrow borrow1 = new Borrow(1,5,500);
        Borrow borrow2 = new Borrow(2,6,600);
        Borrow borrow3 = new Borrow(3,7,700);

        book1.printing_format();
        book2.printing_format();
        book3.printing_format();

        student1.printing_format();
        student2.printing_format();
        student3.printing_format();

        borrow1.totalfine();
        borrow2.totalfine();
        borrow3.totalfine();
    }
}
