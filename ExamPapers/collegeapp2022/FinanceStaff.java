package collegeapp2022;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class FinanceStaff extends Employee implements Payable {
    private String[] duties;

    public FinanceStaff(String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] duties) {
        super(name, address, mobileNumber, tNumber, dateOfBirth, workPattern, role, pointOnScale, office);
        this.duties = duties;
    }

    @Override
    public String toString() {
        return "FinanceStaff{" +
                super.toString() +
                "duties=" + Arrays.toString(duties) +
                "earnings=" + calculateEarnings(getPointOnScale(), getWorkPattern()) + " per annum" +
                '}';
    }



    public String[] getDuties() {
        return duties;
    }

    public void setDuties(String[] duties) {
        this.duties = duties;
    }
}
