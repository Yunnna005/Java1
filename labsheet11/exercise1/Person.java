package labsheet11.exercise1;

import java.security.PublicKey;
import java.security.spec.DSAPublicKeySpec;

public class Person {
    private String firstName;
    private String lastName;

    public Person(){
        this("Not Supplied", "Not Supplied");
    }

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String toString(){
        return "First name: "+getFirstName()+"  Last name: "+getLastName();
    }
}
