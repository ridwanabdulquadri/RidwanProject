package arrays;

public class DisplayNumbers {
    public static void main(String[] args) {
        int[] number ={1,2,-3,5,7};

        int sum = 0;
        int product = 1;
        double average = 0;

        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            product *= number[i];
        }
        average = (double) sum / number.length;
        System.out.println("sum = " + sum + (", product= " + product + ", average" + average));
    }
}
