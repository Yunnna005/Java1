package PS5;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class ps5 {
    public static void main(String[] args) {
        Boolean gameOn = true;
        String input,valid;

        String[] grid = new String[81];
        String[] solution = {"4", "3", "5","2","6","9", "7"," 8", "1",
                "6"," 8", "2", "5", "7", "1", "4", "9", "3",
                "1", "9", "7", "8", "3", "4", "5", "6", "2",
                "8", "2", "6", "1", "9", "5", "3", "4", "7",
                "3", "7", "4", "6", "8", "2", "9", "1", "5",
                "9", "5", "1", "7", "4", "3", "6", "2", "8",
                "5", "1", "9", "3", "2", "6", "8", "7", "4",
                "2", "4", "8", "9"," 5", "7", "1", "3", "6",
                "7"," 6", "3", "4", "1", "8", "2", "5", "9" };
        generateInitialGrid(grid);
        displayGrid(grid);



        do {
            input = JOptionPane.showInputDialog("Enter your guess:\n\n\nC is the column value, from A to I"+
                    "\nR is the row value, from 1 to 9\n N is the number value, from 1 to 9\n");
            char numberChar = input.charAt(3);

            valid = isValid(input, grid, solution);

            if (valid.equals("valid")){
                int index = findIndex(input);

                grid[index] = String.valueOf(numberChar);
                displayGrid(grid);

            }else{
                while(!valid.equals("valid")){
                    input =JOptionPane.showInputDialog("Invalid value! "+valid+"\n\nEnter your guess:\n\n\nC is the column value, from A to I"+
                            "\nR is the row value, from 1 to 9\n N is the number value, from 1 to 9\n");
                    valid = isValid(input, grid, solution);
                }
            }

            gameOn = !isGameOver(grid);
        }while (gameOn);

        JOptionPane.showMessageDialog(null, "GG");
    }
    public static void generateInitialGrid(String[] grid){
        for (int i =0; i< grid.length;i++){
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
    public static void  displayGrid(String[] grid) {
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Courier New",Font.BOLD, 20));
        String textAreaData = "";


        for (int i = 0; i< grid.length; i++){
            textAreaData += String.format("%-3s",grid[i]+"  ");

            if ((i+1)%9 == 0){
                textAreaData += "\n\n";
            }
        }
        textArea.setSize(100,100);
        textArea.setText(textAreaData);
        JOptionPane.showMessageDialog(null,textArea, "Sudoku Game", JOptionPane.INFORMATION_MESSAGE);
    }
    public static String isValid(String input, String[] grid, String[] solution){
        if (input.length() != 4){
            return "The input must have 4 chars";
        }

        char columnChar = input.charAt(0);
        char rowChar = input.charAt(1);
        char numberChar = input.charAt(3);

        if (!("ABCDEFGHI".contains(String.valueOf(columnChar)))) {
            return "The column value must be between A and I";
        }

        int row = Character.getNumericValue(rowChar);
        if (row < 1 || row > 9) {
            return "The row value must be between 1 and 9";
        }

        if (!(input.charAt(2) == ' ')) {
            return "The 3rd character must be a space";
        }

        int number = Character.getNumericValue(numberChar);
        if (number<1 || number>9){
            return "The number value must be between 1 and 9";
        }

        int index = findIndex(input);

        if (index >= 0 && index < 81 && (!grid[index].equals("\u2B1C")) ) {
            return "The grid already has a number in that cell";
        }

//        for (int i =0; i<solution.length; i++){
//            if (!(solution[i].equals(index))){
//                return "The number you entered is incorrect";
//            }
//        }
        if (!(solution[index].equals(numberChar+""))) return "The number you entered is incorrect";
        return "valid";
    }

    public static int findIndex(String input){
        char columnChar = input.charAt(0);
        char rowChar = input.charAt(1);

        int column = columnChar - 'A';

        int row = Character.getNumericValue(rowChar);

        return (row - 1)*9+column;
    }

    public static boolean isGameOver(String[] grid) {
        for (String str :
                grid) {
            if (str.isBlank()) {
                return false;
            }
            }
        return true;
    }
}
