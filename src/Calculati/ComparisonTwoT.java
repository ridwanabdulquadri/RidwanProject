package Calculation;

import java.util.Scanner;

 public class ComparisonTwoT{

  public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

   System.out.println("Enter the number");

   int age = input.nextInt();

   if (age > 18) {
    System.out.println("Greater");
   }

   if (age < 18) {
    System.out.println("lesser");
   }

   if (age == 18) {
    System.out.println("equal");
   }

  }
 }



 