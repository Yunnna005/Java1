package labsheet5;

import java.util.Scanner;

public class DistanceMethod {
    public static void main(String[] args) {

        double initialSpeed, acceleration, time;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial speed: ");
        initialSpeed = input.nextDouble();

        System.out.print("Enter the acceleration: ");
        acceleration = input.nextDouble();

        System.out.print("Enter the time spent traveling: ");
        time = input.nextDouble();

        System.out.println("\n\nThe distance traveled by the object is "+
                String.format("%.3f m",distance(initialSpeed,acceleration,time)));
    }
    public static double distance(double u, double a, double t){
        return u * t + 0.5 * a * t * t;
    }
}
