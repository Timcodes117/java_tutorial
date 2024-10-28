public class BreakContinue{
	public static void main(String[] args) {
		for(int x = 0; x < 5; x++) {
 			if(x == 3)
				continue;
			System.out.println("x is: " + x);
		}

		for(int x = 0; x < 5; x++) {
 			if(x == 3)
				break;
			System.out.println("\nx is: " + x);
		}
	}
}