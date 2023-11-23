package labsheet14.exercise1;

public class SelfEmployedWorker extends Employee{
    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName, double estimatedIncome) {
        super(firstName, lastName);
        setEstimatedIncome(estimatedIncome);
    }

    public double getEstimatedIncome() {return estimatedIncome;}
    public void setEstimatedIncome(double estimatedIncome) {
        this.estimatedIncome = estimatedIncome;
    }
    public double earnings() {
        return estimatedIncome;
    }
    public String toString() {
        return "\nSelf-employed worker's name is "+super.toString();
    }
}
