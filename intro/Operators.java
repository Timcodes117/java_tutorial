public class Operators{
	public static void main(String[] args){

		// tenary operators
		// these are also conditional operators
		int a, b;
		a = 10;
		b = (a == 1) ? 20 : 30;

		System.out.println("value of b is : " + b);

		b = (a == 10) ? 20 : 30;
		System.out.println("value of b is : " + b);

		// unary operators
		int x = 10;
		int y = 15;

		/* here value is printed before it is incremented
		*/
		System.out.println(x++); // this is a post increment

		/* here value is incremented before it is printed */
		System.out.println(++x); // this is a post increment


		//logical operators
		// && and
		// || or
		// ! not

		// Assignment operators
		a += 1; // this is same as (a = a + 1)
		a /= 1;
		b *= 5;
		b %= 2;
		b ^= 3; // b = b ^ 3

		// instanceof Operator
		String name = "Timothy";
		
		boolean result = name instanceof String;
		System.out.println(result);

	}
}