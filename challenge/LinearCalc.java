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
		// 
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
		String leftSide = "";
		String rightSide = "";
		boolean isOk = false;

		boolean shouldNegate = false;
		
		for(int index = 0; index < math.length; index++){
			String value = math[index];

			

			if(value.trim().equals("-")){
				shouldNegate = true;
			}else{
				shouldNegate = false;
			}


			System.out.println(shouldNegate + "  " + value);

			

			if (!isInteger(value) && value.charAt(0) != '=' && !value.equals("+")
			 && !value.equals(" ") && value.charAt(0) != '+' ) {
				if(shouldNegate){
					leftSide += "-"+value + " ";
				} else {
					leftSide += value + " ";
				}
				//System.out.println("is coeff");
			} 
		}

		for(int index = 0; index < math.length; index++){
			String value = math[index];
			

			//System.out.println(isOk);

			if (value.equals("=")) {
        			isOk = true;
    			}

			if(value.charAt(0) == '-'){
				shouldNegate = true;
			}else{
				shouldNegate = false;
			}
			//System.out.println(isOk);

			if (isInteger(value)  && !value.isEmpty() && !value.equals("-")) {
				
				if(shouldNegate && !isOk ){	
					System.out.println(value);			
					rightSide += '-' + value + " ";
				}  else {
					rightSide +=  value + " ";
				}
				//System.out.println("is coeff");
			}
		}

		System.out.println("left: " + leftSide);
		
		//System.out.println("right: " + rightSide);

		System.out.println("collect like terms:");
		String[] nleftSide = leftSide.split(" ");
		String[] nrightSide = rightSide.split(" ");

		System.out.println(String.join(" + ", nleftSide) + " = " + String.join(" + ", nrightSide));

		//["a", "b", ] = "
		// suming the equations
		System.out.println("sum the equation:");
		int leftSum = 0;
		int rightSum = 0;

		for (int index = 0; index < nleftSide.length; index++) {
		    String ls = nleftSide[index];
		    String[] spls = ls.split("");
		    System.out.println("negate: " + ls);
			 
		    if (isInteger(ls)) {
		       leftSum += Integer.parseInt(ls);
		    } else if (!isInteger(ls) && spls[0].equals("-")){
			String negative = "";
			//System.out.println("negating");
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


		if(leftSum == 0){
			leftSum = 1;
		}
		 
	 	for (int index = 0; index < nrightSide.length; index++) {
		     String rs = nrightSide[index];
		    if (isInteger(rs)) {
		       rightSum += Integer.parseInt(rs);
		    } else {
		        for (String x : rs.split("")) {
		            if (isInteger(x)) {
		                rightSum += Integer.parseInt(x);
		            }
		        }
		    }
		}

		//System.out.println("right sum: " + rightSum);
		//System.out.println("left sum: " + leftSum);

		System.out.println(leftSum +""+ Constant + " = " + rightSum);

		// divide both side by the coefficient of Constant
		System.out.println("Divide both side by the coefficient of " + Constant + ":");
		System.out.println(leftSum +""+ Constant + "/" + leftSum + " = " + rightSum + "/" + leftSum);

		// finalize
		double division = (double) rightSum/leftSum;
		System.out.println("then:");
		System.out.println(Constant + " = " + division + " or " + rightSum + "/" + leftSum);
	}

	


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