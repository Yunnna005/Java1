package PS4;

import javax.swing.*;
import java.awt.*;
public class C2 {
    public static void main(String[] args) {

        String[] board = new String[100];

        String winner = "";

        boolean gameOn = true;

        int round = 1, playerPosition = 0, computerPosition = 0;


        generateInitialBoard(board);
        displayBoard(board);
        JOptionPane.showMessageDialog(null, "On the game-board the human player will have the symbol \u23F9" +
                        " while the computer player will have the symbol \u23FA"
                , "Welcome to the Game", JOptionPane.INFORMATION_MESSAGE);

        do {

            playerPosition = diceRoll("human", round, playerPosition, board);

            computerPosition = diceRoll("computer", round, computerPosition, board);

            if (playerPosition >= 100 || computerPosition >= 100) {

                if (playerPosition >= 100)
                    winner = "human";
                else
                    winner = "computer";

                gameOn = false;
            }

            displayBoard(board);

            generateInitialBoard(board);

            round++;

        } while (gameOn);

        JOptionPane.showMessageDialog(null, "The game is over and the winner was the " + winner, "Result",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }


    public static void generateInitialBoard(String[] board) {

        for (int i = 0; i < board.length; i++) {

            board[i] = "\u2B1C";
        }

        board[7] = board[19] = board[22] = board[27] = board[30] =
                board[41] = board[52] = board[59] = board[66] = board[73] =
                        board[80] = board[85] = "\u2BC6";

        board[11] = board[16] = board[23] = board[33] =
                board[38] = board[50] = board[57] = board[68] = board[75] =
                        board[84] = board[89] = board[92] = board[98] = "\u2BC5";

    }

    public static void displayBoard(String[] board) {

        JTextArea textArea = new JTextArea();

        textArea.setFont(new Font("monospaced", Font.PLAIN, 20));

        String textAreaData = "";

        for (int i = 0; i < board.length; i++) {

            textAreaData += String.format("%-3s", board[i]);

            if ((i + 1) % 10 == 0)
                textAreaData += "\n";
        }

        textArea.setText(textAreaData);

        JOptionPane.showMessageDialog(null, textArea, "Game Board", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int diceRoll(String player, int round, int currentPosition, String[] board) {

        JOptionPane.showMessageDialog(null, "Round " + round + " - " + player + "'s turn\n\n" +
                "Throw the dice to generate a number between 2 and 12 inclusive", "Dice Throw", JOptionPane.INFORMATION_MESSAGE);

        int diceRoll = (int) (Math.random() * 11) + 2;

        JOptionPane.showMessageDialog(null, "You rolled a " + diceRoll, "Result of Throw",
                JOptionPane.INFORMATION_MESSAGE);

        currentPosition += diceRoll;

        //in this version of the game it is not possible for this while loop to execute more than
        //once given the positions of the down triangles but no harm in keeping it general in case
        //it was decided to add a few more in the future or alter the current positions

        while (currentPosition < 100 && board[currentPosition - 1].equals("\u2BC6"))
            currentPosition += 10;

        //this while loop can execute more than once, if the player lands on cell 34

        while (currentPosition < 100 && board[currentPosition - 1].equals("\u2BC5"))
            currentPosition -= 10;

        if (currentPosition < 100 && player.equals("human"))
            board[currentPosition - 1] = "\u23F9";
        else if (currentPosition >= 100 && player.equals("human"))
            board[99] = "\u23F9";
        else if (currentPosition < 100 && player.equals("computer"))
            board[currentPosition - 1] = "\u23FA";
        else
            board[99] = "\u23FA";

        return currentPosition;
    }
}

