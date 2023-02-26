package myworks;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius");
        float radius = input.nextFloat();


        double area = Math.PI * radius * radius;
        System.out.println(area);


        System.out.println(isPrime(3));

        int days = 1;

        switch (days) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}