package labsheet13.sampleprogram2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student extends Person {

    private int id;
    private String dept;

    public Student(){
        setId(0);
        setDept("No department specified");
    }

    public Student(String name, String address, GregorianCalendar dateOfBirth, int id, String dept) {
        super(name,address,dateOfBirth);
        setId(id);
        setDept(dept);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString(){
        String str = "Student Name: " + name + "\nStudent Address: " + address + "\nStudent Date of Birth: ";

        if(dateOfBirth==null)
            str+="No date of birth specified";
        else
            str+=dateOfBirth.get(Calendar.DATE) + "-" + dateOfBirth.get(Calendar.MONTH) +
                    "-" + dateOfBirth.get(Calendar.YEAR) ;

        str+= "\nStudent ID: " + getId() + "\nStudent Department: " + getDept() + "\n";

        return str;
    }
}

