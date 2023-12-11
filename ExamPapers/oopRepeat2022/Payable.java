package oopRepeat2022;

public interface Payable {
    public static final int POINT_ON_SCALE = 25;

    public default double calculateEarnings(int pointOnScale, String workPattern){
        if (workPattern.equalsIgnoreCase("fulltime")){
            return 35000+((double) (65000 * pointOnScale) /POINT_ON_SCALE);
        } else if (workPattern.equalsIgnoreCase("hakftime")) {
            return 17500+((double) (65000 * pointOnScale) /POINT_ON_SCALE*2);
        }
        return 0;
    }
}
