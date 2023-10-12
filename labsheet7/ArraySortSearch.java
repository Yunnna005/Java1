package labsheet7;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSearch {
    public static void main(String[] args) {
        String[] names = new String[5];
        String searchName;
        int subscript;

        Scanner input = new Scanner(System.in);

        populateArray(names);

        System.out.println("\n\nOriginal contents of array is:\n\n "+ Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("\n\nAfter sort(), content of array is\n\n"+ Arrays.toString(names));
        System.out.print("\n\nEnter the name you seek: ");
        searchName = input.nextLine();

        subscript = Arrays.binarySearch(names, searchName);
        if (subscript >= 0){
            System.out.println("\n\nThe name you are searching for, "+names[subscript]+
                    ", has been found");
        }else{
            System.out.println("\n\nSorry the name has not been found");
        }
    }

    private static void populateArray(String[] names) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the "+names.length+" names\n");

        for (int i = 0; i<names.length;i++){
            System.out.println("\nEnter the name of person "+(i+1)+": ");
            names[i] = input.nextLine();
        }
    }
}
