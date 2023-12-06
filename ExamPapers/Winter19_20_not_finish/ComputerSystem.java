package Winter19_20_not_finish;

import javax.swing.*;
import java.util.ArrayList;

public class ComputerSystem {
    static ArrayList<Computer> computers = new ArrayList<>();
    public static void main(String[] args) {

        String text = "";

        makeComputer();
        makeLaptop();
        makeLaptop();
        for (Computer c: computers) {
            text += c+"\n";
        }
        JOptionPane.showMessageDialog(null, text, "Message", JOptionPane.INFORMATION_MESSAGE);

        //ArrayList largeMemLaptops = laptopsGreaterThanFour(computers);
    }

    public static void makeComputer(){
        String make = JOptionPane.showInputDialog("Enter who made");
        String type = JOptionPane.showInputDialog("Enter the type");
        int memSize = Integer.parseInt(JOptionPane.showInputDialog("Enter the memory size"));

        Computer c1 = new Computer(make, type, memSize);
        computers.add(c1);
    }
    public static void makeLaptop(){
        String make = JOptionPane.showInputDialog("Enter who made");
        String type = JOptionPane.showInputDialog("Enter the type");
        int memSize = Integer.parseInt(JOptionPane.showInputDialog("Enter the memory size"));
        int touchScreen = Integer.parseInt(JOptionPane.showInputDialog("TouchScreen: Yes - 1\n\t\t\tNo - 2"));

        boolean touchScreenBoolean;
        if (touchScreen == 1){
            touchScreenBoolean = true;
        }else{
            touchScreenBoolean = false;
        }

        Laptop l1 = new Laptop(make, type, memSize, touchScreenBoolean);
        computers.add(l1);
    }

    //public static void laptopsGreaterThanFour(ArrayList laptops){

    //}
}
