package labsheet2;

import java.util.Scanner;
import java.lang.Math;

public class Ex6 {//
    public static void main(String[] args) {
        String num;
        char choice;
        double result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5-digit positive whole number: ");
        num = input.nextLine();
        if (num.length()==5){

            int num1 = Integer.parseInt(num);

            System.out.println("\n\n\t1.Determine 1.25% of the number\n\t"+
                    "2.Determine if the number exceeds 50000 and contains all the same digits\n\t"+
                    "3.Determine if the number is odd or even\n\t"+
                    "4.Determine the first digit in the number\n\n");
            System.out.print("Enter your choice: ");
            choice = input.next().charAt(0);

            switch (choice){
                case '1':
                    result = Math.round(num1*1.25/100);
                    System.out.print("\n\n1.25% of the number entered is "+String.format("%.0f",result));
                    break;
                case '2':
                    //check each charecter using charAt
                    char c1 = num.charAt(0);
                    char c2 = num.charAt(1);
                    char c3 = num.charAt(2);
                    char c4 = num.charAt(3);
                    char c5 = num.charAt(4);
                    if (c1 == c2 && c2 == c3 && c3 == c4 && c4 == c5 && num1 > 50000){
                        System.out.println("\n\nThe number exceed 50000 and contain all same digits");
                    }
                    else{
                        System.out.println("\n\nThe number does not exceed 50000 and contain all same digits");
                    }
                    break;
                case '3':
                    if (num1%2 == 0){
                        System.out.println("\n\nThe number is even");
                    }
                    else{
                        System.out.println("\n\nThe number is odd");
                    }
                    break;
                case '4':
                    char c6 = num.charAt(0);
                    System.out.println("\n\nThe first digit of the entered number is "+c6);
                    break;
            }
        }
        else{
            System.out.println("\n\nYou have not entered a valid 5 digit number");
        }
    }
}
