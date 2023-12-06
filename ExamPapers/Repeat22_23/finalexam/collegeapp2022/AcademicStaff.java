package Repeat22_23.finalexam.collegeapp2022;

import java.util.GregorianCalendar;

public class AcademicStaff extends Employee{
    private String[] coursesTaught ;

    public AcademicStaff(String message, String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] coursesTaught) {
        super(message, name, address, mobileNumber, tNumber, dateOfBirth, workPattern, role, pointOnScale, office);
        this.coursesTaught = coursesTaught;
    }
}
