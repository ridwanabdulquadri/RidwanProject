package AccountAll;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius:");
        double radius = scanner.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println("the area for the circle of a radius " + radius + " is " + area);
    }
}
