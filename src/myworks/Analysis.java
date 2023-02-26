package myworks;

import java.util.Scanner;

public class Analysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passes = 0;
        int failure = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.printf("enter result(1-pass,2-fail:)");
            int result = scanner.nextInt();

            if (result == 1) {
                passes = passes + 1;
            } else {
                failure = failure + 1;
            }
            studentCounter = studentCounter + 1;
        }
        System.out.printf("print no of passes:%n%n",passes);
        System.out.printf("print no of fail:%s%n",failure);

         if(passes < 8) {
             System.out.println("Bonus intructor!");
         }
         }
}
