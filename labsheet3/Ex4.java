package labsheet3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double enteredWeight, avgWeight, totalWeight = 0, WeightOver80 = 0, percentOver80;
        double heaviestWeight = -1;
        double lighestWeight = Double.MAX_VALUE;

        for (int i = 0; i<5; i++) {
            System.out.print("Enter the weight of person "+(i+1)+": ");
            enteredWeight = input.nextDouble();

            totalWeight += enteredWeight;

            if (enteredWeight > heaviestWeight) {
                heaviestWeight = enteredWeight;
            }
            else if (enteredWeight < lighestWeight){
                lighestWeight = enteredWeight;
            }
            if (enteredWeight >= 80){
                WeightOver80 ++;
            }
        }

        avgWeight = totalWeight/5;
        percentOver80 = (WeightOver80/5)*100;
        String line = "=".repeat(27);
        System.out.println("\n\n"+line+"\n\tProgram Result\n"+line+"\n");
        System.out.printf("Average weight: %.2f kg",avgWeight);
        System.out.print("\nPercentage >= 80kg: "+percentOver80+"%"+
                "\nHeaviest weight: "+heaviestWeight+"kg"+
                "\nLighest weight: "+lighestWeight+"kg");

    }
}
