public class ForLoops{
	public static void main(String args[]){
		for(int x = 0; x < 10; x += 1){
			System.out.println("x is " + x);
		}

		for(int x = 10; x < 20; x++){
			System.out.println("x is " + x);
		}


		// printing Array Elements using Loop
		int[] numbers = {10, 20, 30, 40, 50};

		for(int index = 0; index < numbers.length; index++){
			System.out.println("Value of item: " + numbers[index]);
		}

		
	}
}