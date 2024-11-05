package Main;

import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;

    AcademicBook(String title, String auteur, String ISBN, double price, int stock,String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject=subject;
    }



    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getMediaType() {
        return (getAverageRating()>=4.5)?"Bestselling AcademicBook" : "AcademicBook";
    }

    @Override
    public String toString() {
        return super.toString()+"\nSubject : "+getSubject();
    }
}
