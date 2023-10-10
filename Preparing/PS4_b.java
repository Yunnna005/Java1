package Preparing;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class PS4_b {
    public static void main(String[] args) {
        String[] salary = new String[100];
        String input;

        do {
            input = JOptionPane.showInputDialog("What would you like to do?\n\n\n"+
                    "1.View Salaries\n2.Get Salary Statistics\n3.Exit\n\n");

            if (input.equals("1") || input.equals("2")||input.equals("3")){
                generateSalaries(salary);
                switch (input){
                    case "1":
                        viewSalaries(salary);
                    case "2":
                        generateStatistics(salary);
                }
            }else{
                input = JOptionPane.showInputDialog("Invalid!\n\nWhat would you like to do?\n\n\n"+
                        "1.View Salaries\n2.Get Salary Statistics\n3.Exit\n\n");
            }

        }while (!input.equals("3"));

    }
    public static void generateSalaries(String[] salary){
        Random random = new Random();

        for (int i =0; i<salary.length; i++){
            int randomSalary = random.nextInt(40001)+20000;
            salary[i] = String.valueOf(randomSalary);
        }

    }
    public static void viewSalaries(String[] salary){
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("monospaced", Font.PLAIN, 15));
        String space = "";
        for (int i = 0; i<salary.length; i++){
            space += String.format("%-5s", salary[i])+"  ";
            if ((i+1)%10 == 0){
                space += "\n";
            }
        }
        textArea.setText(space);
        JOptionPane.showMessageDialog(null,textArea,"Salary Data", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void generateStatistics(String[] salary){
        double salaryInRange = 0;
        double[] salaryDouble = new double[salary.length];
        double largest = Arrays.stream(salaryDouble).max().getAsDouble();
        double smallest = Arrays.stream(salaryDouble).min().getAsDouble();
        double avg = Arrays.stream(salaryDouble).average().getAsDouble();
        for (int i=0; i<salary.length; i++){
            if ((salaryDouble[i] >= 35000) || (salaryDouble[i] <= 45000)){
                salaryInRange += salaryDouble[i];
            }
        }
        double persentSalary = (salaryInRange*100)/ Arrays.stream(salaryDouble).sum();

        String message = "Largest salary is "+largest+"\nSmallest salary is "+smallest+
                "\nAverage salary is "+avg+"\nSalaries in range 35000-45000"+persentSalary+"%";
        JTextArea textArea = new JTextArea();
        textArea.setText(message);
        JOptionPane.showMessageDialog(null, textArea, "Salary Stats", JOptionPane.INFORMATION_MESSAGE);
    }
}
