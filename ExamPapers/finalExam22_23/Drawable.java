package finalExam22_23;

import java.awt.*;

public interface Drawable {
    public void setColor(Color color);
    public void setFilled(boolean filled);
    public  Color getColor();
    public boolean isFilled();
    public void draw(Graphics graphics);
}
