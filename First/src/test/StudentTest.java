package test;

import hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKim = new Student();
		
		//studentLee.studentName="김석준";
		studentKim.setStudentName("김석준");
		System.out.println(studentKim.getStringName());

	}

}
