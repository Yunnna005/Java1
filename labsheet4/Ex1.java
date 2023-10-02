package labsheet4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {//

        // Right code -> Ex1_4

        Scanner input = new Scanner(System.in);

        String line = "=".repeat(10);
        int enteredChoice;
        double enteredInch, enteredMetres, feet;

        do {
            System.out.println("\t\t"+line+"Length Converter"+line+"\n\n"+
                    "\t\t1. Convert Inches to Feet and Inches\n\t\t"+
                    "2. Convert Metres to Feet\n\t\t"+
                    "3. Quit\n\t\t");
            System.out.print("Enter your Choice: ");
            enteredChoice = input.nextInt();

            if (enteredChoice == 1){
                System.out.print("\n\nEnter a quantity in inches: ");
                enteredInch = input.nextDouble();
                while (enteredInch<0){
                    System.out.printf("\nInvalid! Must be at least 0. Re-enter:");
                    enteredInch = input.nextDouble();
                }
                if (enteredInch>0) {
                    feet = enteredInch/12;
                    double remainingInches = enteredInch%12;

                    System.out.println(enteredInch+" inches is equivalent to "+
                            feet+" feet "+remainingInches+" inches");
                }
            } else if (enteredChoice == 2) {
                System.out.print("\n\nEnter a quantity in metres: ");
                enteredMetres = input.nextDouble();

                feet = enteredMetres*3.28084;
                System.out.print(enteredMetres+" meters is "+feet+ " feet");
            } else {
                System.out.print("Invalid! Must be 1, 2 or 3. Re-enter: ");
                enteredChoice = input.nextInt();
            }

        } while (enteredChoice != 3);
        System.out.print("\n\nThanks for using this program.");
    }
}
