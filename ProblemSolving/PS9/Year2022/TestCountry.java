package PS9.Year2022;

import javax.swing.*;

public class TestCountry {
    public static void main(String[] args) {
        String text = "";

        City c1 = new City("Cork", 124391, new Location(51.8985, 8.4756));
        City c2 = new City("Galway", 79934, new Location(53.2707, 9.0568));
        City c3 = new City("Dublin", 544107, new Location(53.3498, 6.2603));
        City c4 = new City("Limerick", 194899, new Location(52.6638, 8.6267));
        City c5 = new City("Waterford", 53504, new Location(52.2593, 7.1101));

        City[] cityList = new City[5];
        cityList[0] = c1;cityList[1] = c2;cityList[2] = c3;cityList[3] = c4;cityList[4] = c5;

        Country country = new Country(  "Ireland","Dublin",4904000,70273, cityList, "euro", "English" );

        text = country.toString();

        JOptionPane.showMessageDialog(null, text, "Conuntry Details", JOptionPane.INFORMATION_MESSAGE);



    }
}
