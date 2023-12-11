package labsheet18.exercise1;

//Book.java
/*An instantiable class which defines a Book. This one contains exception-handling code in some
* of its mutators to prevent bad input*/

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;
    private int ID;
    private static int count;

    public Book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }

    public Book(String title, double price, String ISBN, int pages) {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
        incrementCount();
        setID(count);
    }

    private static void incrementCount() {
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String getTitle() {
        return title;
    }

    public int getID() {
        return ID;
    }

    private void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {

        if(title == null || title.equals(""))
            throw new IllegalArgumentException("The book title must be given some value\n");

        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0)
            throw new IllegalArgumentException("The book price must be a positive number\n");

        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(!ISBN.equals("ISBN Not Available") && !ISBNValidator.isValidISBN(ISBN))
            throw new IllegalArgumentException("The book ISBN must be a proper ISBN value\n");

        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages < 0)
            throw new IllegalArgumentException("The number of pages in the book must be a positive number\n");

        this.pages = pages;
    }

    public String toString() {
        return "Title: " + getTitle() + "  Price: " + getPrice() +
                "  ISBN: " + getISBN() + "  Number of Pages: " + getPages() +
                "  ID: " + getID();
    }
}
