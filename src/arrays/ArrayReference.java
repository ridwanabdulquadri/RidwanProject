package arrays;

public class ArrayReference {
    public static void main(String[] args) {
        int[] number = {0, 1};
        change(number);
        printArray(number);
    }

    private static void change(int[] numbers) {
        numbers[0] = 1;
        numbers[1] = 2;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[1] + " ");
        }
    }
}



