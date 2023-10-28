package labsheet7;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.SimpleTimeZone;

public class Ex3 {
    public static void main(String[] args) {
        String[] tNumber = new String[10];
        String[] courseNames = new String[10];
        String seekName;
        boolean found;
        int t003 = 0, courseHLC = 0, persentComputing = 0;

        populateArrays(tNumber, courseNames, t003, courseHLC, persentComputing);
        selectionSort(tNumber, courseNames);

        seekName = JOptionPane.showInputDialog("Enter the t-number of the student you seek");
        int index = binarySearch(tNumber, seekName);
        if (index == 1){
            JOptionPane.showMessageDialog(null,"The t-num you seek was found in the array and the course for this student is "+courseNames[index]);
        }

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("monospaced", Font.PLAIN,12));
        String textAreData = "";

        textAreData = "Students with t003: "+t003+"\nStudents with 'Health & Leisure' or 'Chamistry': "+courseHLC+"\nPersent Computer students with t00036: "+persentComputing+"\n\n"+
                "List of students\n\n";

        for (int i = 0; i<10; i++){
            textAreData += String.format("%-20s%-15s",tNumber[i],courseNames[i]);

            if ((i+1)%10==0){
                textAreData += "\n";
            }
        }
        textArea.setText(textAreData);

        JOptionPane.showMessageDialog(null, textArea,"Student Statistics", JOptionPane.INFORMATION_MESSAGE);
    }

    private static int binarySearch(String[] tNumber, String seekName) {
        int lowerSub = 0, higherSub = tNumber.length-1, middleSub;
        while (lowerSub<=higherSub){
            middleSub = (lowerSub + higherSub)/2;

            if (tNumber[middleSub].compareTo(seekName)<0){
                lowerSub = middleSub+1;
            } else if (tNumber[middleSub].compareTo(seekName)>0) {
                higherSub = middleSub-1;
            }else{
                return 1;
            }
        }
        return -1;
    }

    private static void selectionSort(String[] tNumber, String[] courseNames) {
        Arrays.sort(tNumber);
        Arrays.sort(courseNames);
        JOptionPane.showMessageDialog(null, "After sorting: \n\n"+Arrays.toString(tNumber)+
                "\n\n"+Arrays.toString(courseNames));
    }

    public static void populateArrays(String[] tNumber, String[] courseNames, int t003, int courseHLC, int persentComputing) {
        int computerStudent = 0;
        for (int i =0; i<10; i++){
            tNumber[i] = JOptionPane.showInputDialog("Enter t-number for student "+(i+1));
            courseNames[i] = JOptionPane.showInputDialog("Enter course name for student "+(i+1));

            if (tNumber[i].startsWith("t003")){
                t003 += 1;
            }

            if (courseNames[i].startsWith("Health & Leisure") || courseNames[i].startsWith("Chemestry")){
                courseHLC += 1;
            }

            if (tNumber[i].equals("t00036") && courseNames[i].equals("Computing")){

                computerStudent += 1;
            }
        }

        persentComputing = 10/computerStudent *100;

        JOptionPane.showMessageDialog(null, "Before sorting: \n\n"+ Arrays.toString(tNumber)+
                "\n\n"+Arrays.toString(courseNames));
    }
}
