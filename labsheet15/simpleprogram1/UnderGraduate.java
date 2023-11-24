package labsheet15.simpleprogram1;

//UnderGraduate.java
/*This concrete class inherits from the abstract Student class*/

import java.util.*;

public  class UnderGraduate extends Student{

    private double gpa;

    public UnderGraduate() {
        setGPA(0);
    }

    public UnderGraduate(String nm, String addr, GregorianCalendar dob, String sid, String cnm, double gpa) {
        super(nm, addr, dob, sid, cnm);
        setGPA(gpa);
    }

    public double getGPA() {
        return gpa;
    }

    public String getCategory() {
        return "Undergraduate";
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + "\nStudent GPA is " + getGPA();
    }
}