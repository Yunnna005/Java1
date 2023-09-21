package labsheet4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int enteredNum;
        int sum = 0;
        System.out.print("Enter number: ");
        enteredNum = input.nextInt();
        for (int i = 1; i<=enteredNum; i++){
            sum += i;

        }
        System.out.println("The sum of the first"+enteredNum+" positive integers is "+ sum);
    }
}
