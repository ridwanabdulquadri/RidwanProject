package chapter2;

import java.util.Scanner;

public class StatisticsForTheGreatPyramidOfGiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estimated number of block of stones used");
        int blockOfStones = scanner.nextInt();
        System.out.println("Average weight of each stone");
        int weightOfEachStone = scanner.nextInt();
        System.out.println(" Number of years taken to build the pyramid (assuming a year comprises 365 days");
        int yearsToBuilt = scanner.nextInt();
        int formula = 315 / (365 * 20);//1

    }
}
