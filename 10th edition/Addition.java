import java.util.Scanner;

class Addition{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;

		System.out.println("enter the first integer: ");
		number1 = input.nextInt();

		System.out.println("enter the second integer: ");
		number2 = input.nextInt();

		sum = number1 + number2;

		System.out.printf("sum is: %d%n", sum);
	}
}