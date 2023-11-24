package labsheet15.exercise1;

import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer{

    private String pensionEntitlements;
    private String status;

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, GregorianCalendar dateOfAppointment, String staffID, String[] coursesTaught, String pensionEntitlements, String status) {
        super(name, address, dateOfBirth, dateOfAppointment, staffID, coursesTaught);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public int getPointOnScale() {
        int StartYear =dateOfAppointment.getWeekYear();
        return LocalDateTime.now().getYear() - StartYear;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLecture Status is "+getStatus()+"\nLecture Point on Scale is "+
                getPointOnScale()+"\nLecture Pernsion Entitlements: "+getPensionEntitlements();
    }
}
