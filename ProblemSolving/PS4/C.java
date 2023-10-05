package PS4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class C {
    private static char[] board = generateInitialBoard();
    private static char humanSymbol = '\u23F9'; // Human player symbol
    private static char computerSymbol = '\u23FA'; // Computer player symbol
    private static int humanPosition = 0;
    private static int computerPosition = 0;
    private static int round = 1;
    private static JTextArea textArea;
    public static void main(String[] args) {

        JFrame frame = new JFrame("Snakes & Ladders Game");
        frame.setSize(400, 400);

        JPanel panel = new JPanel(new BorderLayout());

        textArea = new JTextArea(10, 10);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);

        displayBoard();
        JOptionPane.showMessageDialog(frame, "Welcome to Snakes & Ladders!\nHuman: " + humanSymbol + ", Computer: " + computerSymbol);

        while (true) {
            if (!playRound()) {
                break;
            }
        }

        frame.dispose();
    }
    private static char[] generateInitialBoard() {
        char[] board = new char[100];
        char emptySquare = '\u2B1C'; // Unfilled square symbol
        char downTriangle = '\u2BC6'; // Filled downward triangle symbol
        char upTriangle = '\u2BC5'; // Filled upward triangle symbol

        for (int i = 0; i < 100; i++) {
            board[i] = emptySquare;
        }

        int[] downTrianglePositions = {8, 20, 23, 28, 31, 42, 53, 60, 67, 74, 81, 86};
        int[] upTrianglePositions = {12, 17, 24, 34, 39, 51, 58, 69, 76, 85, 90, 93, 99};

        for (int position : downTrianglePositions) {
            board[position - 1] = downTriangle;
        }

        for (int position : upTrianglePositions) {
            board[position - 1] = upTriangle;
        }
        return board;
    }
    private static void displayBoard() {
        StringBuilder boardText = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            boardText.append(board[i]).append(" ");
            if ((i + 1) % 10 == 0) {
                boardText.append("\n");
            }
        }
        textArea.setText(boardText.toString());
    }
    private static boolean playRound() {
        humanPosition = diceRoll("Human", round, humanPosition, board, humanSymbol);
        computerPosition = diceRoll("Computer", round, computerPosition, board, computerSymbol);

        if (humanPosition >= 100 || computerPosition >= 100) {
            String winner = (humanPosition >= 100) ? "Human" : "Computer";
            JOptionPane.showMessageDialog(null, "Winner: " + winner);
            return false;
        }

        displayBoard();
        round++;
        return true;
    }
    private static int diceRoll(String playerType, int round, int currentPosition, char[] board, char playerSymbol) {
        Random random = new Random();
        int diceResult = random.nextInt(11) + 2;

        JOptionPane.showMessageDialog(null, playerType + " - Round " + round + "\nRolled a " + diceResult);

        int newPosition = currentPosition + diceResult;

        if (newPosition <= 100) {
            char newPositionSymbol = board[newPosition - 1];
            if (newPositionSymbol == '\u2BC6') {
                newPosition += 10; // Move 10 steps forward for a downward triangle
            } else if (newPositionSymbol == '\u2BC5') {
                newPosition -= 10; // Move 10 steps backward for an upward triangle
            }
            board[newPosition - 1] = playerSymbol;
        }
        return newPosition;
    }
}