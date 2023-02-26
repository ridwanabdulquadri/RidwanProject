package Chapter4;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while(studentCounter <= 10) {
            System.out.println("if enter 1= pass,2= fail");
            int examResult = scanner.nextInt();

            if(examResult == 1){
                passes = passes + 1;
            }else {
                    failures = failures + 1;
                }
                studentCounter = studentCounter + 1;
            }
            System.out.printf("passed: %d%nfailed: %d%n",passes,failures);

            if (passes > 8) {
                System.out.println("bonus to instructor");
        }
    }
}
