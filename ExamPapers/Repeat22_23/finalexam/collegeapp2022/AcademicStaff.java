package Repeat22_23.finalexam.collegeapp2022;

import java.util.GregorianCalendar;

public class AcademicStaff extends Employee implements Payable{
    private String[] coursesTaught ;

    public AcademicStaff(String message, String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] coursesTaught) {
        super(message, name, address, mobileNumber, tNumber, dateOfBirth, workPattern, role, pointOnScale, office);
        setCoursesTaught(coursesTaught);
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public double calculateEarnings(){
        if (getWorkPattern().equals("prorata")){
            return (100000/740)*(1+getPointOnScale()/PointnsOnScale);
        }else{
            return calculateEarnings(getPointOnScale(), getWorkPattern());
        }
    }
    @Override
    public String toString() {
        String allCourseTaught = "";

        for ( String course: getCoursesTaught()){
            allCourseTaught+=course+"   ";
        }

        String output = super.toString()+"\nCourses Taught: "+allCourseTaught+
                "\nEarnings: $"+String.format("%.2f", calculateEarnings());

        if (getWorkPattern().equals("prorata")){
            output+=" per hour";
        }else{
            output+=" per annum";
        }
        return output;
    }
}
