package labsheet5;

import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {

        String enteredText;

        enteredText = JOptionPane.showInputDialog("Please enter any character");
        if (enteredText.length() == 1){
            char enteredChar = enteredText.charAt(0);
            if (Character.isDigit(enteredChar)){
            JOptionPane.showMessageDialog(null,"You entered a digit");
            }else{JOptionPane.showMessageDialog(null,"You did not enter a digit");}
        }
        else{
            JOptionPane.showMessageDialog(null,"You did not enter a single character");
        }

    }
}
