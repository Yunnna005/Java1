package PS4;

import java.awt.*;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class PS4 {
    private static final String EMPTY_SQUARE = "\u2B1C";
    private static final String DOWN_TRIANGLE = "\u2BC6";
    private static final String UP_TRIANGLE = "\u2BC5";
    private static final String HUMAN_PLAYER = "\u23F9";
    private static final String COMPUTER_PLAYER = "\u23FA";

    private static String[] board = new String[100];
    private static int humanPosition = 0;
    private static int computerPosition = 0;
    private static int round = 1;
    private static boolean gameOn = true;

    public static void main(String[] args) {
        generateInitialBoard();

        JTextArea textArea = new JTextArea(10, 10);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
        JScrollPane scrollPane = new JScrollPane(textArea);

        JFrame frame = new JFrame("Snakes and Ladders Game");
        frame.add(scrollPane);
        frame.setSize(410, 370);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JOptionPane.showMessageDialog(frame, "Welcome to Snakes & Ladders!\n"
                + "Human Player: " + HUMAN_PLAYER + "\n"
                + "Computer Player: " + COMPUTER_PLAYER);

        do {
            humanPosition = diceRoll("Human", round, humanPosition);
            if (humanPosition >= 100) {
                gameOn = false;
                break;
            }

            computerPosition = diceRoll("Computer", round, computerPosition);
            if (computerPosition >= 100) {
                gameOn = false;
                break;
            }

            displayBoard(textArea);
            round++;
        } while (gameOn);

        String winner = (humanPosition >= 100) ? "Human" : "Computer";
        JOptionPane.showMessageDialog(frame, "Game Over!\nWinner: " + winner);
        System.exit(0);
    }

    private static void generateInitialBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = EMPTY_SQUARE;
        }

        int[] downTriangles = { 7, 19, 22, 27, 30, 41, 52, 59, 66, 73, 80, 85, 89 };
        int[] upTriangles = { 11, 16, 23, 33, 38, 50, 57, 68, 75, 84, 89, 92, 98 };

        for (int position : downTriangles) {
            board[position] = DOWN_TRIANGLE;
        }

        for (int position : upTriangles) {
            board[position] = UP_TRIANGLE;
        }
    }

    private static void displayBoard(JTextArea textArea) {
        StringBuilder boardText = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int index = i * 10 + j;
                boardText.append(String.format("%-3s", board[index]));
            }
            boardText.append("\n");
        }
        textArea.setText(boardText.toString());
    }

    private static int diceRoll(String playerType, int round, int currentPosition) {
        JOptionPane.showMessageDialog(null, playerType + "'s turn (Round " + round + ")");
        JOptionPane.showMessageDialog(null, "Press OK to roll the dice...");

        Random random = new Random();
        int diceRoll = random.nextInt(11) + 2; // Random number between 2 and 12
        JOptionPane.showMessageDialog(null, playerType + " rolled a " + diceRoll);

        // Update the position
        currentPosition += diceRoll;

        // Check for triangles
        while (currentPosition <= 100 && board[currentPosition - 1].equals(DOWN_TRIANGLE)) {
            currentPosition += 10;
        }
        while (currentPosition <= 100 && board[currentPosition - 1].equals(UP_TRIANGLE)) {
            currentPosition -= 10;
        }

        // Update the board
        board[currentPosition - 1] = (playerType.equals("Human")) ? HUMAN_PLAYER : COMPUTER_PLAYER;

        return currentPosition;
    }
}


