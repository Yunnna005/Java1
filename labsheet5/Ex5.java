package labsheet5;

import javax.swing.*;
public class Ex5 {
    public static void main(String[] args) {
        String enteredValue;

        enteredValue = JOptionPane.showInputDialog("Enter your value");
        if(isValidHexadecimal(enteredValue)){
            int decimalValue = hexToDecimal(enteredValue);
            JOptionPane.showMessageDialog(null, "Decimal equivalent: "+ decimalValue,
                    "Program Result", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"The entered value does not have 6 characters.",
                    "Program Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static boolean isValidHexadecimal(String value){
        if (value.length() == 6) {
            for (int i = 0; i < 6; i++) {
                char c = value.charAt(i);
                if (!Character.isDigit(c) && (c < 'A' || c > 'F')) {
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    public static int hexToDecimal(String value){
            int decimalValue = 0;
            int power = 5;

            for (int i = 0; i < 6; i++) {
                char c = value.charAt(i);
                if (Character.isDigit(c)) {
                    decimalValue += Character.getNumericValue(c) * Math.pow(16, power);
                } else {
                    decimalValue += (c - 'A' + 10) * Math.pow(16, power);
                }
                power--;
            }
            return decimalValue;
        }
}