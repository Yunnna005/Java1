package labsheet18.exercise2;

//TestBook.java
/*A driver class for the Book class. This contains try-catch code to handle both InvalidBookDataExceptions
that might be thrown by various mutators and also to handle NumberFormatExceptions that might be thrown
by improper numeric input*/

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";
        boolean valid = false;
        Book book1 = null, book2 = null;

        try {
            book1 = new Book();
        }
        catch(InvalidBookDataException ibde){
            ibde.printStackTrace();
            JOptionPane.showMessageDialog(null, ibde.getMessage() + "\nInvalid input supplied! Please re-enter book details",
                    "Invalid Input!", JOptionPane.ERROR_MESSAGE);
        }

        while(!valid) {
            try {
                String title = JOptionPane.showInputDialog("Please enter the title of the book");

                String priceAsString = JOptionPane.showInputDialog("Please enter the price of the book");

                if(priceAsString == null)
                    JOptionPane.showMessageDialog(null, "\nInvalid input supplied, must be a number! Please re-enter book details",
                            "Invalid Input!", JOptionPane.ERROR_MESSAGE);
                else {
                    double price = Double.parseDouble(priceAsString);

                    String ISBN = JOptionPane.showInputDialog("Please enter the ISBN of the book");

                    String pagesAsString = JOptionPane.showInputDialog("Please enter the number of pages in the book");

                    if(pagesAsString == null)
                        JOptionPane.showMessageDialog(null, "\nInvalid input supplied, must be a number! Please re-enter book details",
                                "Invalid Input!", JOptionPane.ERROR_MESSAGE);
                    else{
                        int pages = Integer.parseInt(pagesAsString);

                        book2 = new Book(title, price, ISBN, pages);

                        valid = true;
                    }
                }
            }
            catch (NumberFormatException nfe) {
                nfe.printStackTrace();
                JOptionPane.showMessageDialog(null, "\nInvalid input supplied, must be a number! Please re-enter book details",
                        "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            }
            catch (InvalidBookDataException ibde) {
                ibde.printStackTrace();
                JOptionPane.showMessageDialog(null, ibde.getMessage() + "\nInvalid input supplied! Please re-enter book details",
                        "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            }
        }

        output += "Calling the no-argument Book constructor. " +
                "The first Book object details are: \n\n" + book1;

        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second Book object details are: \n\n" + book2;

        JOptionPane.showMessageDialog(null,output,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
