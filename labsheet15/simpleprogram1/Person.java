package labsheet15.simpleprogram1;

//Person.java
/*An interface defining a generic Person*/

import java.util.*;

public interface Person{
    public abstract String getName();
	public abstract String getAddress();
	public abstract GregorianCalendar getDateOfBirth();
	public abstract void setName(String nm);
	public abstract void setAddress(String addr);
	public abstract void setDateOfBirth(GregorianCalendar dob);
}