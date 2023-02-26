package Calculation;

import java.util.Scanner;
public class Airplane1 {
public static void main(String[] args){

Scanner ridwan=new Scanner(System.in);

System.out.print("Enter speed in metre/second: ");
double v = ridwan.nextDouble();

System.out.print("Enter acceleration in m/s*s : ");
double a = ridwan.nextDouble();

double length = (v*v)/(2 * a);

System.out.printf("The minimum runway length for this airplane is %f", length); 
}
}