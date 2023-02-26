package chapter3;

public class Clocks {
    private int hour;
    private int second;
    private int minutes;

    public Clocks(int hour,int second,int minutes){
        this.hour = hour;
        this.second = second;
        this.minutes = minutes;
    }

    public void setHour(){
        if(0 < 23) {
            this.hour = hour;
        }
    }
    public int getHour(){
        return hour;
    }
    public void setMinutes(){
        if(0 < 59){
            this.minutes = minutes;
        }
    }
    public int getMinutes() {
            return minutes;
    }
    public void setSecond(){
        this.second = second;
    }
    public int getSecond(){
        return second;
    }

}
