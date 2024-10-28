class FreshJuice{
	enum freshJuiceShop {SMALL, MEDIUM, LARGE};
	freshJuiceShop size;
}

public class Enums {
	public static void main(String []args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.freshJuiceShop.MEDIUM;	
		System.out.println("SIZE: " + juice.size); 	
	}
}