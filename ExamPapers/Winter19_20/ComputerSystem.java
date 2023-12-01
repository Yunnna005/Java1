package Winter19_20;

import javax.swing.*;
import java.util.ArrayList;

public class ComputerSystem {
    public static void main(String[] args) {

        String text = "";
        ArrayList<Computer> computers = new ArrayList<>();

        Computer c1 = new makeComputer("Dell", "DDR2", 4);

        Laptop l1 = new Laptop("Toshiba", "DDR4", 8, true);
        Laptop l2 = new Laptop("Microsoft", "DDR2", 6, false);

        computers.add(c1);
        computers.add(l1);
        computers.add(l2);

        for (Computer c: computers) {
            text += c+"\n";
        }
        JOptionPane.showMessageDialog(null, text, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
