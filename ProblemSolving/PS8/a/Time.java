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

    public void setHour(int hour) {
        if (hour > 24 || hour < 0){
            this.hour = 00;
        }else{
            this.hour = hour;
        }
    }
    public void setMinute(int minute) {
        if(minute >= 60 || minute<0){
            this.minute = 00;
        }else{
            this.minute = minute;
        }
    }
    public void setSecond(int second) {
        if (second >= 60 || second<0){
            this.second = 00;
        }else{
            this.second = second;
        }
    }

    public int getHour() {return hour;}
    public int getMinute() {return minute;}
    public int getSecond() {return second;}

    public String toString(){
        return  getHour() + ":" + getMinute() + ":" + getSecond();
    }
}
