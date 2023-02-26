package arrays;

public class Exercise4TwoDimensionalArray {
    public static void main(String[] args) {
        int[] number = {2,4,6,-3,5};

       int max = number[0];
       int min = number[0];

        for (int i = 0; i < number.length; i++) {
            max = number[i] > max ? number[i] : max;
            min = number[i] < min ? number[i] : min;
        }
        System.out.println("min = " + min + ", max= " + max);
        }

        }
// System.out.println("Minimum value is: " + min);
//        System.out.println("Maximum value is: " + max);