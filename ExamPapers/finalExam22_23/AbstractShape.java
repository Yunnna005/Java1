package finalExam22_23;

public class AbstractShape {
    private int topLeftX;
    private int topLeftY;
    private int bottomRightX;
    private int bottomRightY;

    public AbstractShape(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        setTopLeftX(topLeftX);
        setTopLeftY(topLeftY);
        setBottomRightX(bottomRightX);
        setBottomRightY(bottomRightY);
    }

    public int getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(int topLeftX) {
        this.topLeftX = topLeftX;
    }

    public int getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(int topLeftY) {
        this.topLeftY = topLeftY;
    }

    public int getBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(int bottomRightX) {
        this.bottomRightX = bottomRightX;
    }

    public int getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(int bottomRightY) {
        this.bottomRightY = bottomRightY;
    }

    public int getWidth(){
        return Math.abs(topLeftX-bottomRightX);
    }

    public int getHeight(){
        return Math.abs(topLeftY-bottomRightY);
    }


    @Override
    public String toString() {
        return "\nTop-left coordinates: ("+getTopLeftX()+","+getTopLeftY()+")"+
                "\nBottom-right coordinates: ("+getBottomRightX()+","+getBottomRightY()+")";

    }
}
