package labsheet15.exercise1;

import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer{
    private int hoursWorked;

    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, GregorianCalendar dateOfAppointment, String staffID, String[] coursesTaught, int hoursWorked) {
        super(name, address, dateOfBirth, dateOfAppointment, staffID, coursesTaught);
        setHoursWorked(hoursWorked);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getStatus(){
        return "Contracted temporary lecturer on part-time hours";
    }
    @Override
    public int getPointOnScale() {
        int StartYear =dateOfAppointment.getWeekYear();
        int fullWorkYears = LocalDateTime.now().getYear() - StartYear;

        if (fullWorkYears>=3 && getHoursWorked()>1500){
            return 4;
        } else if (fullWorkYears>=3 && getHoursWorked()>1000) {
            double num = getHoursWorked()*1.33;
            return (int) num;
        }else{
            return fullWorkYears;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\nLecture Status is "+getStatus()+"\nLecture Point on Scale is "+
                getPointOnScale()+ "\nLecture hours Worked: "+getHoursWorked();
    }
}
