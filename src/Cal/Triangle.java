package Cal;

public class Triangle {
    public static void main(String[] args) {
        int n = 10;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            for (int col = row; col < n; col++) {
                System.out.print(" ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}