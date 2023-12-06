package Winter19_20_not_finish;

public class Computer extends Memory implements Serializable{
    private static int numComputers;
    private String make;
    private Memory memory;

    public Computer(String make, String memType, int memSize) {
        super(memType,memSize);
        setMake(make);
        numComputers++;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public static int getNumComputers() {
        return numComputers;
    }
    @Override
    public String toString() {
        return "\nMake: "+getMake()+super.toString();
    }
}
