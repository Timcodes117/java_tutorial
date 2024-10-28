public class Tester{

	int num = 10;

	public Tester(){
		System.out.println("the value of num is: " + num);
	}

	public Tester(int num){
		this();
		this.num = num;
	}

	public void greet(){
		System.out.println("Hi there, welcome to my java course");
	}

	public void print(){

		int num = 20;

		System.out.println("local var: " + num);
		System.out.println("Instance var: " + this.num);
		
		this.greet();
	}

	public static void main(String[] args){
		Tester tester = new Tester();
		tester.print();

		Tester tester2 = new Tester(80);
		tester2.print();
	}

	
}