package oopRepeat2022;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class AcademicStaff extends Employee implements Payable{
    private String[] coursesTaught;

    public AcademicStaff(String name, String address, String mobileNumber, String tNUmber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] coursesTaught) throws InvalidPointOnScaleException {
        super(name, address, mobileNumber, tNUmber, dateOfBirth, workPattern, role, pointOnScale, office);
        setCoursesTaught(coursesTaught);
    }

    public double calculateEarnings(){
        if (getWorkPattern().equals("prorata")){
            return ((double) 100000 /740)*(1+ (double) getPointOnScale() /POINT_ON_SCALE);
        }else {
            return calculateEarnings(getPointOnScale(), getWorkPattern());
        }
    }
    @Override
    public String toString() {
        return super.toString()+"\nCourses Taught: "+ Arrays.toString(getCoursesTaught()) + "Earnings: "+String.format("%.2f",calculateEarnings())+"per hour";
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}
