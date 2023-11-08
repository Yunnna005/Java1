package PS7.a;

public class Student {
    private String name;
    private int id;
    private String college;
    private String Department;
    private String[] modules;
    private static int count = 0;

    public Student(String name, String college, String[] modules){
        setName(name);
        setId();
        setCollege(college);
        setModules(modules);
    }

    public void setName(String name){this.name=name;}
    public void setCollege(String college){this.college=college;}
    public void setModules(String[] modules){this.modules=modules;}

    public void setId(int id){
        count++;
        this.id=count;
    }
    public void setDepartment(String department){this.Department=department;}

    public String getName() {return name;}
    public int getId() {return id;}
    public String getCollege() {return college;}
    public String getDepartment() {return Department;}
    public String[] getModules() {return modules;}

    public static int getCount() {return count++;}

    public String toString(){
        return "\n\nStudent "+getCount()+"\n\nName: "+getName()+"\nID: "+getId()+
                "\nCollege: "+getCollege()+"\nDepartment: "+getDepartment()+"\nModules: "+getModules().toString();
    }
}
