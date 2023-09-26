package labsheet5;

import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {
        String enterX, enterY, enterRadius, enterSecondX, enterSecondY;
        double enterXDouble, enteryDouble, enterRadiusDouble, enterSecondXDouble, enterSecondYDouble;

        enterX = JOptionPane.showInputDialog("Enter the x");
        enterY = JOptionPane.showInputDialog("Enter the y");
        enterRadius = JOptionPane.showInputDialog("Enter the radius");
        enterSecondX = JOptionPane.showInputDialog("Enter the second x");
        enterSecondY = JOptionPane.showInputDialog("Enter the second Y");

        enterXDouble = Double.parseDouble(enterX);
        enteryDouble = Double.parseDouble(enterY);
        enterRadiusDouble = Double.parseDouble(enterRadius);
        enterSecondXDouble = Double.parseDouble(enterSecondX);
        enterSecondYDouble = Double.parseDouble(enterSecondY);

        double currentDistanse = pointLocator(enterXDouble,enteryDouble,enterRadiusDouble,enterSecondXDouble, enterSecondYDouble);
        if (currentDistanse == -1){
            JOptionPane.showMessageDialog(null,"Inside Circle","Point Locator", JOptionPane.INFORMATION_MESSAGE);
        } else if (currentDistanse == 0) {
            JOptionPane.showMessageDialog(null,"On Circle","Point Locator", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"Outside Circle", "Point Locator", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static double pointLocator(double x, double y, double r, double x2, double y2){
        double distance = Math.sqrt((Math.pow(x2-x,2))+(Math.pow(y2-y,2)));
        if (distance < r){
            return -1;
        }
        else if (distance == r){
            return 0;
        }else{
            return 1;
        }
    }
}
