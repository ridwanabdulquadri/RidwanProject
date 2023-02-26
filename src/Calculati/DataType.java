package Calculation;

public class DataType {
    public static void main(String[] args) {

        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);
        myString = myString +",and this more.";
        System.out.println("myString is equal to " +  myString);
        myString = myString + "\u00A9  2019";
        System.out.println("myString is equal to " + myString);




        int result = 1 + 2;
        System.out.println("1 + 2 =" + result);
        int previousResult = result;
        System.out.println("previousResult =" + previousResult);
        result = result -1;
        System.out.println("3 - 1 =" + result);
        System.out.println("previousResult =" + previousResult);

        result = result * 10;
        System.out.println("2 * 10 =" + result);

        result = result / 4;
        System.out.println("20 / 4 =" + result);

        result = result % 3;
        System.out.println("5 % 3 =" + result);

        result++;
        System.out.println("2 + 1 ="+ result);

        result--;
        System.out.println("3 - 1 ="+ result);

        result += 2;// 2 + 2;
        System.out.println("2 + 2 =" + result);

        result *= 10; //4 * 10
        System.out.println("4 * 10 =" + result);

        result /= 10; // 40 / 10
        System.out.println("40 / 10 =" + result);

        result -= 3;
        System.out.println("4 - 3 =" + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("is not an alien!");
            System.out.println("and I am scared of alien");
        }

        int topScore = 80;
        int secondTopScore = 95;
        if ((topScore > 80) && (secondTopScore > 900))
            System.out.println("Greater than second score and less than 100");
        if ((topScore < 90) && (secondTopScore > 100))
            System.out.println("Greater than second top score and less than 100");





    }

}
