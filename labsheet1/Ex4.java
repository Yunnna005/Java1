package labsheet1;

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double temp;
        double num;
        double pressure;

        String line = "=".repeat(8);
        System.out.println(line+"Volume Calculator"+line+"\n\n");
        System.out.print("Enter the temp of the gas: ");
        temp = input.nextDouble();
        System.out.print("Enter the num of the moles of the gas: ");
        num = input.nextDouble();
        System.out.print("Enter the pres of the gas: ");
        pressure = input.nextDouble();

        double volume = num*8.3145*temp/pressure;
        System.out.printf("\n\nThe volume of the gas is %.3f m³", volume);
    }
}
