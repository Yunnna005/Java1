package Repeat22_23.finalexam.collegeapp2022;

import java.util.GregorianCalendar;
import java.util.InvalidPropertiesFormatException;

public class Employee extends InvalidPointOnScaleException{
    private String name;
    private String address;
    private String mobileNumber;
    private String tNumber;
    private GregorianCalendar dateOfBirth;
    private String workPattern;
    private String role;
    private int pointOnScale;
    private String office;

    public Employee(String message, String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office) throws InvalidPropertiesFormatException {
        super(message);
        setName(name);
        setAddress(address);
        setMobileNumber(mobileNumber);
        settNumber(tNumber);
        setDateOfBirth(dateOfBirth);
        setWorkPattern(workPattern);
        setRole(role);
        setPointOnScale(pointOnScale);
        setOffice(office);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String gettNumber() {
        return tNumber;
    }

    public void settNumber(String tNumber) {
        this.tNumber = tNumber;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getWorkPattern() {
        return workPattern;
    }

    public void setWorkPattern(String workPattern) {
        this.workPattern = workPattern;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPointOnScale() {
        return pointOnScale;
    }

    public void setPointOnScale(int pointOnScale) throws InvalidPropertiesFormatException {
        if (pointOnScale >= 1 && pointOnScale <= Payable.PointnsOnScale){
            this.pointOnScale = pointOnScale;
        }else{
            throw new InvalidPropertiesFormatException("Invalid data entered for point on scale!!");
        }

    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "";
    }
}
