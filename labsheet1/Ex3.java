package labsheet1;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {//

        int ounces;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of ounces: ");
        ounces = input.nextInt();


        int pound = ounces/16;
        int ostatok = ounces%16;

        System.out.println("\n"+ounces+"lbs is equivalent to "+pound+"ibl "+
                ostatok+"oz");
    }
}
