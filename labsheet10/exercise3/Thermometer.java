package labsheet10.exercise3;

public class Thermometer {
    private int temp, maxTemp, minTemp;

    public Thermometer(){
        setTemp(0);
        setMaxTemp(Integer.MIN_VALUE);
        setMinTemp(Integer.MAX_VALUE);
    }
    public Thermometer(int temp){
        setTemp(temp);
        setMaxTemp(temp);
        setMinTemp(temp);
    }
    public int getTemp(){
        return temp;
    }
    public void setTemp(int temp){
        this.temp = temp;
    }

    public int getMaxTemp(){
        return maxTemp;
    }
    public void setMaxTemp(int maxtemp){
        this.maxTemp = maxtemp;
    }

    public int getMinTemp(){
        return minTemp;
    }
    public void setMinTemp(int minTemp){
        this.minTemp = minTemp;
    }

    public void setTemperature(int temp){
        setTemp(temp);
        updateMaxMinTemp();
    }

    public void updateMaxMinTemp(){
        if (temp > maxTemp){
            setMaxTemp(temp);
        }
        if (temp<minTemp){
            setMinTemp(temp);
        }
    }

    public String toString(){
        return "Current temp: "+getTemp()+"\n"+
                "Max temp: "+getMaxTemp()+"\n"+
                "Min temp: "+getMinTemp()+"\n";
    }
}
