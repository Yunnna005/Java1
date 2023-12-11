package finalExam22_23;

import java.awt.*;

public class Rectangle extends AbstractShape implements Drawable{
    private Color colour;
    private boolean filled;

    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY, Color color, boolean filled) {
        super(topLeftX, topLeftY, bottomRightX, bottomRightY);
        this.colour = color;
        this.filled = filled;
    }

    @Override
    public void setColor(Color color) {
        this.colour = color;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public Color getColor() {
        return colour;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    public String getType(){
        return "Rectangle";
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(colour);

        if(!filled)
            g.drawRect(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
        else
            g.fillRect(getTopLeftX(), getTopLeftY(),getWidth(), getHeight());
    }

    @Override
    public String toString() {
        String filledString = null;
        if(isFilled()){
            filledString = "yes";
        } else if (!isFilled()) {
            filledString = "no";
        }
        return "\n\nType: "+getType()+super.toString()+
                "\nWidth: "+getWidth()+"\nHeight: "+getHeight()+
                "\nCoroul: "+getColor()+"\nFilled: "+filledString;
    }
}
