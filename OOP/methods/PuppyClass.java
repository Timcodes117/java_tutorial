public class PuppyClass{

	private int age;
	static String BREED = "bull dog";

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public static void main(String args[]){
		PuppyClass myPup = new PuppyClass();

		myPup.setAge(2);
		System.out.println("age: " + myPup.getAge());
		System.out.println("breed: " + PuppyClass.BREED);
	}
}