package collegeapp2022;

import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class AcademicStaff extends Employee implements Payable {
    private String[] coursesTaught;

    public AcademicStaff(String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPatter, String role, int pointOnScale, String office, String[] coursesTaught) {
        super(name, address, mobileNumber, tNumber, dateOfBirth, workPatter, role, pointOnScale, office);
        this.coursesTaught = coursesTaught;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public double calculateEarnings(){
        if (getWorkPattern().equalsIgnoreCase("prorata")){
            return (10000.0/740)*(1+ (double) getPointOnScale() /POINT_ON_SCALE);
        }
        return calculateEarnings(getPointOnScale(), getWorkPattern());
    }

    @Override
    public String toString() {
        return "AcademicStaff{" +
                super.toString() +
                "coursesTaught=" + Arrays.toString(coursesTaught) +
                "earnings=" + String.format("%.2f",calculateEarnings()) + (getWorkPattern().equalsIgnoreCase("fulltime")&&getWorkPattern().equalsIgnoreCase("halftime")? " per annum":" per hour" )+
                '}';
    }
}
