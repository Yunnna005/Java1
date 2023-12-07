package Repeat22_23.finalexam.collegeapp2022;

import java.util.GregorianCalendar;

public class FinanceStaff extends Employee implements Payable{
    private String[] duties;

    public FinanceStaff(String message, String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] duties) {
        super(message, name, address, mobileNumber, tNumber, dateOfBirth, workPattern, role, pointOnScale, office);
        setDuties(duties);
    }

    public String[] getDuties() {
        return duties;
    }

    public void setDuties(String[] duties) {
        this.duties = duties;
    }

    @Override
    public String toString() {
        return "";
    }
}
