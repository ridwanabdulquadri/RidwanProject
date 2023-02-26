package Calculation;

public class Iphone {
        public  static String color;
        private final static double price = 699.9;

        public static String getColour() {
            setColor("h");
            return color;
        }
        public static void setColor(String Color) {
            //getColor();
            Iphone.color = color;
        }

    public static double getPrice() {
        return price;
    }
}
