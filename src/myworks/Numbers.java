package myworks;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        //sentinel
//        Scanner i = new Scanner(System.in);
//        System.out.println("enter number");
//        int num = i.nextInt();
//
//        while (num != -1) {
//            System.out.printf("%d%n ", num);
//            num = i.nextInt();
//        }

        int[] numbers = {23, 78, 90, 78, 65, 89};//enhanced for loop
        for (int numb : numbers) {
            System.out.println(numb);
        }



    }

}

//        int counter = 1;
//        do {
//            System.out.print(counter +" ");
//            counter++;
//        } while (counter <= 10);
//    }
//        for (int i = 1; i < 10; i+=2) {
//            System.out.println(i + " ");
//        }
//
//        }
//
//}
