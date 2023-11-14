package PS9.Year2021;

public class Author {
    private static int authorID = 0;
    private int authorNumber;
    private String firstname;
    private String surname;

    public Author(String firstname, String surname){
        setFirstname(firstname);
        setSurname(surname);
        authorNumber = ++authorID;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAuthorNumber() {return authorNumber;}
    public String getFirstname() {return firstname;}
    public String getSurname() {return surname;}

    public String toString(){
        return "Author - Number"+getAuthorNumber()+" Name: "+getFirstname()+" "+getSurname();
    }
}
