package worldClock;

public class MainWorldClocks {
    public static void main(String[] args) {
        WorldClocks clocks = new WorldClocks(60,60,24);
        System.out.println(clocks.displayTime());
    }
}