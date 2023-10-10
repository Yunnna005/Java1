package Preparing;

import javax.swing.*;
import java.util.Arrays;

public class PS4_a {
    public static void main(String[] args) {
        double[] array = {22.3, 45.6, 27.4, 56.6, 73.2, 11.5, 87.4, 23.8};
        JOptionPane.showMessageDialog(null, "The largest "+largest(array)+
                "\nThe average "+average(array)+"\nThe list of values above the average "+aboveAverage(array));
    }
    public static double largest(double[] array){
        return Arrays.stream(array).max().getAsDouble();
    }
    public static double average(double[] array){
        return Arrays.stream(array).average().getAsDouble();
    }
    public static String aboveAverage(double[] array){
        String above = "";
        for (int i = 0; i<array.length; i++){
            if (array[i]>average(array)){
                above += array[i] + " ";
            }
        }
        return above;
    }
}
