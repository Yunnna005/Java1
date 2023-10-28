package labsheet10.exercise1;

public class BookFav {
    private String Title, ISBN;
    private double Price;
    private int numberOfPages;

    public BookFav(){
        Title = "Title Not Available";
        Price = 0.0;
        ISBN = "ISBN Not Available";
        numberOfPages = 0;
    }

    public BookFav(String title, double price, String isbn, int numberOfPages){
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
    public void SetNumberOfPages(int numberOfPages){
        if (numberOfPages > 0){
            this.numberOfPages = numberOfPages;
        }
    }

    public String toString(){
        String data = String.format("\n%-25s%-9f%-15s%d\n", GetTitle(), GetPrice(), GetISBN(), GetNumberOfPages());
        return data;
    }
}
