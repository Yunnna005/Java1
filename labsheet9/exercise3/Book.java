package labsheet9.exercise3;

public class Book {
    private String Title, ISBN;
    private double Price;
    private int numberOfPages;

    public Book(){
        Title = "Title Not Available";
        Price = 0.0;
        ISBN = "ISBN Not Available";
        numberOfPages = 0;
    }

    public Book(String title, double price, String isbn, int numberOfPages){
        this.Title = title;
        this.Price = price;
        this.ISBN = isbn;
        this.numberOfPages = numberOfPages;
    }

    public String GetTitle(){return Title;}
    public double GetPrice(){return Price;}
    public String GetISBN(){return ISBN;}
    public int GetNumberOfPages(){return numberOfPages;}

    public void SetTitle(String title){this.Title = title;}
    public void SetPrice(double price){
        if(price>0){
        this.Price = price;
        }
    }
    public void SetISBN(String isbn){
        if (isbn.length()==10){
            this.ISBN = isbn;
        }
    }
}
