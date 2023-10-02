package labsheet6;

import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {
        String isbnAsString, ValidISBN;
        String totalISNBs = "", startsWith865 = "";
        int i =0;

        do{
            isbnAsString = JOptionPane.showInputDialog("Enter an ISBN (return to exit)");

            if (isbnAsString.isEmpty() || isbnAsString == null){
                if (i == 0){
                    JOptionPane.showMessageDialog(null,"You entered no valid ISBNs .... thanks for using the system");
                }else{
                    JOptionPane.showMessageDialog(null, "The valid ISBNs enterd are: \n\n"+
                            totalISNBs+"\n\nThe ISBNs that begin with 865 are: "+startsWith865, "Valid ISBNs",JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            }

            ValidISBN = isValidISBN(isbnAsString);
            totalISNBs += isbnAsString+"\n";

            if (ValidISBN.equals("valid")){
                i++;
                if (isbnAsString.startsWith("865")){
                    startsWith865 += isbnAsString+"\n";
                }
            }else{
                isbnAsString = JOptionPane.showInputDialog("\n"+ValidISBN+" Re-enter: ");
                ValidISBN = isValidISBN(isbnAsString);
            }

            if (isbnAsString.isEmpty() && i >0){
                JOptionPane.showMessageDialog(null, "The valid ISBNs enterd are: \n\n"+
                        totalISNBs+"\n\nThe ISBNs that begin with 865 are: "+startsWith865, "Valid ISBNs",JOptionPane.INFORMATION_MESSAGE);
            }
        } while (true);
    }

    public static String isValidISBN(String value){
        char c10 = value.charAt(9);
        if (value.length() == 10){
            if (Character.isDigit(c10) || (c10 == 'x'|| c10 == 'X')){
                for (int i = 0; i < value.length() - 1; i++) {
                    char c = value.charAt(i);
                    if (!(Character.isDigit(c))) {
                        return "Invalid! First 9 characters must be digits.";
                    }
                }
                return "valid";
            }else{
                return "Invalid! Last character must be a digit, an 'X' or 'x'.";
            }
        }else{
            return "Invalid! ISBN must have exactly 10 character";
        }
    }
}



