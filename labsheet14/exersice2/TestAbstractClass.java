package labsheet14.exersice2;

//TestAbstractClass.java
/*A driver class to test out the Shape, Circle and Rectangle classes*/

public class TestAbstractClass {
      public static void main(String[] args) {

          Circle circle1 = new Circle();

          Circle circle2 = new Circle(5.5);

          Rectangle rectangle1 = new Rectangle();

          Rectangle rectangle2 = new Rectangle(4.3, 1.8);

          Triangle tr1 = new Triangle("Triangle",3.24,4.23,5.78);

          Ellipse el1 = new Ellipse("Ellipse", 5.62,4.19);
          Shape[] allShapes = {circle1, circle2, rectangle1, rectangle2, tr1, el1};

          System.out.println("\n\nDetails of all Shape objects contained in the Shape array: \n");
          for (int i = 0; i < allShapes.length; i++)
              System.out.println(allShapes[i] + "\n\n");
      }
}