public class Variables{
	int number = 100; // this is an instance variable

	static int number2 = 100; // this is a static variable
	/* i learnt that static methods and variables can be 
	accessed without creating an instance of its class*/
	
	public static void func(){
	int number3 = 90; // this is a local variable
	System.out.println("local: " + number3);
	}

	public static void main(String[] args){
		Variables variables = new Variables();
		func();
		System.out.println("instance: " + variables.number);
		System.out.println("static: " + number2);
		int r,p, m;
		
		//cont.
		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);

		//widening
		int n = 10;
		float f = n;
		System.out.println(a);
		System.out.println(f);

		//narrowing - TypeCasting
		float flt = 10.5f;
		int ch = (int) f;
		System.out.println(flt);
		System.out.println(ch);	

	}
}