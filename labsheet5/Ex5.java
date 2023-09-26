package labsheet5;

import javax.swing.*;

public class Ex5 {
    public static void main(String[] args) {
        String enteredValue;

        enteredValue = JOptionPane.showInputDialog("Enter your value");
        if(isValidHexadecimal(enteredValue)){

        }else{
            JOptionPane.showMessageDialog(null,"The entered value does not have 6 characters.",
                    "Program Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static boolean isValidHexadecimal(String value){
        if (value.length() == 6){
            return true;
        }else{
            return false;
        }
    }

    public static int hexToDecimal(String value) {
        int intLetter = getNumericValue(value);

    }
    public static int getNumericValue(String value){
        int letterToInt;
        for (int i=0; i < 6; i++){
            if (value.charAt(i)=='A'){
                letterToInt = 10;

            } else if (value.charAt(i)=='B') {
                letterToInt = 11;

            } else if (value.charAt(i)=='C') {
                letterToInt = 12;

            } else if (value.charAt(i)=='D') {
                letterToInt = 13;

            } else if (value.charAt(i)=='E') {
                letterToInt = 14;

            }else if (value.charAt(i)=='F'){
                letterToInt = 15;

            }
        }
        return letterToInt;
    }
}
