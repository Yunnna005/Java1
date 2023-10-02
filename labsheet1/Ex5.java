package labsheet1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {//
        Scanner input = new Scanner(System.in);
        double g = 9.81f;
        double me;
        double re;
        double mp;
        double rp;

        System.out.print("Enter the mass of the planet Earth: ");
        me = input.nextDouble();
        System.out.print("Enter the radius of the Earth: ");
        re = input.nextDouble();
        System.out.print("Enter the mass of the other planet: ");
        mp = input.nextDouble();
        System.out.print("Enter the radius of the other planet: ");
        rp = input.nextDouble();

        double gravity = g*mp*re*re/(me*rp*rp);
        System.out.printf("\n\nThe acceleration due to g on the oth planet is %.2f m/s/s",
                gravity);
    }
}
