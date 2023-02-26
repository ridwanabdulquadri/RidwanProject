package Calculation;

import java.sql.SQLOutput;

public class Air {
        public static void main(String[] args) {
            int myMinIntValue = Integer.MIN_VALUE;
            int myMaxIntValue = Integer.MAX_VALUE;
            System.out.println("integer Minimum Value =" + myMinIntValue);
            System.out.println("integer Maximum Value =" + myMaxIntValue);

            float myMinFloatValue = Float.MIN_VALUE;
            float myMaxFloatValue = Float.MAX_VALUE;
            System.out.println("float Minimum Value =" + myMinFloatValue);
            System.out.println("float Maximum Value =" + myMaxFloatValue);

            byte myMinByteValue = Byte.MIN_VALUE;
            byte myMaxByteValue = Byte.MAX_VALUE;
            System.out.println("byte Minimum Value =" + myMinByteValue);
            System.out.println("byte Maximum Value =" + myMaxByteValue);

            int myfirstNumber = 1000;
            int mySecondNumber = 3000;
            int mythirdNumber = 4000;
            int myTotalValue = myfirstNumber + mySecondNumber + mythirdNumber;
            System.out.println("myTotalValue =" + myTotalValue);

            myTotalValue++;
            System.out.println("8000 + 1 =" + myTotalValue);

            myTotalValue--;
            System.out.println("8000 - 1 =" + myTotalValue);

            int myPreviousValue = myTotalValue;
            System.out.println("myTotalValue =" + myPreviousValue);

            myPreviousValue += 20;
            System.out.println("8000 + 20 =" + myPreviousValue);

            if(myPreviousValue == 8020) {
                System.out.println("it is equal");
            }


    }

}
