package labsheet2;

import java.util.Scanner;

public class Ex5 {//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        String enter;

        System.out.print("Please enter a single keyboard character: ");
        input = scanner.nextLine();
        if (input.length()==1){
            char character = input.charAt(0);
            if (Character.isUpperCase(character)){
                System.out.println("\n It's Uppercase letter");
            }
            else if (Character.isLowerCase(character)){
                System.out.println("\n It's Lowercase letter");
            }
            else if (Character.isDigit(character)){
                System.out.println("\n It's Digit");
            }
            else if (character == '£' || character == '$' || character == '€'){
                System.out.println("\n It's currency symbol");
            }
            else if (character == '“' || character == '‘' || character == '!'||
                    character == '?' || character == '.' || character == ','||
                    character == ':'|| character == ';'){
                System.out.println("\n It's punctuation symbol");
            }
            else if (Character.isWhitespace(character)){
                System.out.println("\n It's whitespace character");
            }
            else{
                System.out.println("\nUnidentified");
            }
        }
        else {
            System.out.println("\nError! The value entered must contain exactly one character");
        }
        scanner.close();
    }
}
