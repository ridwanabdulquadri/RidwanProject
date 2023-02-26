package chapter2;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the area of a circle");
        int radius= scanner.nextInt();
        System.out.printf("Diameter = %d%n" ,2 * radius);
        System.out.printf("Area = %.2f%n", Math.PI * radius * radius *radius);
        System.out.printf("Area = %.2f" ,Math.PI * radius * radius);
    }
}
