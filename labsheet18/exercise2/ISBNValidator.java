package labsheet18.exercise2;

//ISBNValidator.java
/*This utility class contains a validation routine for reading in an ISBN and validating
it according to a set of criteria*/

import javax.swing.*;

public class ISBNValidator {

	public static void main(String args[])
	{
		String ISBN;

		ISBN = JOptionPane.showInputDialog("Please enter an ISBN");
			
		while(!isValidISBN(ISBN)) {
				ISBN = JOptionPane.showInputDialog("Invalid Input! Please re-enter ISBN");
		}
	}


	public static boolean isValidISBN(String ISBN){

		int j;

		if(ISBN.length()==10) {
			for (j = 0; j <= 8; j++)
				if (!Character.isDigit(ISBN.charAt(j)))
					break;

			if (j == 9)
				if (Character.isDigit(ISBN.charAt(9)) || ISBN.charAt(9) == 'X' || ISBN.charAt(9) == 'x') {
					int sum = 0;
					int lastCharAsInt;

					for (j = 0; j <= 8; j++)
						sum += Character.getNumericValue(ISBN.charAt(j)) * (10 - j);

					if (Character.isDigit(ISBN.charAt(9)))
						lastCharAsInt = Character.getNumericValue(ISBN.charAt(9));
					else
						lastCharAsInt = 10;

					if (11 - sum % 11 == lastCharAsInt)
						return true;
				}
		}
		return false;
	}
}