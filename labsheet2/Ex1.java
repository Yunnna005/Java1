package labsheet2;

import java.util.Scanner;
import java.lang.Math;

public class Ex1 {//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double v;
        double r1;
        double r2;

        String line = "*".repeat(9);
        System.out.println(line+"Current Calculator"+line+"\n\n");
        System.out.print("Enter the voltage: ");
        v = input.nextDouble();

        if (v < 0) {
            System.out.println("\nError!");
        }
        if (v > 0){
            System.out.print("Enter the first resistance: ");
            r1 = input.nextDouble();
            System.out.print("Enter the second resistance: ");
            r2 = input.nextDouble();
            double l = v*(1/r1+1/r2);
            l = Math.ceil(l);
            System.out.printf("\nThe total current flowing in the circuit is %.0f Amps",
                    l);
        }
    }
}
