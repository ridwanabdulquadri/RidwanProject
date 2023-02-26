package ComputerAll;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of a radius");
        double radius = scanner.nextDouble();
        double area = radius * radius * PI;
        System.out.println("the area of a circle of radius" + radius + "is" + area);

    }
}
