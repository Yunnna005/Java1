package PS5;

import javax.swing.*;
import java.awt.*;

public class a {
    public static void main(String[] args) {

        String[] grid = new String[81];

        int[] solution =
                {4, 3, 5, 2, 6, 9, 7, 8, 1,
                        6, 8, 2, 5, 7, 1, 4, 9, 3,
                        1, 9, 7, 8, 3, 4, 5, 6, 2,
                        8, 2, 6, 1, 9, 5, 3, 4, 7,
                        3, 7, 4, 6, 8, 2, 9, 1, 5,
                        9, 5, 1, 7, 4, 3, 6, 2, 8,
                        5, 1, 9, 3, 2, 6, 8, 7, 4,
                        2, 4, 8, 9, 5, 7, 1, 3, 6,
                        7, 6, 3, 4, 1, 8, 2, 5, 9};

        String guess, message;

        JOptionPane.showMessageDialog(null, "Welcome to the Game of Sudoku - use your logic to fill in the gaps!"
                , "Welcome to the Game", JOptionPane.INFORMATION_MESSAGE);

        generateInitialGrid(grid);

        int round = 36; //player is given 36 numbers to start off with here

        do {

            displayGrid(grid);

            guess = JOptionPane.showInputDialog("Please enter your guess in the form CR N where\n\n\n" +
                    "C is the column value, from A to I" +
                    "\nR is the row value, from 1 to 9" +
                    "\nN is the number value, from 1 to 9\n");

            message = isValidGuess(guess, solution, grid);

            while (!message.equals("valid")) {

                guess = JOptionPane.showInputDialog("Invalid input! " + message +
                        "\n\n\nPlease enter your guess in the form CR N where\n\n\n" +
                        "C is the column value, from A to I" +
                        "\nR is the row value, from 1 to 9" +
                        "\nN is the number value, from 1 to 9\n");
                message = isValidGuess(guess, solution, grid);
            }

            round++;

        } while (round <= 80);

        displayGrid(grid);

        JOptionPane.showMessageDialog(null, "Congratulations, you have completed the puzzle!", "Game Over!",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }


    public static void generateInitialGrid(String[] grid) {

        for (int i = 0; i < grid.length; i++) {

            grid[i] = "\u2B1C";
        }

        grid[3] = "2"; grid[4] = "6"; grid[6] = "7"; grid[8] = "1";
        grid[9] = "6"; grid[10] = "8"; grid[13] = "7"; grid[16] = "9";
        grid[18] = "1"; grid[19] = "9"; grid[23] = "4"; grid[24] = "5";
        grid[27] = "8"; grid[28] = "2"; grid[30] = "1"; grid[34] = "4";
        grid[38] = "4"; grid[39] = "6"; grid[41] = "2"; grid[42] = "9";
        grid[46] = "5"; grid[50] = "3"; grid[52] = "2"; grid[53] = "8";
        grid[56] = "9"; grid[57] = "3"; grid[61] = "7"; grid[62] = "4";
        grid[64] = "4"; grid[67] = "5"; grid[70] = "3"; grid[71] = "6";
        grid[72] = "7"; grid[74] = "3"; grid[76] = "1"; grid[77] = "8";
    }

    public static void displayGrid(String[] grid) {

        JTextArea textArea = new JTextArea();

        textArea.setFont(new Font("Courier New", Font.BOLD, 20));

        String textAreaData = "";

        for (int i = 0; i < grid.length; i++) {

            textAreaData += String.format("%-3s", grid[i]);

            if ((i + 1) % 9 == 0)
                textAreaData += "\n\n";
        }

        textArea.setText(textAreaData);

        JOptionPane.showMessageDialog(null, textArea, "Sudoku Game", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String isValidGuess(String guess, int[] solution, String[] grid) {

        if (guess == null || guess.length() != 4)
            return "The input must have exactly 4 characters";

        char lowerCaseFirstCharacter = Character.toLowerCase(guess.charAt(0));

        if (lowerCaseFirstCharacter < 'a' || lowerCaseFirstCharacter > 'i')
            return "The column value must be between A and I inclusive";

        if (guess.charAt(1) < '1' || guess.charAt(1) > '9')
            return "The row value must be between 1 and 9 inclusive";

        if (guess.charAt(2) != ' ')
            return "The 3rd character must be a space";

        if (guess.charAt(3) < '1' || guess.charAt(3) > '9')
            return "The number value must be between 1 and 9 inclusive";

        int row = Character.getNumericValue(guess.charAt(1));
        int column = lowerCaseFirstCharacter;

        int mappedSlot = (row - 1) * 9 + column;

        if (!grid[mappedSlot - 1].equals("\u2B1C"))
            return "The grid already has a number in this cell";

        int number = Character.getNumericValue(guess.charAt(3));

        if (solution[mappedSlot - 1] != number)
            return "The number you entered is incorrect";

        grid[mappedSlot - 1] = String.valueOf(number);

        return "valid";
    }
}

