package PS5;

import javax.swing.*;
import java.awt.*;

public class practice {
    public static void main(String[] args) {
        String[] grid = new String[81];
        String input, valid;
        int round = 36;

        int[] solution = {4, 3, 5, 2, 6, 9, 7, 8, 1,
                6, 8, 2, 5, 7, 1, 4, 9, 3,
                1, 9, 7, 8, 3, 4, 5, 6, 2,
                8, 2, 6, 1, 9, 5, 3, 4, 7,
                3, 7, 4, 6, 8, 2, 9, 1, 5,
                9, 5, 1, 7, 4, 3, 6, 2, 8,
                5, 1, 9, 3, 2, 6, 8, 7, 4,
                2, 4, 8, 9, 5, 7, 1, 3, 6,
                7, 6, 3, 4, 1, 8, 2, 5, 9 };

        generateInitialGrid(grid);

        do {
            displayGrid(grid);
            input = JOptionPane.showInputDialog("Enter your guess CR N\n\n\n"+
                    "C - column\nR - row\nN - number\n");
            valid = isValid(input, grid, solution);

            while(!(valid.equals("valid"))){
                JOptionPane.showInputDialog("Invalid input! " + valid +
                        "\n\n\nPlease enter your guess in the form CR N where\n\n\n" +
                        "C is the column value, from A to I" +
                        "\nR is the row value, from 1 to 9" +
                        "\nN is the number value, from 1 to 9\n");
                valid = isValid(input, grid, solution);


            }

            round ++;
        }while (round <81);

    }
    public static void generateInitialGrid(String[] grid){
        for (int i =0; i< grid.length; i++){
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
    public static void displayGrid(String[] grid){
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Courier New", Font.BOLD, 20));
        String textAreaData = "";
        for (int i = 0; i<grid.length; i++){
            textAreaData += String.format("%-3s", grid[i]);
            if ((i+1)%9 == 0){
                textAreaData += "\n\n";
            }
        }
        textArea.setText(textAreaData);
        JOptionPane.showMessageDialog(null, textArea, "Sudoku Game", JOptionPane.INFORMATION_MESSAGE);
    }
    public static String isValid(String input, String[] grid, int[] solution){
        if (input.length() != 4 || input == null){
            return "The input must have exactly 4 characters";
        }

        char column = Character.toLowerCase(input.charAt(0));
        if (column<'a'||column>'i'){
            return "The column value must be between A and I inclusive";
        }

        if (input.charAt(1) <'1' || input.charAt(1) >'9'){
            return "The row value must be between 1 and 9 inclusive";
        }

        if (input.charAt(2) != ' '){
            return "The 3rd character must be a space";
        }

        int number = Character.getNumericValue(input.charAt(3));
        if (input.charAt(3)<'1' || input.charAt(3)>'9'){
            return "The number value must be between 1 and 9 inclusive";
        }

        int columnInt = column-96;
        int row = Character.getNumericValue(input.charAt(1));
//        int index = (row-1)*9+columnInt;
        int index = (row-1)*9+columnInt;
        if (!(grid[index-1].equals("\u2B1C"))){
            return "The grid already has a number in this cell";
        }

        if (solution[index-1] != number){
            return "The number you entered is incorrect";
        }
        grid[index - 1] = String.valueOf(number);
        return "valid";
    }
}
