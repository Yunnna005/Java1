package Repeat22_23.finalexam.collegeapp2022;

public interface Payable {
    int PointnsOnScale = 25;

    public default double calculateEarnings(int pointns_on_Scale, String workPattern){
        if (workPattern.equals("fulltime")){
            return 35000+((65000*pointns_on_Scale)/PointnsOnScale);
        } else if (workPattern.equals("halftime")) {
            return 17500+((65000*pointns_on_Scale)/PointnsOnScale*2);
        }else{
            return 0;
        }
    }
}
