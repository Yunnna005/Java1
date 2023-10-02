package labsheet3;

import java.util.Scanner;

public class counterControlledWhile {//
    public static void main(String[] args) {
        String name, nameOver20 = "", nameStartingWithA = "";
        int totalLength=0, count=0;

        Scanner input = new Scanner(System.in);

        while (count < 10){
            System.out.print("Enter the name of persone "+ (count+1)+": ");
            name = input.nextLine();

            if (name.length()>20){
                nameOver20 += name + "\n";
            }
            totalLength += name.length();
            if (name.charAt(0) == 'A'){
                nameStartingWithA += name + "\n";
            }
            count++;
        }
        String line = "=".repeat(27);
        System.out.println("\n\n\n"+line+"\n\tProgram Results\n"+line+"\n\nList of names containing 20 characters: \n"+
                nameOver20+"\n\nList of names beginning with A: \n"+nameStartingWithA+
                "\nAverage length of the names: "+ String.format("%.0f",totalLength/10f));
    }
}
