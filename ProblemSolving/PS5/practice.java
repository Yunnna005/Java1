package PS5;

import javax.swing.*;
import java.awt.*;

public class practice {
    public static void main(String[] args) {
        String[] grid = new String[81];

        String input, valid;

        generateInitialGrid(grid);
        displayGrid(grid);

        do {
            input = JOptionPane.showInputDialog("Enter yoour guess CR N: "+
                    "\n\n\nC is the column\nR is the row\n N is the number");
            valid = isValid(input);
        }
    }
    public static void generateInitialGrid(String[] grid){
        for (int i = 0; i<grid.length; i++){
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

        String textAreaText = "";
        for (int i = 0; i<grid.length; i++){
            textAreaText += String.format("%-3s",grid[i]);

            if ((i+1)%9 == 0){
                textAreaText += "\n\n";
            }
        }
        textArea.setText(textAreaText);
        JOptionPane.showMessageDialog(null,textArea, "Sudoku Game", JOptionPane.INFORMATION_MESSAGE);
    }
    public static String isValid(String input){
        if (!(input.length() == 4 || input.isBlank())){
            return "The input must have exactly 4 characters";
        }

        char lowerCaseInput = Character.toLowerCase(input.charAt(0));
        if (lowerCaseInput < 'a' || lowerCaseInput > 'i'){
            return "The column value must be between A and I inclusive";
        }

        if (input.charAt(1)<1||input.charAt(1)>9){
            return "The row value must be between 1 and 9 inclusive";
        }

        if (input.charAt(2) == ' '){
            return "The 3rd character must be a space";
        }

        if (input.charAt(3)<1 || input.charAt(3)>9){
            return "The number value must be between 1 and 9 inclusive";
        }


    }
}
