package labsheet4;

import javax.swing.*;
import java.awt.*;

public class Ex6 {//

    //Right code -> Ex6_4
    public static void main(String[] args) {
        String studentName,Tnumber, course, avgMarkString;
        String studentNamesList = "", TnumbersList = "", coursesList = "", avgMarkList = "";

        for (int i=1; i<6; i++){
            studentName = JOptionPane.showInputDialog("Enter the name of student "+i);
            Tnumber = JOptionPane.showInputDialog("Enter the t-number of student "+i);
            course = JOptionPane.showInputDialog("Enter the course of student "+i);
            avgMarkString = JOptionPane.showInputDialog("Enter the average mark of student "+i);

            //avgMark = Double.parseDouble(avgMarkString);

            studentNamesList += studentName +"\n";
            TnumbersList += Tnumber + "\n";
            coursesList += course + "\n";
            avgMarkList += avgMarkString +"\n";
        }
        JTextArea textArea = new JTextArea(10,40);
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textAreaFont);

        textArea.setText(String.format("%-25s%-15s%-30s%-8s","Name", "T-Number", "Course", "Avg Mark"));
        textArea.setText(String.format("%-25s%-15s%-30s%-8s\n","====", "========", "======", "========"));
        textArea.setText(String.format("%-25s%-15s%-30s%-10s",studentNamesList, TnumbersList, coursesList, avgMarkList));
        JOptionPane.showMessageDialog(null,textArea,"Formatted Data",
                JOptionPane.PLAIN_MESSAGE);
        System.exit(0);

    }
}
