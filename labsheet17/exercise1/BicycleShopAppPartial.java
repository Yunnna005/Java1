package labsheet17.exercise1;

//GUI for a Bicycle-shop application
/*This program creates a GUI that uses some menus for managing details about the
bicycles for sale/repair in a shop. It is possible to add, amend and remove bicycles from stock as well
as viewing the bicycles in the shop. It contains file creation/manipulation with exception-handling*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;


public class BicycleShopAppPartial extends JFrame implements ActionListener {

    private JMenu bikeMenu;

    //You may need to rename the file location depending on where it is within
    //your IntelliJ project
    private final File file = new File("labsheet17/exercise1/bicycles.data");

    private ArrayList<Bicycle> allBikes = new ArrayList<>();

    public BicycleShopAppPartial( ) {
        super("Bike Shop System");

        Container pane = getContentPane();
        pane.setBackground(new Color(240,210,240));

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        createBikeMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(bikeMenu);

        //You may need to rename the file location depending on where it is within
        //your IntelliJ project

        ImageIcon icon = new ImageIcon("labsheet17/exercise1/bike.png");
        setIconImage(icon.getImage());

        setSize(400,400 );


        addWindowListener(new WindowAdapter()  {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Confirmation",JOptionPane.YES_NO_OPTION);

                if(option == JOptionPane.YES_OPTION) {
                    //serialise array-list before exiting - you must code this method
                    saveFile();

                    System.exit(0);
                }
            }
        });

        //create a new file if none exists or read from and deserialise the contents
        //of the file, linking the contents to the allBikes array-list. You must
        //code this method
        openFile();

        setVisible(true);
    }

    public static void main( String[] args ) {
        BicycleShopAppPartial frame = new BicycleShopAppPartial();
    }



    private void createBikeMenu(){

        bikeMenu = new JMenu("Bicycle");

        String[] itemNames = {"Add","Amend","Remove","View"};

        for (String itemName : itemNames) {

            JMenuItem item = new JMenuItem(itemName);
            item.addActionListener(this);
            bikeMenu.add(item);
        }
    }


    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Add")) {
            JOptionPane.showMessageDialog(null, "Adding new bicycle details",
                    "Adding Bike", JOptionPane.INFORMATION_MESSAGE);
            addBike(); //you'll be coding this method
        }
        else if(e.getActionCommand().equals("Amend")) {
            JOptionPane.showMessageDialog(null, "Amending bicycle details",
                    "Amending Bike", JOptionPane.INFORMATION_MESSAGE);
            amendBike(); //you'll be coding this method
        }

        else if(e.getActionCommand().equals("Remove")) {
            JOptionPane.showMessageDialog(null, "Removing bicycle details",
                    "Removing Bike", JOptionPane.INFORMATION_MESSAGE);
            removeBike();
        }
        else {
            JOptionPane.showMessageDialog(null, "Viewing bicycle details",
                    "Viewing Bike", JOptionPane.INFORMATION_MESSAGE);
            viewBikes();
        }

    }


    public void openFile() {
        try{
            if (!file.exists()){
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "Created a new file to store bicycle details!",
                        "New File", JOptionPane.INFORMATION_MESSAGE);
            }else{
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                allBikes = (ArrayList<Bicycle>) objectInputStream.readObject();
                objectInputStream.close();
                JOptionPane.showMessageDialog(null, "Opened the file that stores bicycle details",
                        "Opened File", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Class of object requested could not be found by the JVM in the classpath",
                    "Error",JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }catch (ClassCastException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Class of object deserialised not a match for anything used in this application",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void saveFile() {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(allBikes);
            objectOutputStream.close();
            JOptionPane.showMessageDialog(null, "Saved the file that stores bicycle details",
                    "Saved File", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "File could not be found!",
                    "Problem Finding File!", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "File could not be written!",
                    "Problem Writing to File!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addBike() {
        new AddBikeDetailsGUI(allBikes);
    }

    public void amendBike() {
        String bikeOwner = JOptionPane.showInputDialog("Please enter the name of the owner for the bike you wish to amend");

        if (bikeOwner == null){
            JOptionPane.showMessageDialog(null, "You must enter a value for the bike owner", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean ownerFound = false;
        Bicycle bikeFound = null;

        for(int i = 0; i<allBikes.size(); i++){
            if (allBikes.get(i).getOwner().equals(bikeOwner)){
                ownerFound = true;
                bikeFound = allBikes.get(i);
                break;
            }
        }
        if(!ownerFound){
            JOptionPane.showMessageDialog(null, "This owner name could not be found!", "No such owner!",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            new AmendBikeDetailsGUI(bikeFound);
        }
    }

    public void removeBike() {
        String bikeOwner = JOptionPane.showInputDialog("Please enter the name of the owner for the bike you wish to remove");

        if (bikeOwner == null) {
            JOptionPane.showMessageDialog(null, "You must enter a value for the bike owner!", "Error!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean ownerFound = false;

        Bicycle bikeFound = null;

        for (int i = 0; i < allBikes.size(); i++)
            if (allBikes.get(i).getOwner().equals(bikeOwner)) {
                ownerFound = true;
                bikeFound = allBikes.get(i);
                break;
            }

        if (!ownerFound)
            JOptionPane.showMessageDialog(null, "This owner name could not be found!", "No such owner!",
                    JOptionPane.ERROR_MESSAGE);
        else
            new RemoveBikeDetailsGUI(allBikes, bikeFound);
    }


    public void viewBikes() {
        String bikeData = "";

        if (allBikes != null){
            for(Bicycle bike: allBikes){
                bikeData += bike + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Details of bicycles read from file are:\n\n" + bikeData,
                "Bicycle Details", JOptionPane.INFORMATION_MESSAGE);
    }
}