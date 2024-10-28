import java.io.*;

public class Employee{
	String name;
	int age;
	String designation;
	double salary;

	public Employee(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public void setDesignation(String designation){
		this.designation = designation;
	}

	public void printDetails(){
		System.out.println("Employee name: " + name);
		System.out.println("Employee age: " + age);
		System.out.println("Employee salary: " + salary);
		System.out.println("Employee desgination: " + designation);
	}
}
