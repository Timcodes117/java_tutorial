
/* here i learn about type casting
* there are implicit and explicit typeCasting
* implict is also known as the widening type casting
* we can only convert from a small dataType to a larger one.
* implicit is done by the compiler at compile time
*
* explicit is known as the narrow type-casting e.g (int)
* we can convert from a  larger one to a small dataType and vice versal.
* this conversion is done by the programmer by casting
*/

public class TypeCasting{

	public static void main(String[] args){
		//widening - casting
		int num1 = 5004;
		double num2 = 2.5;
		double sum = num1 + num2;

		System.out.println("sum  = " + sum);

		//Narrowing Type Casting
		int num = 10;
		double doubleNum = (double) num;
		System.out.println(doubleNum); // converting from int to double

		int convertedInt = (int) doubleNum;
		System.out.println(convertedInt); // converting fromdouble to int
	}
}