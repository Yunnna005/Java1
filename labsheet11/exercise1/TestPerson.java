package labsheet11.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {
        String text = "", firstName, lastName;
        String line = "*".repeat(5);
        text = line+"Person Class Test"+line;
        text+="\n\nCalling the Person() constructor ....";

        for (int i= 1; i<3;i++){

            Person p = new Person();
            firstName = JOptionPane.showInputDialog("Enter first name "+i);
            p.setFirstName(firstName);
            lastName = JOptionPane.showInputDialog("Enter last name "+i);
            p.setLastName(lastName);

            text += "\n\nValue of "+i+" Person is: "+p;
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
