package labsheet13.exersice1;

public class Vehicle {
    protected double price;
    protected double length;
    protected double height;
    protected double weight;
    protected String manufacture ;
    protected String model ;


    public Vehicle() {
        this(0.0, 0.0, 0.0, 0.0, "No manufacture specified","mo model specified");
    }

    public Vehicle(double price, double length, double height, double weight, String manufacture, String model) {
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacture(manufacture);
        setModel(model);
    }

    public double getPrice() {return price;}
    public void setPrice(double price) {
        this.price = price;
    }
    public double getLength() {return length;}
    public void setLength(double length) {
        this.length = length;
    }
    public double getHeight() {return height;}
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {return weight;}
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getManufacture() {return manufacture;}
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    public String getModel() {return model;}
    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "\nPrice: "+getPrice()+"\nLength: "+getLength()+"\nHeight: "+getHeight()+
                "\nWeight: "+getWeight()+"\nManufacture: "+getManufacture()+"\nModel: "+getModel();
    }
}
