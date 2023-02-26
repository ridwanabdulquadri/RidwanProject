package Calculation;

import java.security.SecureRandom;

public class SecureRandomClass {
    public static void main(String[] args) {
        SecureRandom generatedNumber = new SecureRandom();

        for (int counter = 1; counter <= 10; counter++) {
            int display = generatedNumber.nextInt(10);
            System.out.printf("%2d ", display);
        }
    }
}
