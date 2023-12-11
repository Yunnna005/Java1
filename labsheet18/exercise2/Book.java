package labsheet18.exercise2;

//Book.java
/*An instantiable class which defines a Book. This one contains exception-handling code in some
* of its mutators to prevent bad input. The exception thrown in this case is from a user-defined
* exception class called InvalidBookDataException*/

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;
    private int ID;
    private static int count;

    public Book() throws InvalidBookDataException {
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }

    public Book(String title, double price, String ISBN, int pages) throws InvalidBookDataException {
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

    public void setTitle(String title) throws InvalidBookDataException {

        if(title == null || title.equals(""))
            throw new InvalidBookDataException("The book title must be given some value\n");

        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidBookDataException {
        if(price < 0)
            throw new InvalidBookDataException("The book price must be a positive number\n");

        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) throws InvalidBookDataException {
        if(!ISBN.equals("ISBN Not Available") && !ISBNValidator.isValidISBN(ISBN))
            throw new InvalidBookDataException("The book ISBN must be a proper ISBN value\n");

        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) throws InvalidBookDataException {
        if(pages<0)
            throw new InvalidBookDataException("The number of pages in the book must be a positive number\n");

        this.pages = pages;
    }

    public String toString() {
        return "Title: " + getTitle() + "  Price: " + getPrice() +
                "  ISBN: " + getISBN() + "  Number of Pages: " + getPages() +
                "  ID: " + getID();
    }
}
