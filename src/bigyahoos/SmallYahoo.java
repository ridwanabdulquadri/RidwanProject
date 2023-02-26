package bigyahoos;

public class SmallYahoo {
    public static void main(String[] args) {
        System.out.println("10000 at 2% interest is :" + calculateInterest(10000.0, 2.0));
        System.out.println("10000 at 3% interest is :" + calculateInterest(10000.0, 3.0));
        System.out.println("10000 at 4% interest is :" + calculateInterest(10000.0, 4.0));
        System.out.println("10000 at 5% interest is :" + calculateInterest(10000.0, 5.0));
        System.out.println("10000 at 6% interest is :" + calculateInterest(10000.0, 6.0));
        System.out.println("10000 at 7% interest is :" + calculateInterest(10000.0, 7.0));

        for (int k = 1; k < 8; k++) {
            System.out.println("10000 at " + k + "% interest is " + String.format("%.2f", calculateInterest(10000, k)));
        }
        for (int k = 1; k < 8; k++) {
            System.out.println("10000 at " + k + "% interest is " + (calculateInterest(10000, k)));
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int k = 2; k <= n/2; k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return  true;

    }

        public static double calculateInterest(double amount, double interestRate){
            return(amount * (interestRate / 100));
    }
}
