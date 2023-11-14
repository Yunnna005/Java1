package PS9.Year2022;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public double getLatitude() {return latitude;}
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {return longitude;}
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String toString() {
        return "Latitude: "+getLatitude()+" Longitude: "+getLongitude();
    }
}
