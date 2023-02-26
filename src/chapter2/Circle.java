package chapter2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("radius of a circle");
//        int radius = scanner.nextInt();
//        System.out.printf("diameter = %d%n ", 2 * radius);
//        System.out.printf("circumference = %.2f%n ", 2 * Math.PI * radius);
//        System.out.printf("area = %.2f%n ",  Math.PI * radius * radius);

//        System.out.println((int)'A');
//        System.out.printf("%d%n",(int) 'A');
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number five digit number");
        int number = scanner.nextInt();
        if (number > 99999 && number < 100000) {

            int n1 = number / 10000 % 10;
            int n2 = number / 1000 % 10;
            int n3 = number / 100 % 10;
            int n4 = number / 10 % 10;
            int n5 = number % 10;
            System.out.println(n1 + "    " + n2 + "    " + n3 + "    " + n4 + "    " + "   " + n5);
        } else {
            System.out.println("your those to input 5digit");
        }
    }
}
