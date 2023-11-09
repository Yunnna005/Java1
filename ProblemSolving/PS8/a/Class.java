package PS8.a;


public class Class {
    private String name;
    private String location;
    private int enrollment;
    private Time startTime;
    private Time finishTime;

    public Class(String name, String location, int enrollment, Time startTime, Time finishTime){
        setName(name);
        setLocation(location);
        setEnrollment(enrollment);
        setStartTime(startTime);
        setFinishTime(finishTime);
    }

    public void setName(String name){this.name=name;}
    public void setLocation(String location){this.location=location;}
    public void setEnrollment(int enrollment){this.enrollment=enrollment;}
    public void setStartTime(Time startTime) {this.startTime = startTime;}
    public void setFinishTime(Time finishTime) {this.finishTime = finishTime;}

    public String getName() {return name;}
    public String getLocation() {return location;}
    public int getEnrollment() {return enrollment;}
    public Time getStartTime() {return startTime;}
    public Time getFinishTime() {return finishTime;}

    public String toString(){
        return "\nName: "+getName()+"\nLocation: "+getLocation()+"\nEnrollment: "+getEnrollment()+"\nStart time: "+
                getStartTime()+"\nFinish Time: "+getFinishTime();
    }
}
