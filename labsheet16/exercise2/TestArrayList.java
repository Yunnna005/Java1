package labsheet16.exercise2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList{
    public static void main(String[] args) {

        ArrayList<LineItem> allLineItems = new ArrayList<LineItem>();

        // Create Products
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen","This is a black pen");
        Product p12 = new Product(12, "Blue Pen","This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));
        // Create LineItem objects

        LineItem item1 = new LineItem(1, 3, p1);
        LineItem item2 = new LineItem(2, 4, p2);
        LineItem item3 = new LineItem(3, 2, p3);

        allLineItems.add(item1);
        allLineItems.add(item2);
        allLineItems.add(item3);

        int input = Integer.parseInt(JOptionPane.showInputDialog("1.Add a Product\n2.Amend a Product\n3.Remove a Product\n4.View all Products\n5.Quit\n\nPlease enter your choice"));
        if (!inputValidation(input)){
            input = Integer.parseInt(JOptionPane.showInputDialog("1.Add a Product\n2.Amend a Product\n3.Remove a Product\n4.View all Products\n5.Quit\n\nPlease enter your choice"));
        }else{
            switch (input){
                case 1:
                    addProduct(allProducts);
                case 2:
                    amendProduct(allProducts);
                case 3:
                    removeProduct(allProducts);
                case 4:
                    viewProducts(allProducts);
                case 5:
                    //exit
            }
        }
    }

    private static boolean inputValidation(int num) {
        if (num<1||num>5){
            return false;
        }else{
            return true;
        }
    }

    public static void addProduct(ArrayList<Product> allProducts){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the product id"));
        String name = JOptionPane.showInputDialog("Enter the product name");
        String description = JOptionPane.showInputDialog("Enter the pr. desc.");

        Product p = new Product(id,name,description);
        allProducts.add(p);
        JOptionPane.showMessageDialog(null,"Product created and added to array list.");

    }
    public static void amendProduct(ArrayList<Product> allProducts){
        String input = JOptionPane.showInputDialog("Enter the name of the product you wish to amend");

        String ProductsText = "";
        String productAmend = "";
        int AmendProductIndex = 0;
        if (allProducts.contains(input)){
            for(int i = 0; i<allProducts.size(); i++){
                ProductsText += allProducts.get(i)+"\n";
            }
        }
        int amendID = Integer.parseInt(JOptionPane.showInputDialog(null, "The following products matched your search phrase\n\n"+
                ProductsText+"\n\nEnter the id of the one do you want to amend"));

        for (int i = 0;i<ProductsText.length(); i++){
            if (allProducts.contains(amendID)){
                productAmend = String.valueOf(allProducts.get(i));
            }
            AmendProductIndex ++;
        }
        int choiceAmendAction = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n"+
                productAmend+"\n\n1.Amend Name\n2.Amend Deescription\n3.Cancel Amendment\n\n"+
                "Please enter your choice"));
        switch (choiceAmendAction){
            case 1:
                //amend name

                for (int i = 0; i<ProductsText.length(); i++){
                    if (allProducts.indexOf(i) == AmendProductIndex){
                        String newName = JOptionPane.showInputDialog("Enter the new description for the product");
                        //переделать!!!!!!!!!!
                    }
                }
            case 2:
                //amend description
            case 3:
                //exit
        }

    }
    public static void removeProduct(ArrayList<Product> allProducts){}
    public static void viewProducts(ArrayList<Product> allProducts){}
}
