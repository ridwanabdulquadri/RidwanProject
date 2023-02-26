package arrays;

public class Arrayy {
    public static void main(String[] args) {
//        int num1 = 7;
//        int num2 = 9;
//        int num3 = 5;
//        int num4 = 2;
//        int num5 = 13;
//        int num6 = 18;
//        int num7 = 25;
//        int num8 = 24;
//        int num9 = 93;
//        int num10 = 18;


        //System.out.println(num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10);


        int[] numbers; // declaration
        numbers = new int[10]; //declaration and assigning
        //System.out.println(numbers.length);
        numbers[0] = 9;
        numbers[7] = 8;
        numbers[4] = 9;
        numbers[5] = 5;
        numbers[6] = 10;

//        for (int b : numbers) {
//            System.out.println(b);
//        }
//        int i = 0;
//        while (i < numbers.length) {
//            System.out.println(numbers[i]);
//            i++;
//        }
        for(int i= 0;i < numbers.length;i++){
            System.out.println(numbers[i]);
        }



        int[] numbers1 = new int[7]; //declaration and assigning
       // System.out.println(numbers1.length);

        int[] numbers2 = {6, 8, 5, 7, 4, 7, 4, 9};
       // System.out.println(numbers2.length);


    }
}
