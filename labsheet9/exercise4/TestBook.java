package labsheet9.exercise4;

import labsheet9.exercise3.Book;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        textArea.setFont(new Font("monospaced",Font.PLAIN,15));
        String textAreaData = "";

        textAreaData += String.format("%-30s%-10s%-15s%s\n\n", "Title","Price", "ISBN","Pages");

        BookFav b1 = new BookFav("Tom Sawyer",25.50, "6453728382",432);
        textAreaData += b1.toString();

        BookFav b2 = new BookFav("\n\nThe Davinci Code", 32.99, "8745633456",621);
        textAreaData += b2.toString();

        textArea.setText(textAreaData);

        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}