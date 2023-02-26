package chapter3;

public class Clock {

    private int hour;
    private int minutes;
    private int second;

    public Clock(int hour, int minutes, int second) {
//        if(0 <= 23) hour = 0;?
        this.hour = hour;
//        if(0 <= 59) minutes = 0;
        this.minutes = minutes;
//        if(0 <= 59) second = 0;
        this.second = second;
    }
    public void setHour() {
        if(hour <= 23) {
            this.hour = hour;
        }
    }
    public int getHour() {
        return hour;
    }
    public void setMinutes() {
        if(minutes <= 59) this.minutes = minutes;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setSecond() {
        if (second <= 59) this.second = second;
        }
    public int getSecond(){
        return second;
    }

}