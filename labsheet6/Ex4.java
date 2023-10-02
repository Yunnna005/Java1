package labsheet6;

import javax.swing.*;
import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        double[] numbers = {22.3, 45.6, 27.4, 56.6, 73.2, 11.5, 87.4, 23.8};

        double average = average(numbers);
        double largest = largest(numbers);
        String aboveAvg = aboveAverage(numbers);

        JOptionPane.showMessageDialog(null, "The largest in the array is "+largest+
                "\nThe average value in the array is "+ average+
                "\nThe list of values abouve the average is: "+aboveAvg,"Array Stats",JOptionPane.INFORMATION_MESSAGE);
    }

    public static double largest(double[] numbers) {
        return Arrays.stream(numbers).max().getAsDouble();
    }

    public static double average(double[] numbers){
        return Arrays.stream(numbers).average().getAsDouble();
    }

    public static String aboveAverage(double[] numbers) {
        String aboveAvg = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average(numbers)) {
                aboveAvg += numbers[i] + " ";
            }
        }
        return aboveAvg;
    }
}
