package labsheet5;

import javax.swing.*;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        String first5 = "", luckyStars = "";
        int randomNumber;

        for (int i = 1; i <= 7; i++){
            if (i <= 5){
                randomNumber = (int) (Math.random()* 50)+1;
                first5 += randomNumber + " ";
            }else{
                randomNumber = (int) (Math.random()*12)+1;
                luckyStars += randomNumber +" ";
            }
        }
        JOptionPane.showMessageDialog(null, "Winning numbers are: \n\n"+
                first5+ " Lucky Stars: "+ luckyStars, "Euromillions Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
