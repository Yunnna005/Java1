package labsheet7;

import labsheet4.JOptionPaneFormattingAttempt;

import javax.swing.*;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] first5Numbers = new int[5];
        int[] luckyStars = new int[2];

        for (int i = 0;i<5;i++){
            int randomNumber = (int) (Math.random() * 49) +1;
            first5Numbers[i] += randomNumber;
            for (int j = 1; j<4; j++){
                randomNumber = (int) (Math.random() * 49) +1;
                if (first5Numbers[i] == first5Numbers[j]){
                    first5Numbers[j] += randomNumber;
                }
            }
        }

        for (int i = 0;i<2;i++){
            int randomNumber = (int) (Math.random() * 9) +1;
            luckyStars[i] += randomNumber;
            for (int j = 1; j<=1; j++){
                randomNumber = (int) (Math.random() * 9) +1;
                if (luckyStars[i] == luckyStars[j]){
                    luckyStars[j] += randomNumber;
                }
            }
        }

        Arrays.sort(first5Numbers);
        Arrays.sort(luckyStars);

        JOptionPane.showMessageDialog(null,"Winning numbers are: \n\n"+Arrays.toString(first5Numbers)+
                " Lucky Stars: "+Arrays.toString(luckyStars));

    }
}
