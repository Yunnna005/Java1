package labsheet6;

import java.util.Scanner;

public class validatingExamMarks {
    public static void main(String[] args) {
        int i = 1, mark = 0, totalMark = 0, highestMark = 0;
        String markAsString, prompt;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter the mark of student "+i+": ");
            markAsString = input.nextLine();

            prompt = isValidExamMark(markAsString);
            while (!prompt.equals("valid")){
                System.out.print("\n"+prompt+"re-enter the mark of student "+i+": ");
                markAsString = input.nextLine();

                prompt = isValidExamMark(markAsString);
            }

            mark = Integer.parseInt(markAsString);
            if (mark>highestMark){
                highestMark = mark;
            }
            totalMark += mark;
            System.out.println("\n");
            i++;
        }while (i<=5);
    }
    public static String isValidExamMark(String mark){
        char character;

        if(mark.length() < 1 || mark.length() > 3){
            return "invalid! Mark value must have between 1 and 3 character";

        }
        for (int i = 0;i<mark.length(); i++){
           character = mark.charAt(i);
           if (!Character.isDigit(character)){
               return "Invalid! Mark value must only contain digits.";
           }
        }
        int markAsInt = Integer.parseInt(mark);

        if (markAsInt<0 || markAsInt >100){
            return "Invalid! Mark value must be in the range 0-100 inclusive.";
        }
        return "valid";
    }
}
