package Calculation;

import java.util.Scanner;

public class AirplaneOne {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter speed in meters/second");
    Double v = input.nextDouble();
    System.out.println("enter acceleration in meters/second * second ");
    Double a = input.nextDouble();
    double length = (v * v) / (2 * a);
    System.out.printf("enter the minimum runway length for this airplane is %f",length);

    }
}
