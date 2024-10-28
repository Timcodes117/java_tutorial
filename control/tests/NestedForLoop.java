public class NestedForLoop{
	static public void main(String... args){
		int x = 1;
		int tableLength = 10;

		for (int t = 1; t < tableLength; t++){
			System.out.print("\n Table of " + t + " is ");
			for (x=1; x < tableLength; x++) {
				System.out.print(" " + t * x + " ");
			}
		}
	}
}