package labsheet3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text;
        int totalCharacters;
        int letters = 0;
        int symbols = 0;
        int digits =0;
        

        System.out.println("Enter your line of text: \n");
        text = input.nextLine();

        String line = "=".repeat(35);
        System.out.println("\n\n\n"+line+"\n\tLexical Analysis of Your Text\n"+line+"\n");

        totalCharacters = text.length();
        for (int i = 0; i< totalCharacters; i++){
            char currentChar = text.charAt(i);

            if(Character.isDigit(currentChar)){
                digits++;
            } 
            else if(Character.isLetter(currentChar)){
                letters++;
            }
            else {
                symbols++;
            }
        }

        int words = text.split(" ").length;
        int sentence = text.split("[.!?]").length;

        System.out.println("Characters: " + totalCharacters);
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Words: "+ words);
        System.out.println("Sentences: " + sentence);
        System.out.println("Symbols: " + symbols);
    }
}
