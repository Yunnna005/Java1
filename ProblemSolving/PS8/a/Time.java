package PS8.a;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {this.hour = hour;}
    public void setMinute(int minute) {this.minute = minute;}
    public void setSecond(int second) {this.second = second;}

    public int getHour() {return hour;}
    public int getMinute() {return minute;}
    public int getSecond() {return second;}

    public String toString(){
        String i;
        if (getHour()<10){
            i = 0+getHour() + ":" + getMinute() + ":" + getSecond();
        }else{
            i = getHour() + ":" + getMinute() + ":" + getSecond();
        }
        return i;
    }
}
