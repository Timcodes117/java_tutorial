class DogClass{
	String breed;
	int age;
	String color;

	public void setBreed(String breed){
		this.breed = breed;
	}

	public void setColor(String color){
		this.color = color;	
	}

	public void setAge(int age){
		this.age = age;
	}

	public void printDetails(){
		System.out.println("the age is: " + this.age + "yrs");
		System.out.println("color of the dog is: " + this.color);
		System.out.println("the breed is: " + this.breed);
	}

}

public class Dog{
	public static void main(String[] args){
		DogClass dogObj = new DogClass();
		
		dogObj.setBreed("german Shephard");
		dogObj.setAge(3);
		dogObj.setColor("brown");

		dogObj.printDetails();
	}
}