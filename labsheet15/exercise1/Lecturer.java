package labsheet15.exercise1;

import java.util.Arrays;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person{
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    protected GregorianCalendar dateOfAppointment;
    private String staffID;
    private String[] coursesTaught;

    public Lecturer(String name, String address, GregorianCalendar dateOfBirth, GregorianCalendar dateOfAppointment, String staffID, String[] coursesTaught) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setDateOfAppointment(dateOfAppointment);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
    }

    @Override
    public String getName() {return name;}
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getAddress() {return address;}
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public GregorianCalendar getDateOfBirth() {return dateOfBirth;}
    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public GregorianCalendar getDateOfAppointment() {return dateOfAppointment;}
    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }
    public String getStaffID() {return staffID;}
    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
    public String[] getCoursesTaught() {return coursesTaught;}
    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
    public abstract String getStatus();
    public abstract int getPointOnScale();

    @Override
    public String toString() {
        return "\n\nLecture name is "+getName()+"\nLecture address is "+getAddress()+
                "\nLecture dob is "+getDateOfBirth()+"\nLecture StaffID is "+ getStaffID()+
                "\nLecture Course  Tought are "+ Arrays.toString(getCoursesTaught())+
                "\nLecture Date of appointment is "+getDateOfAppointment();
    }
}
