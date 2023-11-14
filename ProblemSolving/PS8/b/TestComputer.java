package PS8.b;

public class TestComputer {
    public static void main(String[] args) {
        System.out.print("Displaying the state of the 3 Computer objects at this point ");
        Computer pc1 = new Computer(new Case("Optiplex 7010","Dell", 240,
                new Dimension(275,250,100)),
                "Acer 5363", "Asus 2345");

        Computer pc2 = new Computer(new Case("Optiplex GX620", "Dell",230,
                new Dimension(315,300,120)),
                "LG 3241", "Intel 6533");

        Computer pc3 = new Computer(new Case("i-Blason", "Apple", 115,
                new Dimension(250, 275, 110)),
                "HP 5433", "AMD 1942");

        Computer[] allComputers = new Computer[3];
        allComputers[0] = pc1;
        allComputers[1] = pc2;
        allComputers[2] = pc3;

        for (int i = 0; i< allComputers.length; i++){
            System.out.println("\n\nComputer "+(i+1)+"\n\n"+allComputers[i]);
        }

        System.out.println("\n\nNow displaying a list of any Computer objects whose case model includes the word \"Optiplex\" \n\n");
        String list = "";

        for(int i = 0; i< allComputers.length; i++){
            if (allComputers[i].getComputerCase().getModel().toLowerCase().contains("optiplex"));
            list += allComputers[i]+"\n\n";
        }

        System.out.println("\n\n"+list);
    }
}
