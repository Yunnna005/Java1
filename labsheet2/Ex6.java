package labsheet2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int num;
        char choice;
        double result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5-digit positive whole number: ");
        num = input.nextInt();
        System.out.println("\n\n\t1.Determine 1.25% of the number\n\t"+
                "2.Determine if the number exceeds 50000 and contains all the same digits\n\t"+
                "3.Determine if the number is odd or even\n\t"+
                "4.Determine the first digit in the number\n\n");
        System.out.print("Enter your choice: ");
        choice = input.next().charAt(0);
        switch (choice){
            case '1':
                result = num*1.25;
                System.out.printf("\n\n1.25% of the number entered is %.f",result);
            case '2':
                //check each charecter using charAt
                if (num)
        }
    }
}
