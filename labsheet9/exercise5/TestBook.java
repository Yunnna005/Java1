package labsheet9.exercise5;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        String title, ISBN;
        double price;
        int pages;

        TextArea textArea = new TextArea();
        textArea.setFont(new Font("monospaced",Font.PLAIN,15));
        String textAreaData = "";

       textArea.setText(String.format("%-25s%-9s%-15s%s\n","Title","Price","ISBN","Pages"));

       title = JOptionPane.showInputDialog("Enter the title of your fav book");
       price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of your fav book"));
       ISBN = JOptionPane.showInputDialog("Enter the ISBN of your fav book");
       pages = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pages"));

       BookFav b1 = new BookFav(title,price,ISBN,pages);
       textAreaData +=  b1.toString();

        title = JOptionPane.showInputDialog("Enter the title of your fav book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of your fav book"));
        ISBN = JOptionPane.showInputDialog("Enter the ISBN of your fav book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pages"));

        BookFav b2 = new BookFav(title,price,ISBN,pages);
        textAreaData +=  b2.toString();

        textArea.append(textAreaData);

        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}