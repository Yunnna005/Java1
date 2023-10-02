package labsheet6;

import javax.swing.*;
import java.awt.*;

public class Arrays {
    public static void main(String[] args) {
        int[] rainfall = {7, 12, 10, 4, 5, 3, 1, 4, 3, 7, 8, 10};
        int month, i, janToJuneRainfall = 0;
        int winterRainfall;
        String text = "", monthAsString;

        Font textAreaFont = new Font("monospaced", Font.PLAIN,12);
        JTextArea textArea = new JTextArea(14,20);

        textArea.setFont(textAreaFont);

        text += String.format("%-10s%-10s\n", "Month", "Raindall");

        for (i = 0; i<rainfall.length; i++){
            text += String.format("%-10d%-10d\n", (i+1), rainfall[i]);
        }
        textArea.append(text);

        JOptionPane.showMessageDialog(null, textArea,"Rainfall Stats", JOptionPane.INFORMATION_MESSAGE);

        monthAsString = JOptionPane.showInputDialog("Enter a month number"+" (1-12) ");
        month = Integer.parseInt(monthAsString);
        JOptionPane.showMessageDialog(null, "Rainfall for this month is: "+
                rainfall[month-1]+ "mm", "Rainfall Stats", JOptionPane.INFORMATION_MESSAGE);

        winterRainfall = rainfall[0] + rainfall[10]+rainfall[11];
        JOptionPane.showMessageDialog(null, "Rainfall for the winter months is: "+ winterRainfall +"mm", "Rainfall Stats", JOptionPane.INFORMATION_MESSAGE);

        for (i = 0; i<=5; i++){
           janToJuneRainfall += rainfall[i];
        }
        JOptionPane.showMessageDialog(null, "Total from January to JUne is: "+
                janToJuneRainfall+"mm", "Rainfall Stats", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
