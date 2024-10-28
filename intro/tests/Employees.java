

public class Employees{
	public String name;
	private double salary;

	public Employees (String empName) {
		name= empName;
	}

	public void setSalary(double empSalary) {
		salary = empSalary;
	}

	public void printEmpInfo(){
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
	}
	
	public static void main(String... args){
		Employees emp1 = new Employees("Timothy");
		emp1.setSalary(1000000);
		emp1.printEmpInfo();
	}
}