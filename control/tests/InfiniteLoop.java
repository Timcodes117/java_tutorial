public class InfiniteLoop{
	public static void main(String[] args) {
		int x = 0;
		
		for(;;) {
			x++;
			System.out.println("Value of X is : " + x);
		}
	}
}