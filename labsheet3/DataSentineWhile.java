package labsheet3;

import java.util.Scanner;

public class DataSentineWhile {
    public static void main(String[] args) {
        float height, totalHeight = 0;
        int numProcessed = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the height of student "+
                (numProcessed+1)+" (-1 to exit): ");
        height = input.nextFloat();

        while(height != -1){
            totalHeight += height;
            numProcessed = numProcessed+1;

            System.out.print("Please enter the height of student "+
                    (numProcessed+1)+" (-1 to exit): ");
            height = input.nextFloat();
        }
        if (numProcessed != 0){
            System.out.println("\n\nThe number of students processed is " + numProcessed +
                "\nThe average height of the students is " +
                String.format("%.2f",totalHeight/numProcessed) + " m");
        }
        else {
            System.out.println("\n\nYou entered no student heights at all ... exiting program now");
        }

        double avg = totalHeight/numProcessed;
        System.out.printf("\n\nThe number of students processed is " + numProcessed +
                "\nThe average height of the students is %.2f m",avg);
    }
}
