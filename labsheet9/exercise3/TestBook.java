package labsheet9.exercise3;

import labsheet8.exercise1.Computer;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Book b1 = new Book();
        output += "Calling the no-argument Book constructor. " +
                "The first Book object details are: \n\n" + b1.toString();


        JOptionPane.showMessageDialog(null,output,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}