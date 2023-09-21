package labsheet4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String enteredText;
        int textLength;
        char textChar;
        boolean binarNum = true;

        System.out.print("Enter a piece of text: ");
        enteredText = input.nextLine();
        textLength = enteredText.length();

        for (int i = 0; i<textLength; i++){

            textChar = enteredText.charAt(i);

            if (Character.isDigit(textChar) && "10".contains(String.valueOf(textChar))){
                binarNum = true;
            }else{
                binarNum = false;
                break;
            }
        }
        if (binarNum){
            System.out.print("\nYou entered a binary number");
        }else{
            System.out.print("\nYou did not enter a binary number");
        }
    }
}
