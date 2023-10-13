package labsheet7;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        String[] names = {"James Maye", "Joe Bloggs", "Jane Doe", "Teresa Coughlan", "Sam Stewart"};
        double[] GPAs = {3.56, 2.47, 3.12, 2.55, 2.78};

        sortArray(GPAs);
        displayResults(names, GPAs);

        JOptionPane.showMessageDialog(null,"The average GPA is "+ averageGPA(GPAs),"Average GPA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The standard deviation of the GPAs is "+String.format("%.3f",standardDeviationGPA(GPAs)), "Standart deviation",JOptionPane.INFORMATION_MESSAGE);
    }

    private static double standardDeviationGPA(double[] gpAs) {
        double sum = 0;
        for (double i : gpAs){
            sum += i;
        }

        int length = gpAs.length;
        double mean = sum/length;

        double standartD = 0;
        for (double i:gpAs){
            standartD += Math.pow(i-mean,2);
        }
        return Math.sqrt(standartD/length);
    }

    private static int averageGPA(double[] gpAs) {
        double gpa = (double) Arrays.stream(gpAs).average().getAsDouble();
        gpa = Math.ceil(gpa);
        int gpaAvg = (int) gpa;
        return (int) gpa;
    }

    private static void sortArray(double[] GPAs) {
        int subLargest;
        double temp;

        for (int i = 0; i<GPAs.length-1; i++){
            subLargest = i;

            for (int j = i+1; j<GPAs.length;j++){
                if (GPAs[j]>GPAs[subLargest]){
                    subLargest = j;
                }
            }
            temp = GPAs[i];
            GPAs[i] = GPAs[subLargest];
            GPAs[subLargest] = temp;
        }
    }

    private static void displayResults(String[] names, double[] GPAs) {
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("monospaced",Font.PLAIN,15));
        String textAreaData = "";

        textAreaData = String.format("%-30s%-5s\n%-30s%-5s\n\n", "Name", "GPA","------", "-----");
        for (int i =0; i<names.length; i++){
            textAreaData += String.format("%-30s%-5f", names[i], GPAs[i])+"\n";
        }

        textArea.setText(textAreaData);
        JOptionPane.showMessageDialog(null, textArea, "Sorted Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
