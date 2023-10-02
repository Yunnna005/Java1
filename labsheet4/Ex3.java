package labsheet4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {//
        Scanner input = new Scanner(System.in);

        int enteredNum, times;

        System.out.print("What number do you wish to display the times-table for? ");
        enteredNum = input.nextInt();
        while (!(enteredNum >= 1 && enteredNum<=12)){
            System.out.print("Invalid. Re-enter: ");
            enteredNum = input.nextInt();
        }
        String line = "=".repeat(5);
        System.out.println("\n"+line+"The "+enteredNum+" times table"+line);
        for (int i = 0; i<=12; i++){
            times = enteredNum*i;
            System.out.print(enteredNum+" times "+i+" is "+times+"\n");

        }
    }
}
