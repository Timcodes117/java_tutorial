
public class Switch{
	public static void main(String args[]){
		char grade = 'D';

		switch(grade){
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
			case 'C':
				System.out.println("Good");
				break;
			case 'D': 
				System.out.println("Pass");
				break;
			case 'F':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid grade");
			
		}

	}
}   