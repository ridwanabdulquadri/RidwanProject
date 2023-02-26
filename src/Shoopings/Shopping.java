package Shoopings;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 10){
            System.out.println("Enter next user");
            int grade = scanner.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        int average = total / 10;

        System.out.printf("the total is:%s%n",total);
        System.out.printf("the class average is:%s%n",average);
    }
}
