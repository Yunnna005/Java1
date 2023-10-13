package labsheet7;

import javax.swing.*;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        String[] playerNames = {"Rafael Nedal", "Andy Murray", "Roger Federer", "Stanislas Wawrinka", "Grigor Dinitrov"};
        String player;
        boolean found;

        Arrays.sort(playerNames);

        JOptionPane.showMessageDialog(null, "After sort: \n\n"+Arrays.toString(playerNames));
        player = JOptionPane.showInputDialog("Enter the name you seek: ");
        found = binarySearch(playerNames,player);

        if (found){
            JOptionPane.showMessageDialog(null,"The player found", "Found", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"The player was not found", "Not found", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }

    public static boolean binarySearch(String[] playerNames, String player) {
        int lowerSub = 0, higherSub = playerNames.length-1, middleSub;

        while(lowerSub<=higherSub) {
            middleSub = (lowerSub + higherSub) / 2;

            if (playerNames[middleSub].compareTo(player) < 0) {
                lowerSub = middleSub + 1;
            } else if (playerNames[middleSub].compareTo(player) > 0) {
                higherSub = middleSub - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
