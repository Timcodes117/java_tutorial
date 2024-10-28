import java.util.Scanner;

public class MathChallenge2{

	public void solveFor1(int a, int b, int c){
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
		System.out.println("x = " +  division + " or " + "x = " + sum + "/" + a);
		
	}
	
	public void solveFor2(int a, int b, int c){
		System.out.println("\ncalculating...");


		System.out.println("\n#collect like terms:");
		
		System.out.println(b + "x " + "= " + c  +" +" + (-a));

		System.out.println("\n#sum:");
		int sum = c + (-a);
		System.out.println(b + "x " + "= " + sum);

		System.out.println("\n#divide both sides by coefficient of x:");
		System.out.println(b + "x/" + b +" = " + sum + "/" + b);

		System.out.println("\n#answer:");
		double division = (double) sum/b;
		System.out.println("x = " +  division + " or " + "x = " + sum + "/" + b);
		
	}

	public void solveFor3(int a, int b, int c){
		System.out.println("\ncalculating...");

		System.out.println("\n#add like terms:");
		
		System.out.println(a + "x +" + b + "x = " + c);

		System.out.println("\n#sum:");
		int sum = a + b;
		System.out.println(sum + "x " + "= " + c);

		System.out.println("\n#divide both sides by coefficient of x:");
		System.out.println(sum + "x/" + sum +" = " + c + "/" + sum);

		System.out.println("\n#answer:");
		double division = (double) c/sum;
		System.out.println("x = " +  division + " or " + "x = " + c + "/"+sum);
		
	}


	public static void main(String[] args){
		Scanner myinput = new Scanner(System.in);
		MathChallenge2 mathProps = new MathChallenge2();

		String placeholder1 = "ax + b = c";
		String placeholder2 = "a + bx = c";
		String placeholder3 = "ax + bx = c";

		System.out.println("how is your equation?");
		System.out.println(placeholder1);
		System.out.println(placeholder2);
		System.out.println(placeholder3);
		//System.out.println(placeholder4);

		System.out.print("enter option number: ");
		int choice = myinput.nextInt();

		if(choice > 3) {
            		System.out.println("you can only input a number from [1-3]. Try again.");
            		myinput.close();
            		return; 
        	}

		switch(choice){
			case 1:
				System.out.println("\nusing:" + placeholder1);
				break;
			case 2:
				System.out.println("\nusing:" + placeholder2);
				break;
			case 3:
				System.out.println("\nusing:" + placeholder3);
				break;
			default:
				
				System.out.println("you can only input a number from [1-3]. try again..");
				break;
				
		}


		System.out.print(" \nwhat is a? ");
		int a = myinput.nextInt();

		System.out.print(" \nwhat is b? ");
		int b = myinput.nextInt();

		System.out.print(" \nwhat is c? ");
		int c = myinput.nextInt();

		String mathTask = a + " + " + b + " = " + c;
		System.out.println(mathTask);

	

		if(choice == 1){
			mathProps.solveFor1(a, b, c);
		}else if(choice == 2){
			mathProps.solveFor2(a, b, c);
		}else if(choice == 3){
			mathProps.solveFor3(a, b, c);
		}
		
		
		myinput.close();
	}
}