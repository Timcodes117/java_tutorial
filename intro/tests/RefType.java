class Animal{
	public String name;

	public Animal(String anim_name){
		name = anim_name;
	}

	public void printName(){
		System.out.println(name);
	}

}


public class RefType {
	static public void main(String[] args){
		Animal myAnimal = new Animal("dog");
		String myString =  new String("Hello world");

		System.out.println(myString);
		myAnimal.printName();
	}
}