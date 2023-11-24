package labsheet16.exercise1;

//TestComputer.java
/*A driver class for the Computer class that uses a for-each loop*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestComputer {
    public static void main(String[] args) {

        double totalPrice=0;
        Computer highestSpeedComputer;
        ArrayList<Computer> exceed500 = new ArrayList<>();
        ArrayList<Computer> tabletType = new ArrayList<>();

        Computer c1 = new Computer();
        Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);
        Computer c3 = new Computer("Apple","Tablet",3.65,8,500.25);
        Computer c4 = new Computer("Sun","Server",4.25,32,1768.45);
        Computer c5 = new Computer("Lenovo", "Desktop", 2.86, 14, 457.34);


        Computer[] allComputers = {c1,c2,c3,c4, c5};

        highestSpeedComputer = allComputers[0];

        System.out.println("\n\nDetails of all Computers in the array\n");
        for (Computer c:allComputers) {
            totalPrice += c.getPrice();

            if(c.getSpeed()>highestSpeedComputer.getSpeed())
                highestSpeedComputer = c;

            if (c.getPrice() > 500) {
                exceed500.add(c);
            }

            if (Objects.equals(c.getType(), "Tablet")) {
                tabletType.add(c);
            }
            System.out.println(c);
        }

        System.out.println("\n\nSome additional information\n\nAverage computer price is: €" + String.format("%.2f",totalPrice/allComputers.length)+
                "\nDetails of highest speed computer: " + highestSpeedComputer);

        System.out.println("\n\nList of computers whose price exceeds €500: \n");
        for (Computer computer : exceed500) {
            System.out.println(computer);
        }

        System.out.println("\n\nList of computers that are tablets: \n");
        for (Computer tablet : tabletType) {
            System.out.println(tablet);
        }

        System.out.println("\n\n\n\nUpdated details of all Computers in the array \n\n");
        for (Computer c:allComputers) {
            if (Objects.equals(c.getManufacturer(), "Lenovo")){
                c.setManufacturer("Dell");
            }
            System.out.println(c);
        }
    }
}
