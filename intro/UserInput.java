import java.util.Scanner;


public class UserInput{
	static public void addTwoNums(){
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("enter first number: ");
		num1 =  input.nextInt();

		System.out.println("enter second number: ");
		num2 =  input.nextInt();

		int addition = num1 + num2;
		System.out.println("result: " + addition);
	}

	static public void main(String[] args) {
		/* Scanner obj = new Scanner(System.in);
		int age = obj.nextInt();
		System.out.println("age: " + age); */

		addTwoNums();

	}
}