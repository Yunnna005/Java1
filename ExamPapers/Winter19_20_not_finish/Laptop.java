package Winter19_20_not_finish;

public class Laptop extends Computer implements Serializable{
    private boolean touchScreen;


    public Laptop(String make, String type, int size, boolean touchScreen) {
        super(make, type, size);
        setTouchScreen(touchScreen);
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nTouch Screen: "+isTouchScreen();
    }
}
