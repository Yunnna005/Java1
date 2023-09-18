package labsheet3;
import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read in the sentence from the user
        System.out.print("Enter a sentence terminated with a full-stop or exclamation mark: ");
        String inputSentence = input.nextLine();
        //input.close();

        // Remove the sentinel value and convert to lowercase for case-insensitive comparison
        inputSentence = inputSentence.replace(".", "").replace("!", "").toLowerCase();

        int totalCharacters = inputSentence.length();
        int vowelCount = 0;
        int digitCount = 0;
        int oddNumberCount = 0;
        int consecutiveCount = 0;

        for (int i = 0; i < totalCharacters; i++) {
            char currentChar = inputSentence.charAt(i);

            // Check if the character is a vowel
            if ("aeiou".contains(String.valueOf(currentChar))) {
                vowelCount++;
            }

            // Check if the character is a digit
            if (Character.isDigit(currentChar)) {
                digitCount++;

                // Check if the digit is odd
                int digitValue = Character.getNumericValue(currentChar);
                if (digitValue % 2 != 0) {
                    oddNumberCount++;
                }
            }

            // Check for consecutive characters
            if (i > 0 && currentChar == inputSentence.charAt(i - 1)) {
                consecutiveCount++;
            }
        }

        // Display the results
        System.out.println("Total number of characters: " + totalCharacters);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of odd digits: " + oddNumberCount);
        System.out.println("Number of consecutive characters: " + consecutiveCount);
    }
}
