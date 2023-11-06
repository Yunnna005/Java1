package labsheet10.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String text = "";

        BankAccount b1 = new BankAccount();
        text = "Calling the no-argument BankAccount constructor.\nThe first BankAccount Object details are:\n"+b1;

        BankAccount b2 = new BankAccount("Richy Rich", 2342343,0.75);
        text += "\nCalling the no-argument BankAccount constructor.\nThe second BankAccount Object details are:\n"+b2;

        text += "\nNow calling the setInterestRate() to change the interest rate to 0.5.";

        BankAccount b3 = new BankAccount();
        b3.setInterest_rate(0.5);
        text+= "\nThe first BankAccount object details are:\n"+b3;

        BankAccount b4 = new BankAccount("Richy Rich",2342343,0.5);
        text+= "The second BankAccount object details are:"+b4;

        JOptionPane.showMessageDialog(null,text,"BankAccount Object Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
