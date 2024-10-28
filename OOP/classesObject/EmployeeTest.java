import java.io.*;


public class EmployeeTest{
	public static void main(String[] args){
		Employee emp1 = new Employee("Tim");
		Employee emp2 = new Employee("Deborah");

		emp1.setAge(23);
		emp1.setSalary(2000000);
		emp1.setDesignation("Backend Developer");
		emp1.printDetails();
		
		System.out.println("");

		emp2.setAge(28);
		emp2.setSalary(30000);
		emp2.setDesignation("Product Designer");
		emp2.printDetails();
	}
}