import java.util.Scanner;

	public class Meters{
		public static void main(String[] arg){
			// % work for n-new,d-digit without decimal,f-decimal number,s-string
			System.out.printf("enter a number in feet 03.9894");
			System.out.println("see you");
					Scanner input = new Scanner(System.in);
					double intNumberInFeet = input.nextDouble();
					double result = (intNumberInFeet * 0.305);
					System.out.print(result);

		}

	}


