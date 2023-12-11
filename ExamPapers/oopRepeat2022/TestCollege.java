package oopRepeat2022;

import javax.swing.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class TestCollege {
    public static void main(String[] args) throws InvalidPointOnScaleException {

        ArrayList<Employee> employees = new ArrayList<>();
        try {

            AcademicStaff mary = new AcademicStaff("Mary McCarthy", "Tralee, Co. Kerry", "085-1234567",
                    "t00012345", new GregorianCalendar(1986, 5, 23), "fulltime", "lecturer", 22,
                    "R212", new String[]{"Mathematics", "Mechanics", "Hydraulics", "Final Year Project"});
            AcademicStaff james = new AcademicStaff("James Collins", "Killarney, Co. Kerry", "083-7654321",
                    "t00045678", new GregorianCalendar(1972, 2, 11), "halftime", "lecturer", 13,
                    "T209", new String[]{"French", "German", "English"});
            AcademicStaff sally = new AcademicStaff("Sally Fletcher", "Mallow, Co. Cork", "087-6758393",
                    "t00065432", new GregorianCalendar(1998, 11, 29), "prorata", "researcher", 1,
                    "S217", new String[]{"Social Care", "Psychology", "Behavioural Science"});

            FunanceStaff kevin = new FunanceStaff("Kevin Ashton", "Moyvane, Co. Kerry", "085-5847483",
                    "t00056373", new GregorianCalendar(1983, 2, 16), "fulltime", "clerical officer", 4,
                    "C203", new String[]{"Accounts", "Procurement"});
            FunanceStaff lucy = new FunanceStaff("Lucy Ward", "Kenmare, Co. Kerry", "083-1145322",
                    "t00056373", new GregorianCalendar(1996, 10, 20), "halftime", "staff officer", 8,
                    "C215", new String[]{"Payroll", "Procurement"});

            employees.add(mary);
            employees.add(james);
            employees.add(sally);
            employees.add(kevin);
            employees.add(lucy);

            System.out.println("Displaying the state of all the Employee objects within the array-list \n");
            for (int i = 0; i < employees.size(); i++) {
                System.out.println("\n Employee " + (i + 1) + " Details\n" + employees.get(i));
            }
        } catch (InvalidPointOnScaleException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Trying to set the point on scale value of the first AcademicStaff object to an " +
                    "invalid value of zero (to demonstrate exception-handling)\n"+e.getMessage());
        }
    }
}
