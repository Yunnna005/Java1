package labsheet5;

import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {

        String choice;
        int gamePlayed = 0, playerWins = 0, computerWins = 0, draws = 0;

        choice = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no)");
        switch (choice){
            case "no":
                JOptionPane.showMessageDialog(null,"Thank for playing the game", "Farewell", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "yes":
                JOptionPane.showMessageDialog(null,"The computer roll generated the value 10\n .... now hit return to see the player roll",
                        "Computer Roll", JOptionPane.INFORMATION_MESSAGE);
                for (int i =1; i<=10; i++){
                    char winner = rollTheDice();

                    if (winner == 'c'){
                        computerWins++;
                    } else if (winner == 'p') {
                        playerWins++;
                    }else {
                        draws ++;
                    }

                    JOptionPane.showMessageDialog(null, "Game played: "+i+
                            "\nComputer Wins: "+computerWins+"\nPlayer Wins: "+playerWins+
                            "\nDraws:  "+draws);
                }
        }
    }
    public static char rollTheDice(){
        int playerRoll = (int) (Math.random()*6)+1+(int)(Math.random()*6)+1;
        int computerRoll = (int) (Math.random()*6)+1+(int)(Math.random()*6)+1;

        if (playerRoll == computerRoll){
            return 'q';
        } else if (playerRoll > computerRoll) {
            return 'p';
        }else {
            return 'c';
        }
    }
}
