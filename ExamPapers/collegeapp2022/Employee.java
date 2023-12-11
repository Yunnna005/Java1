package collegeapp2022;

import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private String address;
    private String mobileNumber;
    private String tNumber;
    private GregorianCalendar dateOfBirth;
    private String workPattern;
    private String role;
    private int pointOnScale;
    private String office;

    public Employee(String name, String address, String mobileNumber, String tNumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.tNumber = tNumber;
        this.dateOfBirth = dateOfBirth;
        this.workPattern = workPattern;
        this.role = role;
        this.pointOnScale = pointOnScale;
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", tNumber='" + tNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth.toZonedDateTime().toLocalDateTime().format(DateTimeFormatter.BASIC_ISO_DATE) +
                ", workPatter='" + workPattern + '\'' +
                ", role='" + role + '\'' +
                ", pointOnScale=" + pointOnScale +
                ", office='" + office + '\'' +
                '}';
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

    public String getTNumber() {
        return tNumber;
    }

    public void setTNumber(String tNumber) {
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

    public void setPointOnScale(int pointOnScale) throws InvalidPointOnScaleException {
        if (pointOnScale < 1 || pointOnScale > Payable.POINT_ON_SCALE){
            throw new InvalidPointOnScaleException("");
        }
        this.pointOnScale = pointOnScale;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
