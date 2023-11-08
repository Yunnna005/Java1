package labsheet12.exercise3;

public class Student {
    private String name;
    private int id;
    private String dept;

    Student(String name, int id, String dept) {
        setName(name);
        setId(id);
        setDept(dept);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString(){
        return "Name: " + getName() + "  ID: " + getId() + "  Department: " + getDept() + "\n";
    }
}
