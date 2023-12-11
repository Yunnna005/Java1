package collegeapp2022;

public interface Payable {
    public static final int POINT_ON_SCALE = 25;
    public default double calculateEarnings(int pointOnScale, String workPattern) {
        double earnings = 0;
        if (workPattern.equals("fulltime")){
            earnings = 35000 + (65000.0 * pointOnScale) /POINT_ON_SCALE;
        }
        if (workPattern.equals("halftime")){
            earnings = 17500 + (65000.0 * pointOnScale) /(POINT_ON_SCALE*2);
        }
        return earnings;
    };
}
