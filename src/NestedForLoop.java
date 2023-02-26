public class NestedForLoop {
    public static void main(String[] args) {

        int n = 10;
        int space = 10;

//        for(int row = 1; row <= n; row++){
//            for(int col= 1;col <= row;col++){
//                System.out.print("*");
//            }
//        }
        for(int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int star = 0; star < space; star++) {
            }
            System.out.println();
            space--;
        }

    }
































    }
//        int n = 10;
//        int space = 10;
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < space; col++) {
//                System.out.print(" ");
//            }
//            for (int star = 0; star <= row; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            space--;
//
//        }
//    }
//}