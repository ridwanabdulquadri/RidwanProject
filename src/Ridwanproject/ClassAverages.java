package Ridwanproject;

import java.util.Scanner;

public class ClassAverages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.println("Enter a grade:");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        int average = (total / 10);

        System.out.printf("%nTotal of all 10 grade is %d%n", total);
        System.out.printf("class Average is %d%n", average);
    }
}