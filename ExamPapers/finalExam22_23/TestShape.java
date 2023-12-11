package finalExam22_23;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TestShape {
    public static void main(String[] args) {

        ArrayList<AbstractShape> shapes = new ArrayList<>();

        Rectangle redRec = new Rectangle(5,19,17,8, Color.RED,false );
        Rectangle orangeRec = new Rectangle(21,22,5,-5, Color.ORANGE,true );
        Rectangle greenRec = new Rectangle(45,20,64,10, Color.GREEN,false );

        Oval blackOv = new Oval(27,12,43,-2, Color.BLACK,true);
        Oval pinkOv = new Oval(32,65,12,33, Color.PINK,false );
        Oval magentaOv = new Oval(8,30,22,20, Color.MAGENTA,true );

        shapes.add(redRec); shapes.add(orangeRec);shapes.add(greenRec);
        shapes.add(blackOv); shapes.add(pinkOv); shapes.add(magentaOv);

/*        System.out.println("Displaying the state of all the shape objects within the array-list \n");
        for (int i = 0; i<shapes.size(); i++){
            System.out.println("\nShape "+(i+1)+" Details"+
                    shapes.get(i));
        }*/

        Iterator<AbstractShape> iterator = shapes.iterator();
        while (iterator.hasNext()){
            AbstractShape shape = iterator.next();
            if(shape.getWidth()>17)
                iterator.remove();
        }
        System.out.println("Displaying the update state of all the shape objects within the array-list \n");

        for (int i = 0; i<shapes.size(); i++){
            System.out.println("\nShape "+(i+1)+" Details"+
                    shapes.get(i));
        }
    }
}
