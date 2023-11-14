package PS9.Year2021;

public class Library {
    private String name;
    private String address;
    private String librarian;
    private int numberEmployees;
    private Book[] books;

    public Library(String name, String address, String librarian, int numberEmployees, Book[] books){
        setName(name);
        setAddress(address);
        setLibrarian(librarian);
        setNumberEmployees(numberEmployees);
        setBooks(books);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }
    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getLibrarian() {return librarian;}
    public int getNumberEmployees() {return numberEmployees;}
    public Book[] getBooks() {return books;}

    public String toString(){
        return "Library Details - Name: "+getName()+"  Address: "+getAddress()+" Librarian: "+
                getLibrarian()+" NUmber of Employees: "+getNumberEmployees()+"\n\n";
    }

    public int getBookCount(){
        int totalBooks = 0;
        for (int i = 0; i<books.length; i++){
            if (books[i]!=null){
                totalBooks += books[i].getNumberCopies();
            }
        }
        return totalBooks;
    }

    public Book findBook(String title){
        for(int i = 0; i<books.length; i++){
            if (books[i]!=null && books[i].getTitle().equals(title)){
                return books[i];
            }
        }
        return null;
    }

    public void addBook(Book book){
        Book b = findBook(book.getTitle());

        if (b != null){
            b.setNumberCopies(b.getNumberCopies()+book.getNumberCopies());
        }else{
            int i = 0;

            while(books[i]!=null){
                i++;
            }
            books[i] = book;
        }
    }
}
