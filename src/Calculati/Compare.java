package Calculation;

import java.util.Scanner;
  
 public class Compare{
  
 public static void main(String[] args){
  
 Scanner input =  new Scanner(System.in);

 System.out.println("enter a guess number");
 
 int age = input.nextInt();
 
 if ( age == 80){
 System.out.print(" Same");
}

  if (age < 80){
 System.out.print(" Lesser");
}
 
  if ( age > 80){
 System.out.print("Higher ");
  }
  if (age != 80){
   System.out.print(" medium");
  }

}
}
 