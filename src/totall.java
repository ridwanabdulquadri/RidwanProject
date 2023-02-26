public class totall {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 5, 7,9,9,9};
        int product = 1;
        int sum = 0;
        double average;

        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
            sum += numbers[i];
        }
            average = (double) sum / numbers.length;
        System.out.println("the sum " + sum + " ,the product " + product + " ,the average " + average);
    }

}




//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            sum = 0;
//            for (int j = 0; j < 3; j++)
//                sum += numbers[j][i];
//            System.out.println("The sum of a column 1 " + (i + 1) + ": " + sum);
//        }
//    }
//}

//        int sum = 0;
//        int product = 0;
//        double average = 0;
//
//        for (int k = 0; k < numbers.length; k++) {
//            sum += numbers[k];
//            product *= numbers[k];
//            average = (double) sum / numbers.length;
//
//        }
//        System.out.println("sum = " + sum + ", product = " + product + ", average" + average);
//    }
//}

//        int[][] ridwan = {{1, 2, 3, 4, 5}, {11, 14, 90, 70, 96}, {100, 110, 200, 120, 150}};
//        int sum = 0;
//        for (int row = 0; row < 5; row++) {
//          sum = 0;
//            for (int column = 0; column < 3 ; column++)
//                sum += ridwan[column][row];
//            System.out.println("The sum of a row 1 " +  (row + 1) + ": " + sum);
//
//        }

