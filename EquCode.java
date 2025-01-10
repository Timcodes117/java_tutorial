import java.util.Scanner;


class Helper{
	char constant = 'x';

	void getConstant(String value){
		if(!value.isEmpty()){
			for(char i : value.toCharArray()){
				//System.out.println(i);
				if (!Character.isDigit(i) && i != '=' && i != '-' && i != '+' && i != ' ') {
					constant = i;
					break;
				}
			}
		}
	}

	boolean isInteger(String value) {
    		if (value == null || value.isEmpty()) {
        		return false;
    		}
    
    	// Check first character for sign or digit
    	int startIndex = 0;
    	char firstChar = value.charAt(0);
    	if (firstChar == '+' || firstChar == '-') {
        	if (value.length() == 1) {
            		return false;  // String is only a sign
        	}
        	startIndex = 1;
    	}
    
    	// Check remaining characters are all digits
    	for (int i = startIndex; i < value.length(); i++) {
        	if (!Character.isDigit(value.charAt(i))) {
            		return false;
        		}
    		}
    
    		return true;
	}

}

class EquCode extends Helper {

	public void solve(String equation){
		String[] equList = equation.split(" ");
		boolean isReadingLeft = true;
		boolean leftIsPositive = true;
		boolean rightIsPositive = true;

		String leftFormattedEqu = "";
		String rightFormattedEqu = "";

		

		// sorting like terms
		System.out.println("Collecting like terms:");


		// left side
		for(String equ : equList){
			String equNum = "";
			if(equ.equals("=")){
				isReadingLeft = false;
			}

			//System.out.println("all: " + equ + isReadingLeft + " " + isInteger(equ));


			if(!isInteger(equ) && !equ.equals("=") && !equ.equals("+") && !equ.equals("-")){
				// below is to check if a number is after or before the '=' sign
				if(isReadingLeft){
					leftFormattedEqu += equ + " ";
				}else{
					leftFormattedEqu += "-" + equ + " ";
				}
				//System.out.println("inside: " + equ );
			}

			for(char pos : equ.toCharArray()){
				if(pos == '-'){
					leftIsPositive = false;
					break;
				}
			}
		}

		System.out.println("left: " + leftFormattedEqu);

		
		// reset is reading left 
		isReadingLeft = true;

		// right side
		for(String equ : equList){
			String equNum = "";
			if(equ.equals("=")){
				isReadingLeft = false;
			}

			//System.out.println("all: " + equ + isReadingLeft + " " + isInteger(equ));
			for(char pos : equ.toCharArray()){
				if(pos == '-'){
					rightIsPositive = false;
					break;
				}
			}


			if(isInteger(equ) && !equ.equals("=") && !equ.equals("+") && !equ.equals("-")){
				// below is to check if a number is after or before the '=' sign
				if(!isReadingLeft){
					rightFormattedEqu += equ + " ";
				}else{
					rightFormattedEqu += "-" + equ + " ";
				}
				//System.out.println("inside: " + equ );
			}

			
		}

		System.out.println("right: " + rightFormattedEqu);



		String[] leftSide = leftFormattedEqu.split(" ");
		String[] rightSide = rightFormattedEqu.split(" ");
		
		String leftMath = leftIsPositive ? " + " : " - ";
		String rightMath = rightIsPositive ? " + " : " - ";

		// display like terms
		System.out.println(String.join(leftMath, leftSide) + " = " + String.join(rightMath, rightSide));
		//System.out.println(leftFormattedEqu);


		// suming the equation:
		// then i declared two variables to store the sumation of each side of the equation..
		int leftSum = 0;
		int rightSum = 0;


		// suming the left side
		for(String num : leftSide){
			if(isInteger(num)){
				leftSum += Integer.parseInt(num);
			}else if(!isInteger(num) || num.startsWith("-")){
				String filteredSum = "";
					
				//System.out.println(num);
				// let n rep the numbers in the num - string
				for(char n : num.toCharArray()){
					//System.out.println("num in filterdSum: " + num);
					if(Character.isDigit(n) || n == '-'){
						filteredSum += n;
						//System.out.println("n in num: " + n);
					}
				}

				if(!filteredSum.isEmpty()){
					leftSum += Integer.parseInt(filteredSum);
				}else{
					leftSum += 1;
				}

			}
			
		}

		//System.out.println("leftSum: " + leftSum);

		// suming the right side
		for(String num : rightSide){
			if(isInteger(num)){
				rightSum += Integer.parseInt(num);
			}
			
		}

		//System.out.println("rightSum: " + rightSum);

		//System.out.println(leftSum +""+ constant + " = " + rightSum);

		// divide both side by the coefficient of Constant
		System.out.println("Divide both side by the coefficient of " + constant + ":");
		System.out.println(leftSum +""+ constant + "/" + leftSum + " = " + rightSum + "/" + leftSum);

		// finalize
		double division = (double) rightSum/leftSum;
		System.out.println("then:");
		System.out.println(constant + " = " + division + " or " + rightSum + "/" + leftSum);


		
		
		
	}


	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		EquCode solver = new EquCode();

		// ask user to input equation
		System.out.println("Input your linear Equation: ");
		String myEquation = input.nextLine();

		if(myEquation.split("=").length < 2){
			System.out.println("Your equation is not valid.. examples of linear Equations are [X + 3 = 5, 2y + 4y = 3, 4y + 3 = 6, etc...]");
		}else{
			solver.getConstant(myEquation);
			System.out.println("from your equ: " + myEquation);
			System.out.println("\nSolving for " + solver.constant + "\n");
			
			
			solver.solve(myEquation);
		}

		
	}
}


// what i was trying to do before sleeping
// I was trying to the left side slitting and gettting left sum removing constants from integer
// - trying to use the + and - signs in the code
// - trying to use the isReadingLeft to know when to do right
// carrying over has been sorted...
// successfully collected like terms and displayed it