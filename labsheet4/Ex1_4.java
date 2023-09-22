package labsheet4;

import java.util.Scanner;
public class Ex1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enteredChoice;
        double enteredInch, enteredMetres, feet;

        do {
            System.out.println("\t\t============== Length Converter ==============\n\n" +
                    "\t\t1. Convert Inches to Feet and Inches\n\t\t" +
                    "2. Convert Metres to Feet\n\t\t" +
                    "3. Quit\n\t\t");
            System.out.print("Enter your Choice: ");

            while (!input.hasNextInt()) {
                System.out.print("Invalid! Must be 1, 2, or 3. Re-enter: ");
                input.next(); // Clear the invalid input
            }

            enteredChoice = input.nextInt();
            input.nextLine(); // Consume the newline

            switch (enteredChoice) {
                case 1:
                    System.out.print("\nEnter a quantity in inches: ");

                    while (!input.hasNextDouble()) {
                        System.out.print("Invalid! Must be a number. Re-enter: ");
                        input.next(); // Clear the invalid input
                    }

                    enteredInch = input.nextDouble();

                    while (enteredInch < 0) {
                        System.out.print("Invalid! Must be at least 0. Re-enter: ");
                        enteredInch = input.nextDouble();
                    }

                    feet = enteredInch / 12;
                    double remainingInches = enteredInch % 12;

                    System.out.println(enteredInch + " inches is equivalent to " +
                            (int) feet + " feet " + remainingInches + " inches");
                    break;

                case 2:
                    System.out.print("\nEnter a quantity in metres: ");

                    while (!input.hasNextDouble()) {
                        System.out.print("Invalid! Must be a number. Re-enter: ");
                        input.next(); // Clear the invalid input
                    }

                    enteredMetres = input.nextDouble();
                    feet = enteredMetres * 3.281;

                    System.out.println(enteredMetres + " meters is " + feet + " feet");
                    break;

                case 3:
                    System.out.println("\nThanks for using this program.");
                    break;

                default:
                    System.out.print("Invalid! Must be 1, 2, or 3. Re-enter: ");
                    break;
            }
            input.nextLine(); // Consume the newline

        } while (enteredChoice != 3);
    }
}
