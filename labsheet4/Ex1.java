package labsheet4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = "=".repeat(10);
        String choice;
        int enteredInch;

        System.out.println("\t\t"+line+"Length Converter"+line+"\n\n"+
                "\t\t1. Convert Inches to Feet and Inches\n\t\t"+
                "2. Convert Metres to Feet\n\t\t"+
                "3. Quit\n\t\t");
        System.out.print("Enter your Choice: ");
        choice = input.nextLine();
        while (!(choice.equals('3'))){
            int choiceInt = Integer.getInteger(choice);
            switch (choiceInt){
                case 1:
                    System.out.print("\n\nEnter a quantity in inches: ");
                    enteredInch = input.nextInt();
                    if (Character.isDigit(enteredInch)){

                    }
            }
        }
    }
}
