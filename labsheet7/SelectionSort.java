package labsheet7;

import javax.swing.*;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        double[] weights = new double[10];
        populateArray(weights);

        JOptionPane.showMessageDialog(null, "The unsorted weights array is:\n\n"+
                Arrays.toString(weights));

        selectionSort(weights);
        //Arrays.sort(weights); == selectionSort(weights);
        JOptionPane.showMessageDialog(null, "The sorted weights array is:\n\n"+
                Arrays.toString(weights));
    }

    private static void selectionSort(double[] weights) {
        int subSmallest;
        double temp;

        for (int i = 0; i<weights.length-1; i++){
            subSmallest = i;

            for (int j = i+1; j<weights.length;j++){
                if (weights[j]<weights[subSmallest]){
                    subSmallest = j;
                }
            }
            temp = weights[i];
            weights[i] = weights[subSmallest];
            weights[subSmallest] = temp;
        }
    }

    private static void populateArray(double[] weights) {
        for (int i =0; i<weights.length; i++){
            weights[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter weight "+(i+1)));
        }
    }
}
