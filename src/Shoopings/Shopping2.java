package Shoopings;

import java.util.Scanner;

public class Shopping2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
            System.out.println("enter the first grade or -2 quit");
            int grade = scanner.nextInt();

        while(grade != -2) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            System.out.println("input the next grade or -2 quit");
            grade = scanner.nextInt();
        }

        if(gradeCounter != 0){
            double average = total / gradeCounter;
            System.out.printf("total number of grade %s%n",total);
            System.out.printf("average number of grade %s%n",average);
        }



    }
    }