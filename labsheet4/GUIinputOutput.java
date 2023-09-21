package labsheet4;

import javax.swing.*;

public class GUIinputOutput {
    public static void main(String[] args) {
        String item, quantityAsString, priceAsString;
        int quantity;
        double price;

        item = JOptionPane.showInputDialog("Enter type of item: ");
        quantityAsString = JOptionPane.showInputDialog("Enter item quantity: ");
        priceAsString = JOptionPane.showInputDialog("Enter item price: ");

        quantity = Integer.parseInt(quantityAsString);
        price = Double.parseDouble(priceAsString);

        JOptionPane.showMessageDialog(null,"Item: "+
                item+"\nQuantity: "+quantity+"\nPrice: $"+price,"Item Details",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
