public class ForEachClass{
	public static void main(String args[]) {
		Student[] students = {new Student("Tim", 2), new Student("James", 5)};

		for (Student student : students){
			System.out.print(student + ", ");
		}
	}
}

class Student{
	String name;
	int rowNumber;

	Student(String studentName, int num){
		name = studentName;
		rowNumber = num;
	}

	@Override
	public String toString(){
		return "[ " + this.rowNumber + ", " + this.name + " ]";
	}
}