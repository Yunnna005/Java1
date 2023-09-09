package labsheet2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double st;
        double cost1;
        double cost2;
        double cost3;

        String line = "=".repeat(27);
        System.out.println(line+"\n\tCar Park Calculator\n"+line+"\n\n");

        System.out.print("Enter the amount of time in hours: ");
        st = input.nextDouble();
        if (st < 0){
            System.out.println("Error!");
            return;
        }

        if (st == 0){
            System.out.println("Total cost for 0 hours is 0$");
            return;
        }

        if (st>0 && st<=1){
            cost1 = st*60/100;
            System.out.printf("Total cost of parking for "+st+
                    " hours is $%.2f",cost1);
        }
        else if (st>1 && st<=3){
//            cost2 = (st*60-60)/60*50/100;
            cost2 = (1*60 + (st-1)*50)/100;
            System.out.printf("Total cost of parking for "+st+
                    " hours is $%.2f",cost2);
        }
        else if (st>3){
//            cost3 = st-(((st*60-60/)100)+((st*60-60)/60*50/100))*40/100;
            cost3 = (1*60 + 2*50 + (st-3)*40)/100;
            System.out.printf("Total cost of parking for "+st+
                    " hours is $%.2f",cost3);        }
    }
}
