package ChapterThree;

import java.util.Scanner;

public class AcccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Acccount acccount = new Acccount("Ridwan");
        System.out.printf("initial name:%s%n%n",acccount.getName());
        System.out.println("enter the name:");
        String name = scanner.nextLine();
        acccount.setName(name);
        System.out.println();

        System.out.printf("display the name:%s%n%n", acccount.getName());
    }

}