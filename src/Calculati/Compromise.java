package Calculation;

public class Compromise {
    public static void main(String[] args) {
        int myFirstValue = 100;
        int mySecondValue = 500;
        int myThirdValue = 1000;
        int totalValue = myThirdValue + mySecondValue + myFirstValue;
        System.out.println("totalValue =" + totalValue);
        totalValue++;
        System.out.println("1600 + 1 =" + totalValue);
        totalValue--;
        System.out.println("1600 -1" + totalValue);
        totalValue -= 2;
        System.out.println("1600 - 2 =" + totalValue);
        totalValue += 10002;
        System.out.println("1598 + 10002=" + totalValue);
        totalValue /= 4;
        System.out.println("11600 / 4 =" + totalValue);
        totalValue %= 5;
        System.out.println("2900 % 5 =" + totalValue);

        boolean acIsOn = true;
        if (acIsOn == false) {
            System.out.println("this air condition is on");
        } else {
            System.out.println("this air condition is off ");
        }

        double myNumber = 300;
        if(myNumber == 300){
            System.out.println("is equal to 1000");
        }
        if(myNumber < 1000) {
            System.out.println("is less than 1000");
        }
        if((myNumber < 200) && (myNumber == 100)) {
            System.out.println("is less or equal to");
        }
    }
}