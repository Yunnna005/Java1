package Winter19_20;

public abstract class Computer extends Memory implements Serializable{
    private int numComputers;
    private String make;
    private Memory memory;

    public Computer(String make, String memType, int memSize) {
        super(memType,memSize);
        setMake(make);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public static int getNumComputers(int Computers){
        return Computers++;
    }
    @Override
    public String toString() {
        return "\nMake: "+getMake()+super.toString();
    }
    public Computer makeComputer() {
        return new Computer(getMake(), super.getType(), super.getSize());
    }
}
