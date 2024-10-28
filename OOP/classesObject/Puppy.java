public class Puppy{
	int age;

	public Puppy(String name){
		System.out.println(name);
	}

	public void setAge(int age){
		this.age = age;
	}

	public void getAge(){
		System.out.println("age: " + this.age);
	}

	public static void main(String... args){
		Puppy myPuppy = new Puppy("zoe");

		myPuppy.setAge(1);
		myPuppy.getAge(); 

		System.out.println("Variable value: " + myPuppy.age);
	}
}