package PS4;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        double[] array = {22.3, 45.6, 27.4, 56.6, 73.2, 11.5, 87.4, 23.8};

        JOptionPane.showMessageDialog(null,"The largest: "+largest(array)+
                "\nThe average: "+average(array)+
                "\nThe list of values above the avrage is: "+aboveAverage(array),
                "Array Stats", JOptionPane.INFORMATION_MESSAGE);
    }
    public static double largest(double[] array){
        return Arrays.stream(array).max().getAsDouble();
    }
    public static double average(double[] array){
        return Arrays.stream(array).average().getAsDouble();
    }
    public static String aboveAverage(double[] array){
        String above = "";
        for (int i = 0; i<Arrays.stream(array).count(); i++){
            if (array[i]>average(array)){
                above += array[i] + " ";
            }
        }
        return above;
    }
}
