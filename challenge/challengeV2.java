import java.util.Scanner;

class Helper {
    char constant = 'x';

    void getConstant(String value) {
        if (!value.isEmpty()) {
            for (char i : value.toCharArray()) {
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

        int startIndex = 0;
        char firstChar = value.charAt(0);
        if (firstChar == '+' || firstChar == '-') {
            if (value.length() == 1) {
                return false;
            }
            startIndex = 1;
        }

        for (int i = startIndex; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}

class challengeV2 extends Helper {

    public void solve(String equation) {
        String[] equList = equation.split(" ");
        boolean isReadingLeft = true;
        boolean leftIsPositive = true;
        boolean rightIsPositive = true;

        String leftFormattedEqu = "";
        String rightFormattedEqu = "";

        System.out.println("Collecting like terms:");

        // left side
for (String equ : equList) {
    if (equ.equals("=")) {
        isReadingLeft = false;
        continue;
    }

    // Skip + and - signs
    if (equ.equals("+") || equ.equals("-")) continue;

    // If we're on the left side of equals
    if (isReadingLeft) {
        // If it's a number or has a variable
        if (!equ.equals("=")) {
            leftFormattedEqu += equ + " ";
        }
    }
}

        System.out.println("left: " + leftFormattedEqu);

        // reset is reading left 
        isReadingLeft = true;

        // right side
        for (String equ : equList) {
            if (equ.equals("=")) {
                isReadingLeft = false;
                continue;
            }

            if (isInteger(equ) && !equ.equals("=") && !equ.equals("+") && !equ.equals("-")) {
                if (!isReadingLeft) {
                    rightFormattedEqu += equ + " ";
                }
            }
        }

        System.out.println("right: " + rightFormattedEqu);

        String[] leftSide = leftFormattedEqu.split(" ");
        String[] rightSide = rightFormattedEqu.split(" ");

        // display like terms
        System.out.println(String.join(" + ", leftSide) + " = " + String.join(" + ", rightSide));

        // suming the equation
        int leftSum = 0;
        int rightSum = 0;

        // suming the left side
        for (String num : leftSide) {
            if (num.isEmpty()) continue;
            
            if (isInteger(num)) {
                leftSum += Integer.parseInt(num);
            } else {
                String filteredSum = "";
                boolean hasDigits = false;

                for (char n : num.toCharArray()) {
                    if (Character.isDigit(n) || n == '-') {
                        filteredSum += n;
                        if (Character.isDigit(n)) {
                            hasDigits = true;
                        }
                    }
                }

                if (!filteredSum.isEmpty() && hasDigits) {
                    leftSum += Integer.parseInt(filteredSum);
                } else if (num.startsWith("-")) {
                    leftSum -= 1;  // Handle case of just "-x"
                } else {
                    leftSum += 1;  // Handle case of just "x"
                }
            }
        }

        // suming the right side
        for (String num : rightSide) {
            if (!num.isEmpty() && isInteger(num)) {
                rightSum += Integer.parseInt(num);
            }
        }

        // divide both side by the coefficient of Constant
        System.out.println("Divide both side by the coefficient of " + constant + ":");
        System.out.println(leftSum + "" + constant + "/" + leftSum + " = " + rightSum + "/" + leftSum);

        // finalize
        double division = (double) rightSum / leftSum;
        System.out.println("then:");
        System.out.println(constant + " = " + division + " or " + rightSum + "/" + leftSum);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        challengeV2 solver = new challengeV2();

        System.out.println("Input your linear Equation: ");
        String myEquation = input.nextLine();

        if (myEquation.split("=").length < 2) {
            System.out.println("Your equation is not valid.. examples of linear Equations are [X + 3 = 5, 2y + 4y = 3, 4y + 3 = 6, etc...]");
        } else {
            solver.getConstant(myEquation);
            System.out.println("from your equ: " + myEquation);
            System.out.println("\nSolving for " + solver.constant + "\n");
            solver.solve(myEquation);
        }
    }
}