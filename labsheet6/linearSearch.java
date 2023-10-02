package labsheet6;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] stockIDs = new int[5];
        float[] prices = new float[5];
        int searchID, subscript;

        Scanner input = new Scanner(System.in);

        populateArrays(stockIDs, prices);
        System.out.print("\n\nEnter the product id number you want the price for: ");
        searchID = input.nextInt();

        subscript = linearSearch(stockIDs, searchID);

        if (subscript != -1){
            System.out.println("The product ID number "+ searchID+ " has been found and "+
                    "Its price is $ "+prices[subscript]);
        }
    }

    public static void populateArrays(int[] stockIDs, float[] prices){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product ID number and price for "+
                stockIDs.length+" stock items\n");
        for (int i = 0; i<stockIDs.length; i++){
            System.out.print("Enter the id number for product "+(i+1)+": ");
            stockIDs[i] = input.nextInt();

            System.out.print("Enter the price for this product: ");
            prices[i] = input.nextFloat();
        }
    }
    public static int linearSearch(int[] stockIDs, int key){
        for (int i = 0; i<stockIDs.length; i++){
            if (stockIDs[i] == key){
                return i;
            }
        }
        return -1;
    }
}
