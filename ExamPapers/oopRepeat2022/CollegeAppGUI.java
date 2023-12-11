package oopRepeat2022;

//GUI for a college application
/*This basic GUI presents a GUI interface that enables the end-user to do various things such as
add a new employee, remove an employee and view the list of employees*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CollegeAppGUI extends JFrame implements ActionListener {

    private JMenu employeeMenu;
    private ArrayList<Employee> allEmployees = new ArrayList<>();

    public CollegeAppGUI()  {

        super("College System");

        Container pane = getContentPane();
        pane.setBackground(new Color(160,230,210));

        createEmployeeMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(employeeMenu);

        setSize(400,400 );
        setLocation(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main( String[] args ) {
        new CollegeAppGUI();
    }

    private void createEmployeeMenu() {

        employeeMenu = new JMenu("Employee");

        //Add code here to create the menu items required and add them to the menu
        //Each menuitem should have an action-listener added to it so that action
        //events that occur on them can be detected and handled in the actionPerformed()
        //method below


    }


    public void actionPerformed (ActionEvent e){

        if (e.getActionCommand().equals("Add")) {

            //addEmployeeGUI();  //uncomment this once you have the addEmployeeGUI() method coded
        }
        else if (e.getActionCommand().equals("Remove"))

            JOptionPane.showMessageDialog(null, "Removing employee - not implemented yet",
                    "Removing Employee", JOptionPane.INFORMATION_MESSAGE);

        else if (e.getActionCommand().equals("View")) {
            viewEmployees();
        }
        else if (e.getActionCommand().equals("Quit")) {

            JOptionPane.showMessageDialog(null, "Thanks for using the system!!",
                    "Exiting System", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

/*    public void addEmployeeGUI(){
        new AddEmployeeGUI();
    }*/





    public void viewEmployees() {

        int i = 1;

        if(allEmployees.size() > 0)
            for (Employee employee : allEmployees) {
                JOptionPane.showMessageDialog(null,"Employee " + i + "\n\n" + employee + "\n\n",
                        "Employee Details",JOptionPane.INFORMATION_MESSAGE);
                i++;
            }
        else
            JOptionPane.showMessageDialog(null,"No employees added yet!",
                    "Employee Details",JOptionPane.INFORMATION_MESSAGE);

    }
}



