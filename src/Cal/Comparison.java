package Calculations;

import java.util.Scanner;

 public class Comparison{
 
 public static void main(String[] args){
  
 Scanner input = new Scanner(System.in);

 System.out.println("enter a Number");

 int age = input.nextInt();


 if ( age > 18){
 System.out.printf("Higher");
}
 if ( age < 18){
 System.out.printf("lower");
}
 if ( age == 18){
 System.out.printf("Same");
} 



}

}
 

  