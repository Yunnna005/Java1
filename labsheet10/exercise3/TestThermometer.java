package labsheet10.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        int temp;
        String tempAsString;

        String text;

        text = "Calling the single-argument constructor....." +
                "setting the temperature of first thermometer to 35C";
        Thermometer t1 = new Thermometer(35);

        text += "\nFirst Thermometer: \n" + t1;
        text += "\nCalling the no-argument constructor....." +
                "setting the temperature of second thermometer to 0C";

        Thermometer t2 = new Thermometer();
        text += "\nCalling setTemperature()....." +
                "setting the temperature of second thermometer to 25C";
        t2.setTemperature(25);
        text += "\nSecond Thermometer:\n" + t2;

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\n" + text,"",
                JOptionPane.INFORMATION_MESSAGE);

        tempAsString = JOptionPane.showInputDialog("Please enter the current " +
                "temperature of the first thermometer: ");

        temp = Integer.parseInt(tempAsString);

        text = "Calling setTemperature()....." +
                "setting the temperature of first thermometer to " + temp + "C";

        t1.setTemperature(temp);

        text += "\nFirst Thermometer: \n"+ t1;

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\n" + text,"",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
