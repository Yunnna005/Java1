package labsheet14.exersice2;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String type) {
        super(type);
    }

    public double area() {
        return Math.PI*majorAxis*minorAxis;
    }

    public double perimeter() {
        return Math.PI*Math.sqrt(((majorAxis*majorAxis)+(minorAxis*minorAxis))/2);
    }

    public Ellipse(String type, double majorAxis, double mijorAxis) {
        super(type);
        this.majorAxis = majorAxis;
        this.minorAxis = mijorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    @Override
    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
