package PS8.b;

public class Dimension {
    private int lenght;
    private int width;
    private int height;

    public Dimension(int lenght, int width, int height){
        setLenght(lenght);
        setWidth(width);
        setHeight(height);
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getLenght() {return lenght;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}

    public String toString(){
        return "Length: "+getLenght()+"\nWidth: "+getWidth()+" Height: "+getHeight();
    }
}
