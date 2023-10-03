package PS4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ProblemS4 {
    public static final String unfilled_square = "\u2B1C";
    public static final String downward_triangle = "\u2BC6";
    public static final String upward_triangle = "\u2BC5";
    public static final String computer = "\u23F9";
    public static final String user = "\u23FA";
    public static String[] board = new String[100];

    public static int humanPosition = 0, computerPosition = 0, round = 1;
    public static boolean gameOn = true;
    public static void main(String[] args) {
        generateInitialBoard();

        JTextArea textArea = new JTextArea(10,10);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));

        JFrame frame = new JFrame("Snakes & Ladders");
        frame.setSize(410, 370);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        JOptionPane.showMessageDialog(null, "On the game-board the human player will have the symbol "+
                user+" while the computer player will have the symbol "+
                computer);

        do {
            humanPosition = diceRoll("Human", round, humanPosition);
            if (humanPosition >= 100){
                gameOn = false;
                break;
            }

            computerPosition = diceRoll("Computer", round,computerPosition);
            if (computerPosition >= 100){
                gameOn = false;
                break;
            }

            displayBoard(textArea);
            round++;
        }while (gameOn);

        String winner = (humanPosition >= 100) ? "Human" : "Computer";
        JOptionPane.showMessageDialog(null, "The game is over and the winner was "+winner, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void generateInitialBoard(){
        for (int i = 0; i<board.length; i++){
            board[i] = unfilled_square;
        }

        int[] dTriangle = {7, 19, 22, 27, 30, 41, 52, 59, 66, 73, 80, 85, 89};
        int[] uTriangle = {11, 16, 23, 33, 38, 50, 57, 68, 75, 84, 89, 92, 98};

        for(int j : dTriangle){
            board[j] = downward_triangle;
        }

        for (int j : uTriangle){
            board[j] = upward_triangle;
        }
    }

    public static void displayBoard(JTextArea textArea){
        StringBuilder boardText = new StringBuilder();
        for (int i = 0; i<10;i++){
            for (int j = 0; j<10; j++){
                int index = i * 10 + j;
                boardText.append(String.format("%-3s", board[index]));
            }
            boardText.append("\n");
        }
        textArea.setText(boardText.toString());
    }

    public static int diceRoll(String playerType, int round, int currentPosition){
        JOptionPane.showMessageDialog(null, playerType+"'s turn (Round "+round+")"+
                "\n\nThrow the dice to generate a number between 2 and 12 inclusive", "Dice Throw", JOptionPane.INFORMATION_MESSAGE);

        Random random = new Random();
        int diceRoll = random.nextInt(11)+2;
        JOptionPane.showMessageDialog(null, playerType+
                " rolled a "+ diceRoll, "Result of Throw", JOptionPane.INFORMATION_MESSAGE);

        currentPosition += diceRoll;

        while (currentPosition <= 100 && board[currentPosition - 1].equals(downward_triangle)){
            currentPosition += 10;
        }
        while (currentPosition <=100 && board[currentPosition - 1].equals(upward_triangle)){
            currentPosition -= 10;
        }

        board[currentPosition - 1] = (playerType.equals("Human")) ? user : computer;
        return currentPosition;
    }
}
