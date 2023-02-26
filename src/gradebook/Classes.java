package gradebook;

import java.util.Scanner;

public class Classes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.println("enter the next grade or -1 to quit");
        int grade = scanner.nextInt();

        while(grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.println("enter the next grade or -1 to quit");
            grade = scanner.nextInt();
        }

            if(gradeCounter != 0){
                double average = (double) total / gradeCounter;
            System.out.printf("%n%d total number of the number\n",total,gradeCounter);
            System.out.printf("class average %.2f%n", average);

        }else{
                System.out.printf("no grade where entered");
            }
    }

}