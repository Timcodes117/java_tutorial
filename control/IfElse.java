

public class IfElse{

	public static void NestedIf(){
		int x = 10, y = 20, z = 30;

		if (x >= y){
			if(x >= z)
				System.out.println(x + " is the largest.");
			else 
				System.out.println(z + " is the largest.");
		} else {
			if(y >= z)
				System.out.println(y + " sis the greatest");
			else
				System.out.println(z + " is the greatest");
	}
}

	public static void main(String[] args){
		int x = 30;
		
		// using if-else statement
		if(x < 20){
			System.out.println(" x is less than 20 ");
		} else {
			System.out.println("x is greater than 20");
		}

		// using if else-if and else

		if(x == 10){
			System.out.println("Value of x is 10");
		}else if(x == 20){
			System.out.println("Value of x is 20");
		}else if(x == 30){
			System.out.println("Value of x is 30");
		}else{
			System.out.println("This is an else statement");
		}	

		// code example 2
		double y = 30.0;

		if( y == 10.0 ) {
			System.out.println("Value of X is 10.0"); 
		}else if( y == 20.0 ) {
			System.out.println("Value of X is 20.0");
		}else if( y == 30.0 ) {
			System.out.println("Value of X is 30.0");
		}else {
			System.out.println("This is else statement");
		}


		// nested if else statement
		NestedIf();

		
	}
}

