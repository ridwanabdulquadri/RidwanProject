package clocks;

public class MainClock {
    public static void main(String[] args) {
        Clock wallClock = new Clock(56,86, 90);
//        wallClock.setHour(78);
//        wallClock.setMinutes(97);
//        wallClock.setSecond(80);
        System.out.println(wallClock.displayTime());
    }
}
