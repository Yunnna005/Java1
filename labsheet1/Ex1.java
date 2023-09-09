package labsheet1;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {

        String type1, type2;
        int num1, num2;
        double price1, price2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter type of the first investment: ");
        type1 = input.nextLine();
        System.out.print("Enter number of shares purchased: ");
        num1 = input.nextInt();
        System.out.print("Enter share price: ");
        price1 = input.nextDouble();

        input.nextLine();

        System.out.print("Enter type of the first investment: ");
        type2 = input.nextLine();
        System.out.print("Enter number of shares purchased: ");
        num2 = input.nextInt();
        System.out.print("Enter share price: ");
        price2 = input.nextDouble();

        System.out.println("\n\n\t\t=============================="+
                "\n\t\t\tInvestment Details\n"+
                "\t\t==============================\n");

        System.out.println(String.format("%-20s%-10s%s\n%-20s%-10s%s",
                "Investment Type","# Shares","Share Price",
                "---------------","--------","-----------"));
        System.out.println(String.format("%-20s%-10d%.4f\n%-20s%-10d%.4f",
                type1, num1, price1, type2, num2,price2));

    }
}
