package chapter5;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int gradeCounter = 0;
        int aCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int total = 0;

        while (scanner.hasNext()) {
            int grade = scanner.nextInt();
            total += grade;
            ++gradeCounter;
            switch (grade / 10) {
                case 9:
                    ++aCount;
                    break;
            }

        }
        System.out.println("aCount "+aCount);
        System.out.println("gradeCounter"+gradeCounter);
    }
}
