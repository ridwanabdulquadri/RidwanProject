package Calculation;

import java.util.Scanner;
    public class Years{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                System.out.print("Enter minutes: ");
                int numberOfMinutes = input.nextInt();

                int minutesInYear = numberOfMinutes / 525600;
                int daysInYear = numberOfMinutes / (1440 % 365);

                System.out.println(numberOfMinutes + " minutes is approximately " + minutesInYear + " and " + daysInYear + " days");




            }
        }
