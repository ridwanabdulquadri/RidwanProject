package Calculation;

import java.util.Scanner;
  
  public class CompareTwo{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int age = input.nextInt();
      System.out.print("enter a number");

      if (age < 80) {
          System.out.print("lesser");
      }

      if (age > 80) {
          System.out.print("higher");
      }

      if (age == 80) {
          System.out.print("equal");
      }
  }
  }
