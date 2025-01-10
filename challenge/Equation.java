import java.util.Scanner;

class Equation{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		LinearCalc solver = new LinearCalc();

		System.out.print("Enter you equation: ");
		String equation = input.nextLine();

		while(!equation.contains("=")){
			System.out.println("Equation is not valid. try using: 3y + 4 = 8 or 3y -5y = 6");
			System.out.print("\nEnter you equation: ");
			equation = input.nextLine();
		}

		System.out.println("\nsolving for: " + solver.getConstant(equation));

		solver.sortMethod(equation);

		input.close();
		
	}
}