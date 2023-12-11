package oopRepeat2022;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class FunanceStaff extends Employee implements Payable{
    private String[] duties;

    public FunanceStaff(String name, String address, String mobileNumber, String tNUmber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] duties) throws InvalidPointOnScaleException {
        super(name, address, mobileNumber, tNUmber, dateOfBirth, workPattern, role, pointOnScale, office);
        this.duties = duties;
    }

    @Override
    public String toString() {
        return  super.toString()+"\nDuties: "+ Arrays.toString(getDuties()) + "Earnings: "
                +String.format("%.2f",calculateEarnings(getPointOnScale(), getWorkPattern()))+(getWorkPattern().equals("fulltime")||getWorkPattern().equals("halhtime")? "per annum": "per hour");
    }

    public String[] getDuties() {
        return duties;
    }

    public void setDuties(String[] duties) {
        this.duties = duties;
    }
}
