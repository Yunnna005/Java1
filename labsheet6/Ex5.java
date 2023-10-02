package labsheet6;

import javax.swing.*;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        String[] names = new String[5];
        String[] phones = new String[5];

        NamesPhones(names, phones);
        String searchName = JOptionPane.showInputDialog("Whose phone number do you seek?");
        int search = searchPhoneNumber(names, searchName);

        if (search != -1){
            JOptionPane.showMessageDialog(null, "The phone number is: "+phones[search], "Phone Number", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Name not found!", "Phone Number", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
    public static void NamesPhones(String[] names, String[] phones){
        for (int i = 0; i<5;i++){
            names[i] = JOptionPane.showInputDialog("Enter the name of person " + (i + 1));
            phones[i] = JOptionPane.showInputDialog("Enter the phone-number of person "+(i+1));
        }
    }
    public static int searchPhoneNumber(String[] names, String key ){
        for (int i =0; i<names.length; i++){
            if (names[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
}
