package finalExam22_23;

import java.awt.*;

public class Oval extends AbstractShape implements Drawable{
    private Color colour;
    private boolean filled;

    public Oval(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY, Color colour, boolean filled) {
        super(topLeftX, topLeftY, bottomRightX, bottomRightY);
        this.colour = colour;
        this.filled = filled;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(colour);

        if(!filled)
            g.drawOval(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
        else
            g.fillOval(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
    }

    @Override
    public void setColor(Color color) {
        this.colour=color;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public Color getColor() {
        return colour;
    }

    public String getType(){
        return "Oval";
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
                "\nColour: "+getColor()+"\nFilled: "+filledString;
    }
}
