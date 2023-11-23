package labsheet14.exercise1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes*/

public class TestPolymorphism {
    public static void main(String[] args) {

        Employee employeeRef;

        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);

        employeeRef = b1;

        System.out.println(employeeRef.toString() + " and the earnings were €" + String.format("%.2f",employeeRef.earnings()));

        employeeRef = hw1;

        System.out.println("\n" + employeeRef.toString() + " and the earnings were €" + String.format("%.2f",employeeRef.earnings()));

        SelfEmployedWorker se1 = new SelfEmployedWorker("Richard","Branson", 547);
        employeeRef = se1;
        System.out.print(employeeRef.toString() + " and the earnings were €" + String.format("%.2f",employeeRef.earnings()) );
    }
}