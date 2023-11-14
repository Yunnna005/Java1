package PS9.Year2021;

import javax.swing.*;

public class TestLibrary {
    public static void main(String[] args) {
        String text = "";
        Author[] authorList = new Author[10];

        Author a1 = new Author("Harvey", "Deitel");
        Author a2 = new Author("Brian", "Kernighan");
        Author a3 = new Author("Robert", "Martin");
        Author a4 = new Author("Quentin", "Charatan");
        Author a5 = new Author("Paul", "Deitel");
        Author a6 = new Author("Aaron", "Kans");
        Author a7 = new Author("C. Thomas", "Wu");
        Author a8 = new Author("Jeffrey", "Listfield");
        Author a9 = new Author("Dennis", "Ritchie");
        Author a10 = new Author("Bjarne", "Stroustrup");

        authorList[0] = a1;authorList[1] = a2;authorList[2] = a3;authorList[3] = a4;authorList[4] = a5;
        authorList[5] = a6;authorList[6] = a7;authorList[7] = a8;authorList[8] = a9;authorList[9] = a10;

        Book b1 = new Book("0131103628", "The C Programming Language", "Prentice Hall", new Author[]{a2, a9}, 6 );
        Book b2 = new Book("0132350884", "Clean Code", "Prentice Hall", new Author[]{a3}, 5);
        Book b3 = new Book("3319994190", "Java in Two Semesters", "Springer", new Author[]{a4,a6}, 8);
        Book b4 = new Book("0132222205", "C#: How to Program", "Pearson", new Author[]{a1,a5,a8}, 6);
        Book b5 = new Book("0073523305", "An Introduction to Object Oriented Programming with Java", "McGraw-Hill", new Author[]{a7},3 );

        Book[] bookList = new Book[100];

        bookList[0]=b1;bookList[1]=b2;bookList[2]=b3;bookList[3]=b4;bookList[4]=b5;

        Library l = new Library("MTU Kerry Library", "Dromtacker, Tralee, Co. Kerry", "Pat Doherty", 13, bookList);

        text = l.toString();
        text += "\n Book Details: ";
        for (int i = 0; i< 5; i++){
            text += "\n"+ bookList[i]+"\n";
        }
        text += "\n\n\nLibrary Book Count: "+l.getBookCount();

        JOptionPane.showMessageDialog(null, text, "Library Details",JOptionPane.INFORMATION_MESSAGE);


    }
}
