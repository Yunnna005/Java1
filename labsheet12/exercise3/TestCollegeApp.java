package labsheet12.exercise3;

public class TestCollegeApp {
    public static void main (String[] args) {
        Student s1 = new Student("Jake", 154345, "Computing");
        Student s2 = new Student("Mary", 234532, "Creative Media");
        Student s3 = new Student("Tommy", 453726, "Computing");
        Student s4 = new Student("Peter", 623456, "Creative Media");

        Student[] computingStudents = new Student[10];
        computingStudents[0] = s1;
        computingStudents[1] = s3;

        Student[] creativeMediaStudents = new Student[10];
        creativeMediaStudents[0] = s2;
        creativeMediaStudents[1] = s4;

        Department creativeMedia = new Department("Creative Media", creativeMediaStudents);
        Department computing = new Department("Computing", computingStudents);

        Department[] departments = new Department[5];
        departments[0] = creativeMedia;
        departments[1] = computing;

        Institute institute = new Institute("Insitute of Technology, Tralee", departments);

        System.out.println(institute);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudents());

        System.out.println("\n\nJake now moving from the Computing dept to the Creative Media dept");

        creativeMediaStudents[2] = s1;
        s1.setDept("Creative Media");
        computingStudents[0] = null;

        System.out.println(institute);
    }
}
