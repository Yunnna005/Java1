package labsheet2;

import java.util.Scanner;

public class Switch {//
    public static void main(String[] args) {
        String letterAsString;
        char letter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any letter: ");
        letterAsString = input.nextLine();

        letter = letterAsString.charAt(0);
        switch (letter){ //shorter variant
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("\nLowercase vowel");
                break;
            default:
                System.out.println("\nYou did not enter a lowercase vowel");
            /*case 'a': one variant
                System.out.println("\nLowercase vowel");
                break;
            case 'e':
                System.out.println("\nLowercase vowel");
                break;
            case 'i':
                System.out.println("\nLowercase vowel");
                break;
            case 'o':
                System.out.println("\nLowercase vowel");
                break;
            case 'u':
                System.out.println("\nLowercase vowel");
                break;
            default:
                System.out.println("\nYou did not enter a lowercase vowel");*/
        }
    }

}
