package labsheet17.exercise2;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Scanner;

public class RandomNumberFileHandling {
    public static void main(String[] args) {
        int randomNum, i, highest=0,lowest=500, total = 0;
        int[] allRandomNums = new int[100];
        String listOfNumbers="";

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("monospaced", Font.PLAIN,12));

        try{
            FileWriter out = new FileWriter("randomnumbers.txt");

            for (i = 0; i<100;i++){
                randomNum = (int)(Math.random()*500+1);

                out.write(Integer.toString(randomNum)+"\n");
            }

            out.close();

            Scanner input = new Scanner(new File("randomnumbers.txt"));

            i = 0;

            while(input.hasNext()){
                randomNum = input.nextInt();
                allRandomNums[i] = randomNum;
                i++;
            }
            i = 0;

            for (int num: allRandomNums){
                if (num>highest){
                    highest=num;
                } else if (num<lowest) {
                    lowest = num;
                }

                listOfNumbers += String.format("%-5d", num);

                if ((i+1)%10==0){
                    listOfNumbers+="\n";
                }
                total += num;

                i++;
            }

            textArea.append(listOfNumbers + "\n\nThe average of the numbers generated was: " + String.format("%.2f",(float)total/100) +
                    "\nThe highest number generated was: " + highest + "\nThe lowest number generated was: " + lowest);

            JOptionPane.showMessageDialog(null, textArea, "Random Number Stats", JOptionPane.INFORMATION_MESSAGE);

            input.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "File could not be found!",
                    "Problem Finding File!", JOptionPane.ERROR_MESSAGE);
        }
        /*catch (IOException ioe) {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(null, "File could not be read/written!",
                    "Problem Reading/Writing to File!", JOptionPane.ERROR_MESSAGE);
        }*/
    }
}
