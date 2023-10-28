package labsheet9.exercise5;

public class BookFav {
    private String Title, ISBN;
    private double Price;
    private int numberOfPages;

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

    public void SetTitle(String title){
        if (title == null || title == ""){
            this.Title = "Title Not Available";
        }else{
            this.Title = title;
        }
    }
    public void SetPrice(double price){
        if(price < 0 || price > 50000)
            this.Price = 0;
        else
            this.Price = price;
    }
    public void SetISBN(String isbn){
        if (isbn.length()==10){
            this.ISBN = isbn;
        }else{
            this.ISBN = "ISBN Not Available";
        }
    }
    public void SetNumberOfPages(int numberOfPages){
        if(numberOfPages < 0 || numberOfPages > 4000)
            this.numberOfPages = 0;
        else
            this.numberOfPages = numberOfPages;
    }

    public String toString(){
        String data = String.format("\n%-25s%-9f%-15s%d\n", GetTitle(), GetPrice(), GetISBN(), GetNumberOfPages());
        return data;
    }
}
