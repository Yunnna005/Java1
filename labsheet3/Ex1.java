package labsheet3;

import java.util.Scanner;

public class Ex1 {//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temp,result1;
        int totalConversions = 0;
        int tempExceed30 = 0;
        int tempBelow10 = 0;
        double avgtemp = 0;
        int tempPercentageMore20 = 0;
        double result2,result3 = 0;
        double celciusTemp;


        System.out.print("Enter the first Fahrenheit temp (below -459.67 to exit): ");
        temp = input.nextInt();

        while (temp > -459.67){
            totalConversions += 1;
            celciusTemp = (double)5/9*(temp-32);
            avgtemp += celciusTemp;
            System.out.print("The equivalent Celcius temp is "+celciusTemp);

            if (celciusTemp > 30){
                tempExceed30 += 1;
            } else if (celciusTemp < 10) {
                tempBelow10 += 1;
            } else if (celciusTemp>=20) {
                tempPercentageMore20 ++;

            }
            System.out.print("\nEnter the another Fahrenheit temp (below -459.67 to exit): ");
            temp = input.nextInt();
        }

        if (totalConversions == 0){
            System.out.println("\nNO conversions were performed ..... Goodbye");
        }
        else {
            result1 = avgtemp/totalConversions;
            result2 = (tempPercentageMore20*totalConversions)/100;
            String line = "=".repeat(27);
            System.out.println("\n\n"+line+"\n\tProgram Result\n"+line+"\n");
            System.out.println("Total conversions performed: "+totalConversions+
                    String.format("\nAverage Celcius temp: %.3f",result1)+
                    "\nTotal Celcius temp > 30C: "+tempExceed30+
                    "\nTotal Celcius temp <10C: "+tempBelow10+
                    "\nPercentage Celcius temp >= 20C: "+result2+" %");
        }

    }
}
