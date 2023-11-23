package labsheet13.exercise2;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle() {
        this.gearCount = 0;
        this.hasBell = false;
    }

    public Bicycle(double price, double length, double height, double weight, String manufacture, String model, int gearCount, boolean hasBell) {
        super(price, length, height, weight, manufacture, model);
        this.setGearCount(gearCount);
        this.setHasBell(hasBell);
    }

    public int getGearCount() {return gearCount;}
    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }
    public boolean isHasBell() {return hasBell;}
    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    public String toString() {
        String text;
        if(isHasBell())
            text="Yes";
        else
            text="No";
        return super.toString()+"\nHas bell: "+text+
                "\nGear Count: "+getGearCount();
    }
}
