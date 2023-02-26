package worldClock;
public class WorldClocks {
    private int seconds;
    private int minutes;
    private int hours;

    public WorldClocks(int seconds,int minutes,int hours ){
        if(seconds > 59) seconds = 0;
        this.seconds = seconds;
        if(minutes > 59) minutes = 0;
        this.minutes = minutes;
        if(hours > 23) hours = 0;
        this.hours = hours;
    }

    public void setSeconds(int seconds){
        if(seconds > 23) seconds = 0;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minutes) {
        if(minutes > 23) minutes = 0;
        this.minutes = minutes;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setHour(){
        if(hours > 23 ) hours = 0;
        this.hours = hours;
    }
    public int getHours(){
        return hours;
    }
    public String displayTime(){
        return String.format("the time is %s:%s:%s" , getMinutes(),getSeconds(),getHours());
    }

}