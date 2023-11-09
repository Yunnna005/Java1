package PS7.a;

public class TestStudent {
    public static void main(String[] args) {
        String text = "", textCount = "";

        text = "Calling static method getCount() to determine the  \n" +
                "number of students in the college \n\n";

        Student s1 = new Student("Tim", "Computing", new String[]{"Maths", "Java", "Web Dev", "Networking Basics"});
        Student s2 = new Student("Ita","Social Care", new String[]{"Intro to Social Care", "Caring for the Elderly", "Psychology"});
        Student s3 = new Student("Joe", "Physics", new String[]{"Relativity", "Mechanics", "Hydrodynamics", "Statics", "Quantum Mechanics"});

        s1.setCollege("Institute of Technology, Tralee");
        s2.setCollege("Institute of Technology, Tralee");
        s3.setCollege("Institute of Technology, Tralee");

        text += textCount;

        text += s1.toString();
        text += s2.toString();
        text += s3.toString();

        textCount = "\n\nTotal students in college: "+Student.getCount();

        text += "Calling static method setCollege() to alter the name of the  \n" +
                "college to \"Munster Technological University\" \n\n";
        text += "Displaying the state of the 3 Student objects at this point \n\n";

        s1.setCollege("Munster Technological University");
        s2.setCollege("Munster Technological University");
        s3.setCollege("Munster Technological University");

        text += s1.toString();
        text += s2.toString();
        text += s3.toString();

        System.out.println(text);
    }
}
