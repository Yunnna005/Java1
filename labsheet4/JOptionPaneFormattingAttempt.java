package labsheet4;

import javax.swing.*;
import java.awt.*;

public class JOptionPaneFormattingAttempt { // doesn't work properly
    public static void main(String[] args) {

        int i = 1;
        double squareRoot, cubeRoot;

        JTextArea textArea = new JTextArea(14,38);
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textAreaFont);
        
        textArea.setText(String.format("%-10s%-10s%-10s\n","Number", "5q Root", "Cb Root"));

        while (i <=100){
            squareRoot = Math.sqrt(1);
            cubeRoot = Math.cbrt(1);

            textArea.append(String.format("%-10d%-10.3f%-10.3f\n", i, squareRoot,cubeRoot));

            if (i %10 == 0){
                if (i<100){
                    textArea.append("\nPlease hit return to continue ....");
                }
                else{
                    textArea.append("\nFinished .... hit return to exit");
                }

                JOptionPane.showMessageDialog(null,textArea,"JTextArea Formatting Demo",
                        JOptionPane.PLAIN_MESSAGE);
                textArea.setText(String.format("%-10s%-10s%-10s\n", "Number", "Sq Root", "Cb Root"));
            }
            i++;
        }
        System.exit(0);
    }
}
