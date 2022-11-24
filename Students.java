package model;

public class Students {
    String student_name;
    int grade;
    int no_of_books;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getNo_of_books() {
        return no_of_books;
    }

    public void setNo_of_books(int no_of_books) {
        this.no_of_books = no_of_books;
    }

    public Students(String student_name, int grade, int no_of_books) {
        this.student_name = student_name;
        this.grade = grade;
        this.no_of_books = no_of_books;
    }

    public void printing_format(){
        System.out.println("The student is "+ this.student_name + " of class "+ this.grade + " and has borrowed " + this.no_of_books + " books");
    }
}