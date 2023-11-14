package PS9.Year2021;

import java.util.Arrays;

public class Book {
    private String ISBN;
    private String title;
    private String publisher;
    private Author[] authors;
    private int numberCopies;

    public Book(String ISBN, String title, String publisher, Author[] authors, int numberCopies){
        setISBN(ISBN);
        setTitle(title);
        setPublisher(publisher);
        setAuthors(authors);
        setNumberCopies(numberCopies);
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    public void setNumberCopies(int numberCopies) {
        this.numberCopies = numberCopies;
    }

    public String getISBN() {return ISBN;}
    public String getTitle() {return title;}
    public String getPublisher() {return publisher;}
    public Author[] getAuthors() {return authors;}
    public int getNumberCopies() {return numberCopies;}


    public String toString() {
        return "ISBN :"+getISBN()+" Title: "+getTitle()+" Publisher: "+getPublisher()+
                " Author(s): "+ Arrays.toString(getAuthors())+" Number of copies: "+getNumberCopies();
    }
}
