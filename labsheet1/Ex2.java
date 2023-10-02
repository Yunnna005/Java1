package labsheet1;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {//
        String namePlanet;
        int numMoons;
        float speedOrb = 13.07367f;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the planet: ");
        namePlanet = input.nextLine();
        System.out.print("Enter the number of moons of the planet: ");
        numMoons = input.nextInt();

        String line = "+".repeat(27);
        System.out.print("\n\n\t\t"+line+"\n"+
                "\t\t\t\tPlanet Data\n\t\t"+
                "+++++++++++++++++++++++++++\n\n");

        System.out.println(String.format("%-20s%-7s\n%-20s%-7.3f%-4s\n%-20s%-2d",
                "Planet name:",namePlanet,"Orbital Speed:",
                speedOrb,"km/s","Number of Moons:",numMoons));
    }
}


