package labsheet13.exersice1;

public class TestVehicle {
    public static void main(String[] args) {
        String text = "";

        text = "Testing the Car no-arg constructor:  \n";
        Car c1 = new Car();
        text += c1.toString();

        text += "\n\n Testing the Car multi-arg constructor:  \n\n";
        Car c2 = new Car(100000.0, 4.5,1.25,2000.0,
                "Ferrari", "F2", 2,"05KY1");
        text += c2.toString();

        text += "\n\nTesting the Bicycle no-arg constructor:  \n";
        Bicycle b1 = new Bicycle();
        text+=b1.toString();

        text+="\n\nTesting the Bicycle multi-arg constructor:  \n";
        Bicycle b2 = new Bicycle(500.0,1.5,1.0,50.0,"Raleigh", "Mountanbike",4,true);
        text += b2.toString();

        System.out.print(text);
    }
}
