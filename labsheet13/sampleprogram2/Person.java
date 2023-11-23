package labsheet13.sampleprogram2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    protected String name;
    protected String address;
    protected GregorianCalendar dateOfBirth;

    public Person(){
        this("No name specified","No address specified",null);
    }

    public Person(String name, String address, GregorianCalendar dateOfBirth){
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString(){
        String str = "Name: " + getName() + "  Address: " + getAddress() + "  Date of Birth: ";

        if(dateOfBirth==null)
            str+="No date of birth specified";
        else
            str+=getDateOfBirth().get(Calendar.DATE) + "-" + getDateOfBirth().get(Calendar.MONTH) +
                    "-" + getDateOfBirth().get(Calendar.YEAR) ;

        return str;
    }
}

