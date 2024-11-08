import java.util.Scanner;

class LinearCalc{

	char Constant = 'x';

	public boolean isInteger(String value) {
    		for (char val : value.toCharArray()) {
        		if (!Character.isDigit(val) && val != '-') { 
				//System.out.println(val + " is nan");
				return false;  
        		}
    		}
		//System.out.println(value + " is a num");
    		return true; 
	}	


	public char getConstant(String equation){
		String equ = equation.trim();
		System.out.println(equ);
		for(int i = 0; i < equ.length(); i++){
			char symbol = equ.charAt(i);
			if(!Character.isDigit(symbol) && symbol != '=' && symbol != '+' && symbol != '-' && symbol != ' '){
				Constant = equ.charAt(i);
				return equ.charAt(i);
			}
		}
		return 'x';
	}

	public void sortMethod(String equ){
		String[] math = equ.split(" ");
		//String[] focusArea = math[0];
		//System.out.println(String.join("-", math));
		String leftSide = "";
		String rightSide = "";
		
		for(int index = 0; index < math.length; index++){
			String value = math[index];

			if (!isInteger(value) && value.charAt(0) != '=' && !value.equals("+") && !value.equals("+") && !value.equals("-")
			 && !value.equals(" ") && value.charAt(0) != '+' ) {
				//if()
				leftSide += value + " ";
				//System.out.println("is coeff");
			}
		}

		for(int index = 0; index < math.length; index++){
			String value = math[index];

			if (isInteger(value)  && !value.isEmpty() && !value.equals("-")) {
				rightSide += value + " ";
				//System.out.println("is coeff");
			}
		}

		System.out.println("left: " + leftSide);
		
		System.out.println("right: " + rightSide);

		System.out.println("collect like terms:");
		String[] nleftSide = leftSide.split(" ");
		String[] nrightSide = rightSide.split(" ");
		System.out.println(String.join(" + ", nleftSide) + " = " + String.join(" + ", nrightSide));

		// suming the equations
		System.out.println("sum the equation:");
		int leftSum = 0;
		int rightSum = 0;

		/* for (int index = 0; index < nleftSide.length; index++){
			String ls = nleftSide[index];
			if(isInteger(ls)){
				leftSum += Integer.parseInt(ls);
				return;
			}
			for(String x : ls.split("")){
				//int tx = x.parseDouble();
				if(isInteger(x)){
					leftSum += Integer.parseInt(x);
				}
			}
		} */

		for (int index = 0; index < nleftSide.length; index++) {
		    String ls = nleftSide[index];
		    String[] spls = ls.split("");
			
		    if (isInteger(ls)) {
		       leftSum += Integer.parseInt(ls);
		    } else if (!isInteger(ls) && spls[0].equals("-")){
			String negative = "";
			System.out.println("negating");
			for (String x : ls.split("")) {
		            if (isInteger(x) && !x.equals("-")) {
		                negative += Integer.parseInt(x);
		            } 
		        }
			leftSum += -Integer.parseInt(negative);
		     } else{
		        for (String x : ls.split("")) {
		            if (isInteger(x) && !x.equals("-")) {
		                leftSum += Integer.parseInt(x);
		            } 
		        }
		    }
		}
		 
	 	for (int index = 0; index < nrightSide.length; index++) {
		     String ls = nrightSide[index];
		    if (isInteger(ls)) {
		       rightSum += Integer.parseInt(ls);
		    } else {
		        for (String x : ls.split("")) {
		            if (isInteger(x)) {
		                rightSum += Integer.parseInt(x);
		            }
		        }
		    }
		}

		System.out.println("right sum: " + rightSum);
		System.out.println("left sum: " + leftSum);

		System.out.println(leftSum +""+ Constant + " = " + rightSum);

		// divide both side by the coefficient of Constant
		System.out.println("Divide both side by the coefficient of " + Constant + ":");
		System.out.println(leftSum +""+ Constant + "/" + leftSum + " = " + rightSum + "/" + leftSum);

		// finalize
		double division = (double) rightSum/leftSum;
		System.out.println("then:");
		System.out.println(Constant + " = " + division);
	}

	


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		LinearCalc solver = new LinearCalc();

		System.out.print("Enter you equation: ");
		String equation = input.nextLine();

		
		System.out.println("\nsolving for: " + solver.getConstant(equation));

		solver.sortMethod(equation);

		input.close();
	}
}