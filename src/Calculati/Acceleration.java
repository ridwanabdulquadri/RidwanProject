package Calculation;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        System.out.print("enter starting velocity in meters/seconds");
        Double v0 = data.nextDouble();
        System.out.println("enter the ending velocity in meters/second");
        Double v1 = data.nextDouble();
        System.out.println("the time span in meter/seconds");
        Double t = data.nextDouble();
        Double a = (v1 - v0) / t;
        System.out.printf("the average run is %f", a);
    }
}
