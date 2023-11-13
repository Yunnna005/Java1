package PS8.a;

import java.util.Arrays;
public class TestClass {
    public static void main(String[] args) {
        System.out.print("Displaying the state of the 3 Class objects at this point ");

        Class[] allClasses = new Class[3];

        Class c1 = new Class("Yoga for Beginners","Community Centre, Ballyheigue",
                23, new Time(19,30,0), new Time(20,45,0));

        Class c2 = new Class("Intermediate Zumba", "Caherciveen S.S. Sports Hall",
                18, new Time(18,45,0), new Time(19,30,0));

        Class c3 = new Class("Object Oriented Programming", "S306", 22,
                new Time(9,0,0), new Time(11,0,0));

        allClasses[0] = c1;
        allClasses[1] = c2;
        allClasses[2] = c3;

        for (int i = 0; i< allClasses.length ; i++){
            System.out.println("\nClass " + (i+1) + "\n\n" + allClasses[i] + "\n\n");
        }

        System.out.println("\n\nTrying to change the start and finish times of the OOP class to dodgy value of 11:60:-12 and -2:58:61 respectively\n\n" +
                "The state of the OOP class object is now \n\n");



        c3.setStartTime(new Time(11,60,-12));
        c3.setFinishTime(new Time(-2,58,61));

        System.out.println(c3);

        System.out.println("Trying to change the start time of the Yoga class to 19:45:00 using a referenced Time object called yogaStartTime \n\nThe state of Yoga Class object is now  \n");

        Time yogaClassTime = new Time(19,45,0);
        c1.setStartTime(yogaClassTime);
        System.out.println(c1);

        System.out.println("Now changing the time of the referenced yogaStartTime object to 18:50:00 \n\nThe state of yogaStartTime object is now 18:50:00 \n" +
                "The state of Yoga Class object is now  \n\n");

        yogaClassTime = new Time(18,50,0);
        System.out.println(c1);

        System.out.println("\n\nNow calling getFinishTime() to return the finish time of the zumba Class object - this is being stored in a Time object called zumbaFinishTime");

        Time zumbaFinishTime = c2.getFinishTime();
        System.out.println("\n\nNow trying to change the zumba class finish time from 19:30:00 to 19:50:00 by altering the object linked to the zumbaFinishTime reference");
        zumbaFinishTime.setHour(19);
        zumbaFinishTime.setMinute(50);
        System.out.println("\nThe state of zumbaFinishTime object is now " + zumbaFinishTime);
        System.out.println("\nThe state of Zumba Class object is now \n\n" + c2);
    }

}
