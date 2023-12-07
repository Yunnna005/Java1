package labsheet17.exercise1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveBikeDetailsGUI extends JFrame {
    private Insets normalInsets = new Insets(10, 10, 0, 10);
    private Insets topInsets = new Insets(30, 10, 0, 10);
    private JTextField ownerField;
    private JTextField priceField;
    private JTextField makeField;

    private static ArrayList<Bicycle> allBikes;
    private Bicycle bike;

    public RemoveBikeDetailsGUI(ArrayList<Bicycle> allBikes, Bicycle bike){
        super("Remove Bike Details");
        this.bike = bike;

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        panel1.add(Box.createVerticalStrut(50));
        panel1.add(createTitlePanel());
        panel1.add(createDetailsPanel());
        panel1.add(Box.createVerticalStrut(40));
        panel1.add(createSubmitPanel());
        panel1.add(Box.createVerticalStrut(20));

        add(panel1);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500,400);
        setLocation(150,150);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new RemoveBikeDetailsGUI(allBikes, null);
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
        JButton updateButton = new JButton("Remove Bike");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allBikes.remove(bike);

                JOptionPane.showMessageDialog(null, "Bike Removed Successfully", "Removed Bike", JOptionPane.INFORMATION_MESSAGE);}
        });

        panel.add(updateButton);

        return panel;
    }
}
