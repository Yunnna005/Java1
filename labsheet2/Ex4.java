package labsheet2;

import java.util.Scanner;
public class Ex4 {//
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double usedLiters;
        int allowance = 30000;
        double ratePerLitre = 0.00224;
        double bill2;

        System.out.print("Do you have a private water supply (y or n)?: ");
        char privatSupply = input.next().charAt(0);

        System.out.print("Do you have a septic tank (y or n)?: ");
        char septicTank = input.next().charAt(0);

        if ((privatSupply == 'y') && (septicTank == 'y')){
            System.out.println("\nYou are not a customer of Irish Water so your bill is $0.00");
        }
        else{
            System.out.print("\nDo you have a water meter installed (y or n)?: ");
            char meter = input.next().charAt(0);

            if (meter == 'n'){
                double bill = 212.00;
                System.out.printf("\n\nYou Annual Bill for Irish Water services is "+ bill);
            }
            else if (meter == 'y'){
                System.out.print("\nPlease enter the number of litres used last year: ");
                usedLiters = input.nextDouble();
                bill2 = (usedLiters-allowance)*ratePerLitre;

                System.out.printf("\n\nYou Annual Bill for Irish Water services is %.2f", bill2);
            }
            else {
                System.out.println("Invalid input for meter installation");
            }
        }
        input.close();
        /*String privatW;
        String septicT;
        String waterM;
        double usedLiters;
        double bill = 212.00;
        double bill2;
        double bill3;
        final double charge = 0.224;

        Scanner input = new Scanner(System.in);

        System.out.print("Do you have a private water supply (y or n)?: ");
        privatW = input.nextLine();

        if (privatW.equals("n") || privatW.equals("y")){
            System.out.print("Do you have a septic tank (y or n)?: ");
            septicT = input.nextLine();

            if (septicT.equals("n") || septicT.equals("y")){
                if (privatW.equals("y") && septicT.equals("y")){
                    System.out.println("\nYou are not a customer of Irish Water so your bill is $0.00");
                }
                else {
                    System.out.print("\nDo you have a water meter installed (y or n)?: ");
                    waterM = input.nextLine();

                    if (privatW.equals("y") && septicT.equals("n") && waterM.equals("y")){
                        System.out.print("\nPlease enter the number of litres used last year: ");
                        usedLiters = input.nextDouble();
                        if (usedLiters > 30000){
                            bill2 = (usedLiters-30000)*charge;
                            System.out.printf("\n\nYou Annual Bill for Irish Water services is %.2f", bill2);
                        }
                        else {
                            bill3 = usedLiters * charge;
                            System.out.printf("\n\nYou Annual Bill for Irish Water services is %.2f", bill3);
                        }
                    }
                    else if (privatW.equals("n") && septicT.equals("y") && waterM.equals("n")){
                        System.out.printf("\n\nYou Annual Bill for Irish Water services is "+ bill);
                    }
                    else if (privatW.equals("n") && septicT.equals("y") && waterM.equals("n")){
                        System.out.print("\nPlease enter the number of litres used last year: ");
                        usedLiters = input.nextDouble();
                        if (usedLiters > 30000){
                            bill2 = (usedLiters-30000)*charge;
                            System.out.printf("\n\nYou Annual Bill for Irish Water services is %.2f", bill2);
                        }
                        else {
                            bill3 = usedLiters*charge;
                            System.out.printf("\n\nYou Annual Bill for Irish Water services is %.2f", bill3);
                        }
                    }
                    else if (privatW.equals("n") && septicT.equals("n") && waterM.equals("y")) {
                        System.out.print("\nPlease enter the number of litres used last year: ");
                        usedLiters = input.nextDouble();
                        if (usedLiters > 30000) {
                            bill2 = (usedLiters - 30000) * charge;
                            System.out.printf("\n\nYou Annual Bill for Irish Water services is %.2f", bill2);
                        }
                        else {
                            bill3 = usedLiters * charge;
                            System.out.printf("\n\nYou Annual Bill for Irish Water services is %.2f", bill3);
                        }
                    }
                }
            }
        }*/
    }
}
