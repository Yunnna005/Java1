package labsheet14.exersice2;

public class Triangle extends Shape{
    private double side1Length;
    private double side2Length;
    private double side3Length;

    public Triangle(String type) {
        super(type);
        setSide1Length(0);
        setSide2Length(0);
        setSide3Length(0);
    }

    public double area() {
        double s = (getSide1Length()+getSide2Length()+getSide3Length())/2;
        return Math.sqrt(s*(s-getSide1Length())*(s-getSide2Length())*(s-getSide3Length()));
    }

    public double perimeter() {
        return getSide1Length()+getSide2Length()+getSide3Length();
    }

    public Triangle(String type, double side1Length, double side2Length, double side3Length) {
        super(type);
        setSide1Length(side1Length);
        setSide2Length(side2Length);
        setSide3Length(side3Length);
    }

    public double getSide1Length() {return side1Length;}
    public void setSide1Length(double side1Length) {
        if (side1Length>0){
            this.side1Length = side1Length;
        }else{
            this.side1Length = 0;
        }
    }
    public double getSide2Length() {return side2Length;}
    public void setSide2Length(double side2Length) {
        if (side2Length>0){
            this.side2Length = side2Length;
        }else{
            this.side2Length = 0;
        }
    }
    public double getSide3Length() {return side3Length;}
    public void setSide3Length(double side3Length) {
        if (side3Length>0){
            this.side3Length = side3Length;
        }else{
            this.side3Length = 0;
        }
    }

    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
