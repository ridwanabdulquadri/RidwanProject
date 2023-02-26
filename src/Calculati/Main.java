package Calculation;

public class Main {
    public static void main(String[] args) {

    int myValue = 10000;

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("integer Minimum Value = " + myMinIntValue);
    System.out.println("integer Maximum Value = " + myMaxIntValue);
    System.out.println("Busted MIN value = " + (myMinIntValue -1));
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

    int myMaxIntTest = 2_147_483_647;

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("byte myMinByteValue = " + myMinByteValue);
    System.out.println("byte myMaxByteValue = " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("short myMinimum Value = " + myMinShortValue);
    System.out.println("short myMaximum Value = " + myMaxShortValue);

    long myLongValue =100;
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long myMinimum Value = " + myMinLongValue);
    System.out.println("Long myMaximum Value = " + myMaxLongValue);
    short bigShortLiteralValue = 32767;
    byte myTotal = (byte)(myMinByteValue / 2);
    long bigLongLiteralValue = (922337203685477580L);

    double myMinDoubleValue = Double.MIN_VALUE;
    Double myMaxDoubleValue = Double.MAX_VALUE;
    System.out.println("Double myMinimum Value = " + myMinDoubleValue);
    System.out.println("Double myMaximum Value = " + myMaxDoubleValue);

    float myMinFloatValue = Float.MIN_VALUE;
    Float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println("Float myMinimum Value = " + myMinFloatValue);
    System.out.println("Float myMaximum Value = " + myMaxDoubleValue);

    int myIntValue = 10 / 2;
    float myFloatValue = 5F / 2 ;
    double myDoubleValue = 5d / 5;

    System.out.println("myIntValue=" + myIntValue);
    System.out.println("myFloatValue=" + myFloatValue);
    System.out.println("myDoubleValues=" + myDoubleValue);


    }
}







