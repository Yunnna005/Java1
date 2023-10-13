package labsheet7;

import javax.swing.*;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        String[] tNumber = new String[10];
        String[] courseNames = new String[10];
        String seekName;
        boolean found;

        populateArrays(tNumber, courseNames);
        selectionSort(tNumber, courseNames);

        seekName = JOptionPane.showInputDialog("Enter the t-number of the student you seek");
        found = binarySearch();
    }

    private static void selectionSort(String[] tNumber, String[] courseNames) {
        Arrays.sort(tNumber);
        Arrays.sort(courseNames);
        JOptionPane.showMessageDialog(null, "After sorting: \n\n"+Arrays.toString(tNumber)+
                "\n\n"+Arrays.toString(courseNames));
    }

    public static void populateArrays(String[] tNumber, String[] courseNames) {
        for (int i =0; i<10; i++){
            tNumber[i] = JOptionPane.showInputDialog("Enter t-number for student "+(i+1));
            courseNames[i] = JOptionPane.showInputDialog("Enter course name for student "+(i+1));
        }

        JOptionPane.showMessageDialog(null, "Before sorting: \n\n"+ Arrays.toString(tNumber)+
                "\n\n"+Arrays.toString(courseNames));
    }
}
