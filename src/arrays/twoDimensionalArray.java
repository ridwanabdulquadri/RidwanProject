package arrays;

public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, {21, 22, 23, 24, 25, 26, 27, 28, 29, 30}};
        for (int row = 0; row < 3; row++)
            System.out.println("the row is " + (row + 1) + ": " + getMax(array[row]));
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int colum = 0; colum < array.length; colum++)
            max = (max < array[colum]) ? array[colum] : max;
            return max;

    }
}
