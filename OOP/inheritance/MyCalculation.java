
// this is a super class
class AnyMath{
    public void add(int num1, int num2){
        int addition = num1 + num2;
        System.out.println(addition);
    }
}

//this is a sub-class
public class MyCalculation extends AnyMath{

    public void subtract(int num1, int num2){
	System.out.println(num1 - num2);
    }
    public static void main(String args[]){
        MyCalculation calc = new MyCalculation();
	calc.add(3,4);
	calc.subtract(5, 9);
    }
}