package labsheet6;

import javax.swing.*;

public class Ex2{
    public static void main(String[] args) {
        String validEmails =  "";
        String userInput;
        int validCount = 0;
        String validationResult;

        for (int i = 0; i < 5; i++) {
            userInput = JOptionPane.showInputDialog("Loop "+(i+1)+" - Enter an email address:");
            validationResult = isValidEmail(userInput);

            if (validationResult.equals("valid")) {
                validEmails += userInput + "\n";
                validCount++;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid email address!\n" + validationResult, "Invalid Email", JOptionPane.ERROR_MESSAGE);
                userInput = JOptionPane.showInputDialog("Loop "+(i+1)+" - Enter an email address:");
                validationResult = isValidEmail(userInput);
            }
        }

        if (validCount < 0) {
            JOptionPane.showMessageDialog(null, "No valid email addresses were entered.", "Valid Email", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"The list of valid emails entered is: \n\n"+validEmails,"Valid Email",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static String isValidEmail(String email) {
        if (email.length() < 7 || email.length() > 322) {
            return "Email length must be between 7 and 322 characters (inclusive).";
        }

        if (!email.contains("@")) {
            return "Email must contain the '@' symbol.";
        }

        String[] parts = email.split("@");
        if (parts.length != 2) {
            return "Invalid format: Email should have only one '@' symbol.";
        }

        String recipientName = parts[0];
        String domainPart = parts[1];

        if (recipientName.length() < 1 || recipientName.length() > 64) {
            return "Recipient name must be between 1 and 64 characters (inclusive).";
        }

        if (!recipientName.matches("[A-Za-z0-9-_\\.]+")) {
            return "Recipient name contains invalid characters.";
        }

        if (domainPart.length() < 2 || domainPart.length() > 253) {
            return "Domain name must be between 2 and 253 characters (inclusive).";
        }

        if (!domainPart.matches("[A-Za-z0-9-\\.]+")) {
            return "Domain name contains invalid characters.";
        }

        if (!(domainPart.endsWith(".org") || domainPart.endsWith(".com") || domainPart.endsWith(".net") || domainPart.endsWith(".ie"))) {
            return "Invalid top-level domain. It should end with '.org', '.com', '.net', or '.ie'.";
        }

        return "valid";
    }
}
