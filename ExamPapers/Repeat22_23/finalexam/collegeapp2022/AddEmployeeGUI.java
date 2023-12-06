package Repeat22_23.finalexam.collegeapp2022;

//AddEmployeeGUI.java
/*This program uses box-layout and gridbag-layout managers in combination with a
number of panels to create a GUI designed to take in employee details*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class AddEmployeeGUI extends JFrame implements ActionListener, ItemListener {

    private Insets normalInsets = new Insets(10, 10, 0, 10);

    private Insets topInsets = new Insets(30, 10, 0, 10);

    private ArrayList<Employee> allEmployees;

    private JTextField nameField, addressField, mobileField, tNumberField, dateOfBirthField, roleField, pointOnScaleField,
            officeField;

    private JComboBox<String> allWorkPatterns;

    private String workPattern;

    private String employeeType;

    private JRadioButton academic;

    private JLabel dutiesOrCoursesLabel;

    JTextField[] dutiesFields;

    public AddEmployeeGUI(ArrayList<Employee> allEmployees)  {

        super("Add Employee Details");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        //panel.add(createTitlePanel()); //uncomment this once you have createTitlePanel() coded
        panel.add(createDetailsPanel());
        panel.add(Box.createVerticalStrut(40));
        panel.add(createSubmitPanel());
        panel.add(Box.createVerticalStrut(20));

        add(panel);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600,500);
        setLocation(300,300);
        setVisible(true);

        this.allEmployees = allEmployees;
    }

    //Add code here to create the createTitlePanel() method. This method will create a panel. It then creates a label
    //with the text "Employee Details" on it. It uses a "Book Antiqua" font with a bold style and a point size of 20
    //for this text. It then adds the label to the panel and finally it returns a reference to the panel




    private JPanel createDetailsPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        int gridy = 0;


        JLabel nameLabel = new JLabel("Name");
        addComponent(panel, nameLabel, 0, gridy, 1, 1, topInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        nameField = new JTextField(25);
        addComponent(panel, nameField, 1, gridy++, 2, 1, topInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel addressLabel = new JLabel("Address");
        addComponent(panel, addressLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        addressField = new JTextField(25);
        addComponent(panel, addressField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel mobileLabel = new JLabel("Mobile Number");
        addComponent(panel, mobileLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        mobileField = new JTextField(15);
        addComponent(panel, mobileField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel tNumberLabel = new JLabel("T-number");
        addComponent(panel, tNumberLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        tNumberField = new JTextField(15);
        addComponent(panel, tNumberField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel dateOfBirthLabel = new JLabel("Date of Birth");
        addComponent(panel, dateOfBirthLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        dateOfBirthField = new JTextField(15);
        addComponent(panel, dateOfBirthField, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel employeeTypeLabel = new JLabel("Type");
        addComponent(panel, employeeTypeLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JPanel radioButtonsPanel = new JPanel();

        academic = new JRadioButton("Academic");
        radioButtonsPanel.add(academic);
        academic.setSelected(true);
        employeeType = "academic";

        JRadioButton finance = new JRadioButton("Finance");
        radioButtonsPanel.add(finance);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(academic);
        buttonGroup.add(finance);

        academic.addItemListener(this);
        finance.addItemListener(this);

        addComponent(panel, radioButtonsPanel, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JLabel categoryLabel = new JLabel("Work Pattern");
        addComponent(panel, categoryLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        createWorkPatternCombo();

        addComponent(panel, allWorkPatterns, 1, gridy++, 1, 1, normalInsets,
                        GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JPanel rolePOSOfficePanel = new JPanel();
        rolePOSOfficePanel.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));

        JLabel roleLabel = new JLabel("Role  ");
        rolePOSOfficePanel.add(roleLabel);

        roleField = new JTextField(15);
        rolePOSOfficePanel.add(roleField);

        JLabel pointOnScaleLabel = new JLabel("  Point on Scale  ");
        rolePOSOfficePanel.add(pointOnScaleLabel);

        pointOnScaleField = new JTextField(5);
        rolePOSOfficePanel.add(pointOnScaleField);

        JLabel officeLabel = new JLabel("  Office  ");
        rolePOSOfficePanel.add(officeLabel);

        officeField = new JTextField(7);
        rolePOSOfficePanel.add(officeField);

        addComponent(panel, rolePOSOfficePanel, 0, gridy++, 2, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        dutiesOrCoursesLabel = new JLabel("Courses Taught");
        addComponent(panel, dutiesOrCoursesLabel, 0, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        JPanel dutiesOrCoursesFieldsPanel = new JPanel();

        //Add code here to create a GridLayout manager object having 2 rows and 3 columns
        //The panel above should then use this layout manager
        //An array of 6 text-fields should then be created and assigned to the reference dutiesField
        //A for loop should be written that iterates 6 times and each time it iterates a new
        //JTextField is created and added to the array just created. Also each text-field created is
        //added to the panel above





        addComponent(panel, dutiesOrCoursesFieldsPanel, 1, gridy, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE);

        return panel;
    }


    private void createWorkPatternCombo(){

        String[] workPatterns = new String[]{"fulltime", "halftime", "prorata"};

        allWorkPatterns = new JComboBox<>(workPatterns);

        allWorkPatterns.addItemListener(this);

        allWorkPatterns.setSelectedIndex(0);

    }

    public void itemStateChanged(ItemEvent e) {

        if(e.getSource() == allWorkPatterns)
            workPattern = (String) allWorkPatterns.getSelectedItem();

        else if(e.getSource() == academic) {
            employeeType = "academic";

            dutiesOrCoursesLabel.setText("Courses Taught");

            allWorkPatterns.removeAllItems();
            allWorkPatterns.addItem("fulltime");
            allWorkPatterns.addItem("halftime");
            allWorkPatterns.addItem("prorata");

        }
        else {
            employeeType = "finance";

            dutiesOrCoursesLabel.setText("Duties");

            allWorkPatterns.removeAllItems();
            allWorkPatterns.addItem("fulltime");
            allWorkPatterns.addItem("halftime");

        }
    }

    private void addComponent(Container container, Component component,
                              int gridx, int gridy, int gridwidth, int gridheight, Insets insets,
                              int anchor, int fill) {

        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy,
                gridwidth, gridheight, 0.0, 0.0, anchor, fill, insets, 0, 0);

        container.add(component, gbc);
    }



    private JPanel createSubmitPanel() {

        JPanel panel = new JPanel();

        JButton submitButton = new JButton("Add Employee");

        panel.add(submitButton);

        submitButton.addActionListener(this);

        return panel;
    }



    public void actionPerformed(ActionEvent e) {

        String dateOfBirth = dateOfBirthField.getText();

        int day = Integer.parseInt(dateOfBirth.substring(0,2));
        int month = Integer.parseInt(dateOfBirth.substring(3,5));
        int year = Integer.parseInt(dateOfBirth.substring(6,10));



        String[] dutiesOrCoursesValues = new String[6];

        int i = 0;

        for (JTextField dutyField: dutiesFields) {
            dutiesOrCoursesValues[i] = dutyField.getText();

            i++;
        }


        //Add code that will attempt to do the following (try-catch code is required)
        //Check whether the value of employeeType is "academic" - if it is then create a new AcademicStaff object from the
        //values entered and selected on the GUI. If it isn't "academic" then create a new FinanceStaff object from these
        //values. Once the object is created, add it to the allEmployees array-list.
        //The catch clause will display a message-dialog indicating "Invalid point on scale value entered!"






        JOptionPane.showMessageDialog(null,"New Employee Added!!","Employee Added",JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
}
