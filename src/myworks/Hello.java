package myworks;

import java.util.Scanner;

public class Hello{

   public static void main(String[] args){
       
	Scanner collect = new Scanner(System.in);
        System.out.print("Enter a number: ");
	int number = collect.nextInt();
	
	if (number == 1){
	System.out.print(0);
}
	if (number == 0){
	System.out.print(1);
}

}

}
