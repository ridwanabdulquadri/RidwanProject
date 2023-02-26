package Calculation;

import java.util.Scanner;

  public class Kilogram {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("enter a feet");
          double intNumberInFeet = input.nextDouble();
          double result = intNumberInFeet * 0.305;
          System.out.print(result);

      }
  }
