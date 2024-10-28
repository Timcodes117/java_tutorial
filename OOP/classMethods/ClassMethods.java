import java.util.Scanner;

class Util{

	public int minimum(int num1, int num2){
		if (num1 < num2)
			return num1;
		else
			return num2;
	}
}

public class ClassMethods{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Util util = new Util();
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.println("Minimum is: " + util.minimum(num1, num2));
	}
}