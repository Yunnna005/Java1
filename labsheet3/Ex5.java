package labsheet3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String enteredText;
        int totalCharacters;
        int rightNumber = 0, wrongNumber = 0;

        System.out.print("Enter a piece of text: ");
        enteredText = input.nextLine();

        totalCharacters = enteredText.length();

        for (int i = 0;i < totalCharacters; i++){

            char currentChar = enteredText.charAt(i);

            if (Character.isDigit(currentChar)){
                rightNumber ++;
            }else{
                wrongNumber ++;
            }
        }
        if (rightNumber == totalCharacters){
            System.out.println("\nYou entered a positive whole number ");
        }
        else{
            System.out.println("\nYou did not entered a positive whole number ");
        }
    }
}
