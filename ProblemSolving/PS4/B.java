package PS4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class B {
    private static final int[] salaries = new int[100];
    private static JTextArea textAria;
    public static void main(String[] args) {
        String enteredValue;
        do {
            enteredValue = JOptionPane.showInputDialog("What would you like to do?\n\n\n1. View Salaries\n2. Get salary Statistics\n3. Exit\n\n");
            boolean isValid = validation(enteredValue);
            if (isValid){
                switch (enteredValue){
                    case "1":
                        viewSalaries();
                }
            }else {
                enteredValue = JOptionPane.showInputDialog("Invalid!\n\nWhat would you like to do?\n\n\n1. View Salaries\n2. Get salary Statistics\n3. Exit\n\n");
                isValid = validation(enteredValue);
            }

        }while(true);
    }

    private static boolean validation(String enteredValue) {
        return (enteredValue.contains("1")||enteredValue.contains("2")||enteredValue.contains("3")) ? true : false;
    }
    public static void generateSalaries(){
        StringBuilder boardText = new StringBuilder();
        Random random = new Random();

        for (int i =0; i<100;i++){
            int randomSalary = random.nextInt(40001)+20000;
            salaries[i] = randomSalary;
            boardText.append(salaries[i]).append(" ");
            if ((i+1)%10 == 0){
                boardText.append("\n");
            }
        }
        textAria.setText(boardText.toString());
    }
    public static void viewSalaries(){
        JFrame frame = new JFrame();
        frame.setSize(600,300);

        JPanel panel = new JPanel(new BorderLayout());

        textAria = new JTextArea(10,10);
        textAria.setFont(new Font("Monospaced", Font.PLAIN, 15));

        JButton OK = new JButton("OK");

        panel.add(OK,textAria);
        frame.add(panel);
        frame.setVisible(true);

        JOptionPane.showMessageDialog(null,frame,"Salary Data",JOptionPane.INFORMATION_MESSAGE);
    }
}
