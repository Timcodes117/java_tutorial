import java.util.Scanner;

public class MathChallenge{

	public void solve(int a, int b, int c){
		System.out.println("\ncalculating...");


		System.out.println("\n#collect like terms:");
		System.out.println(a + "x " + "= " + (-b)  +" +" + c);

		System.out.println("\n#sum:");
		int sum = (-b) + c;
		System.out.println(a + "x " + "= " + sum);

		System.out.println("\n#divide both sides by coefficient of x:");
		System.out.println(a + "x/" + a +" = " + sum + "/" + a);

		System.out.println("\n#answer:");
		double division = (double) sum/a;
		System.out.println("x = " +  division + " or " + "x = " + sum+"/"+a);
		
	}


	public static void main(String[] args){
		Scanner myinput = new Scanner(System.in);
		MathChallenge mathProps = new MathChallenge();

		String placeholder = "ax + b = c";

		System.out.println(placeholder);

		System.out.print(" \nwhat is ax? ");
		int a = myinput.nextInt();

		System.out.print(" \nwhat is b? ");
		int b = myinput.nextInt();

		System.out.print(" \nwhat is c? ");
		int c = myinput.nextInt();

		String mathTask = a + "x + " + b + " = " + c;
		System.out.println(mathTask);

		mathProps.solve(a, b, c);
		
		
		myinput.close();
	}
}