package Calculation;

import java.util.Scanner;

//1. Read in the circle’s radius.
      //  2. Compute the area using the following formula: (area = radius * radius * p)
        // 3. Display the result.

public class ComputeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double area;
        radius = 20; // radius is now 20

        // Compute area
        area = radius * radius * 3.14159;
        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}


