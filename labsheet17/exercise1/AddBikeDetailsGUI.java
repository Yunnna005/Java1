package labsheet17.exercise1;

//AddBikeDetailsGUI.java
/*This program uses box-layout and gridbag-layout managers in combination with a
number of panels to create a GUI designed to take in some bike details.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class AddBikeDetailsGUI extends JFrame {

    private Insets normalInsets = new Insets(10, 10, 0, 10);
    private Insets topInsets = new Insets(30, 10, 0, 10);
    private JTextField ownerField;
    private JTextField priceField;
    private JTextField makeField;

    private ArrayList<Bicycle> allBikes;

    public AddBikeDetailsGUI(ArrayList<Bicycle> allBikes)  {

        super("Add Bike Details");

        this.allBikes = allBikes;

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(Box.createVerticalStrut(50));
        panel.add(createTitlePanel());
        panel.add(createDetailsPanel());
        panel.add(Box.createVerticalStrut(40));
        panel.add(createSubmitPanel());
        panel.add(Box.createVerticalStrut(20));

        add(panel);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500,400);
        setLocation(150,150);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args){
         new AddBikeDetailsGUI(null);
    }

    private JPanel createTitlePanel() {

        JPanel panel = new JPanel();

        JLabel titleLabel = new JLabel("Bike Details");
        titleLabel.setFont(new Font("serif",Font.PLAIN,20));

        panel.add(titleLabel);

        return panel;
    }

    private JPanel createDetailsPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        int gridy = 0;

        JLabel ownerLabel = new JLabel("Owner");
        addComponent(panel, ownerLabel, 0, gridy, 1, 1, topInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        ownerField = new JTextField(25);
        addComponent(panel, ownerField, 1, gridy++, 1, 1, topInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        JLabel priceLabel = new JLabel("Price");
        addComponent(panel, priceLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        priceField = new JTextField(25);
        addComponent(panel, priceField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        JLabel makeLabel = new JLabel("Make");
        addComponent(panel, makeLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        makeField = new JTextField(25);

        addComponent(panel, makeField, 1, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        return panel;
    }

    private void addComponent(Container container, Component component,
                              int gridx, int gridy, int gridwidth, int gridheight, Insets insets,
                              int anchor, int fill) {

        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy,
                gridwidth, gridheight, 0.0, 0.0, anchor, fill, insets, 5, 5);

        container.add(component, gbc);
    }

    private JPanel createSubmitPanel() {

        JPanel panel = new JPanel();

        JButton addButton = new JButton("Add Bike");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //A new Bicycle object gets created when the "Add" button is pressed
                //using the values entered onto the text-fields

                Bicycle bike = new Bicycle(ownerField.getText(), Double.parseDouble(priceField.getText()),
                        makeField.getText());

                //the object is then added onto the array-list

                allBikes.add(bike);

                JOptionPane.showMessageDialog(null, "Bike details added\n\nDetails are -  " + bike, "Added Bike", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panel.add(addButton);

        return panel;
    }
}
