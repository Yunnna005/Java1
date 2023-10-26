package labsheet7;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int binarySearch, times = 0;

        populateArray(array);
        displayArray(array);

        Arrays.sort(array);
        displayArray(array);

        over100(array);

        int search = Integer.parseInt(JOptionPane.showInputDialog("Enter number to check: "));
        binarySearch = Arrays.binarySearch(array,search);
        for (int i = 0; i<100; i++){
            if (search == array[i]){
                times += 1;
            }
        }
        if (binarySearch == search){
            JOptionPane.showMessageDialog(null,search+" appears "+times+" times in the array");
        }else{
            JOptionPane.showMessageDialog(null,search+" was not found in the array");
        }
    }

    private static void over100(int[] array) {
        int[] arrayInt = new int[100];
        int over100, over = 0;
        for (int i = 0; i<100; i++){
            arrayInt[i] = array[i];
            if (arrayInt[i] >= 100){
                over += 1;
            }
        }
        over100 = over*100/100;

        JOptionPane.showMessageDialog(null, "The persentage of values that exceed 100 is "+over100+"%");
    }

    public static void displayArray(int[] array) {
        TextArea textArea = new TextArea();
        textArea.setFont(new Font("monospaced", Font.PLAIN, 12));
        String textAreaText = "";

        for (int i = 0;i<100;i++){
            textAreaText += String.format("%-5s",array[i]);
            if ((i+1)%10 == 0){
                textAreaText += "\n";
            }
        }

        textArea.setText(textAreaText);
        JOptionPane.showMessageDialog(null,textArea, "Array Contents", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void populateArray(int[] array){
        for (int i = 0; i<100; i++){
            int random = (int) (Math.random()*999);
            array[i] = random;
        }
    }
}
