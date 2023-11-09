package PS7.a;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Tim", "Computing", new String[]{"Maths", "Java", "Web Dev", "Networking Basics"});
        Student s2 = new Student("Ita","Social Care", new String[]{"Intro to Social Care", "Caring for the Elderly", "Psychology"});
        Student s3 = new Student("Joe", "Physics", new String[]{"Relativity", "Mechanics", "Hydrodynamics", "Statics", "Quantum Mechanics"});

        s1.setCollege("Institute of Technology, Tralee");
        s2.setCollege("Institute of Technology, Tralee");
        s3.setCollege("Institute of Technology, Tralee");

        Student[] allStudents = new Student[3];
        allStudents[0] = s1;
        allStudents[1] = s2;
        allStudents[2] = s3;

        System.out.println("Calling static method getCount() to determine the " +
                "\nnumber of students in the college");

        System.out.println("\nTotal students in college: " + Student.getCount());

        System.out.println("\n\nDisplaying the state of the " + Student.getCount() + " Student objects at this point\n");

        for(int i=0;i<3;i++){
            System.out.println("Student " + (i+1) + "\n\n" + allStudents[i] + "\n\n");
        }


        s1.setCollege("Munster Technological University");
        s2.setCollege("Munster Technological University");
        s3.setCollege("Munster Technological University");

        System.out.println("Calling static method setCollege() to alter the name of the " +
                "\ncollege to \"Munster Technological University\"");

        System.out.println("\n\nDisplaying the state of the " + Student.getCount() + " Student objects at this point\n\n");

        for(int i=0;i<3;i++){
            System.out.println("Student " + (i+1) + "\n\n" + allStudents[i] + "\n\n");
        }
    }
}
