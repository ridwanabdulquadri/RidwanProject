package myworks;

public class Interest {
    public static void main(String[] args) {
        System.out.println("10000 at 2% interest is " + calculateInterest(10000.00, 2.00));
        System.out.println("10000 at 3% interest is " + calculateInterest(10000.00, 3.0));
        System.out.println("10000 at 4% interest is " + calculateInterest(10000.00, 4.0));
        System.out.println("10000 at 5% interest is " + calculateInterest(10000.00, 5.00));
        System.out.println("10000 at 6% interest is " + calculateInterest(10000.00, 6.0));
        System.out.println("10000 at 7% interest is " + calculateInterest(10000.00, 7.0));
        System.out.println("10000 at 8% interest is " + calculateInterest(10000.00, 8.0));

        for (int i = 2; i <= 6; i--) {
            System.out.println(i + " ");
        }
        for (int i = 2; i < 9; i ++) {
            System.out.println("10000 at " + i + "% interest is = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
