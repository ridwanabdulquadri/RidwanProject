package arrays;
public class Exercise2DimensionalArray {
    public static void main(String[] args) {
        int[][] ridwan = {{1, 2, 3, 4, 5}, {11, 14, 90, 70, 96}, {100, 110, 200, 120, 150}};
//        int[][] ridwan = {{1, 2, 3, 4,5}, {11, 14,90, 70, 96}, {100, 110,200,120, 150}};
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++)
                sum = ridwan[i][j];
            System.out.println("the row is " + (i + 1) + ": " + sum);
        }
    }
    }


//        for (int i = 0; i < 3; i++)
//            System.out.println("the row is " + (i + 1) + ": " + getMax(ridwan[i]));
//    }
//
//    private static int getMax(int[] ridwan) {
//        int max = ridwan[0];
//        for (int j = 0; j < 5; j++)
//            max = ridwan[j] < max ? ridwan[j] : max;
//        return max;
//    }
//}