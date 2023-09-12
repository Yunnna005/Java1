package labsheet2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        final double G = 6.67428E-11;
        final double pi = 3.142;
        double rPlanet;
        double pPlanet;
        double mass;
        double seconds;

        String line = "-".repeat(14);
        System.out.println("\t"+line+"Sun Mass Calculator"+line+"\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of the planet's orbit around the sun: ");
        rPlanet = input.nextDouble();
        if (rPlanet > 0){
            System.out.print("Please enter the period of rotation for the planet in days: ");
            pPlanet = input.nextDouble();
            if (pPlanet > 0){

                seconds = pPlanet*24* 3_600;
                mass = 4*pi*pi*rPlanet*rPlanet*rPlanet/G*pPlanet*pPlanet;

                System.out.printf("\n\nThere are "+seconds+" seconds"+" in "+pPlanet+" days");
                System.out.println("\nThe approximate mass of the sun is "+mass);
            }
            else {
                System.out.println("\nError! The period of rotation must be positive.");
            }
        }
        else {
            System.out.println("\nError! The radios of the orbit must be positive.");
        }
    }
}
