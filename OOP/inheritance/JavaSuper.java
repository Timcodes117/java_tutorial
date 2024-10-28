
class Super_class{
	int num = 2;

	public void printAll(){
		System.out.println("printing...");
		System.out.println("num is : " + 2);
	}
}

public class JavaSuper extends Super_class{

	public void display(){
		System.out.println(super.num);
		super.printAll();
	}

	public static void main(String[] args){
		JavaSuper obj = new JavaSuper();
		obj.display();
	}
}