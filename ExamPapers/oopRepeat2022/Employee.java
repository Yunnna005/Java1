package oopRepeat2022;

import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private String  address;
    private String mobileNumber;
    private String tNUmber;
    private GregorianCalendar dateOfBirth;
    private String workPattern;
    private String role;
    private int pointOnScale;
    private String office;

    public Employee(String name, String address, String mobileNumber, String tNUmber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office) throws InvalidPointOnScaleException {
        setName( name);
        setAddress(address);
        setMobileNumber(mobileNumber);
        settNUmber(tNUmber);
        setDateOfBirth(dateOfBirth);
        setWorkPattern(workPattern);
        setRole(role);
        setPointOnScale(pointOnScale);
        setOffice(office);
    }

    @Override
    public String toString() {

        return "\nName: "+getName()+"\nAddress: "+getAddress()+"\nMobile: "+getMobileNumber()+
                "\nT-number: "+gettNUmber()+"\nDate Of Birth: "+getDateOfBirth().toZonedDateTime().toLocalDateTime().format(DateTimeFormatter.ISO_DATE)+
                "\nWork Pattern: "+getWorkPattern()+"\nRole: "+getRole()+"\nPoint On Scale: "+getPointOnScale()+
                "\nOffice: "+getOffice();
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

    public String gettNUmber() {
        return tNUmber;
    }

    public void settNUmber(String tNUmber) {
        this.tNUmber = tNUmber;
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
        if (pointOnScale <1 || pointOnScale>Payable.POINT_ON_SCALE){
            throw new InvalidPointOnScaleException("Invalid data entered for point on scale!! ");
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
