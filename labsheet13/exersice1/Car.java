package labsheet13.exersice1;

public class Car extends Vehicle{
    private int maxPassengers;
    private String registrationNumber;

    public Car() {
        this.maxPassengers = 0;
        this.registrationNumber = "No registration number specified";
    }

    public Car (double price, double length, double height, double weight, String manufacture, String model,int maxPassengers, String registrationNumber) {
        super(price,length,height,weight,manufacture,model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    public int getMaxPassengers() {return maxPassengers;}
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    public String getRegistrationNumber() {return registrationNumber;}
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String toString() {
        return super.toString()+ "\nMax pessengers: "+
                getMaxPassengers()+ "\nRegistereation Number: "+getRegistrationNumber();
    }
}
