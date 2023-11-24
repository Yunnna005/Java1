package labsheet16.simpleprogram2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import java.util.ArrayList;

public class TestArrayList{
    public static void main(String[] args) {

        System.out.println("\n\nCreating two array-lists, one to maintain a collection of products,\n" +
                "the other to maintain a collection of line-items ...\n");
        //Create an array-list of LineItem objects
        ArrayList<LineItem> allLineItems = new ArrayList<LineItem>();

        //Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>();


        // Create Products
        Product p1 = new Product(1, "Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Marker", "This is a black permanent marker");

        allProducts.add(p1);
        allProducts.add(p2);
        allProducts.add(p3);
        allProducts.add(p4);


        // Create LineItem objects

        LineItem item1 = new LineItem(1, 3, p1);
        LineItem item2 = new LineItem(2, 4, p2);
        LineItem item3 = new LineItem(3, 2, p3);

        allLineItems.add(item1);
        allLineItems.add(item2);
        allLineItems.add(item3);

        System.out.println("There are " + allLineItems.size() + " line-items in its array");
        System.out.println("There are " + allProducts.size() + " products in its array");

        System.out.println("\nDisplaying the state of all products ...\n");
        for (Product p : allProducts)
            if (p != null)
                System.out.println(p);


        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\n\nNow removing the first line-item from its array-list...\n\n");
        allLineItems.remove(0);

        System.out.println("Displaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\n\nCreating a new product, a compass, and adding it to the array-list of products\n");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        allProducts.add(p5);

        LineItem item4 = new LineItem(4, 5, p5);

        System.out.println("\nNow adding a new line-item, for 5 compasses, to end of its array-list...\n");
        allLineItems.add(item4);

        System.out.println("There are " + allLineItems.size() + " line-items in its array");
        System.out.println("There are " + allProducts.size() + " products in its array");

        System.out.println("\nDisplaying the state of all products ...\n");
        for (Product p : allProducts)
            if (p != null)
                System.out.println(p);

        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\n\nDisplaying the state of all line-items which contain products beginning with 'Pen' ...\n\n");
        for (LineItem l : allLineItems)
            if (l != null && l.getProduct().getName().startsWith("Pen"))
                System.out.println(l);

        System.out.println("\n\nNow changing product of the line-item in the 2nd position of the array-list from a ruler to a black permanent marker...");
        allLineItems.get(1).setProduct(p4);

        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\nNow removing the 2nd product, the pencil, from the array-list of products...\n\n");
        allProducts.remove(1);

        System.out.println("There are " + allLineItems.size() + " line-items in its array");
        System.out.println("There are " + allProducts.size() + " products in its array");
        System.out.println("\nDisplaying the state of all products ...\n");
        for (Product p : allProducts)
            if (p != null)
                System.out.println(p);

        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

    }
}
