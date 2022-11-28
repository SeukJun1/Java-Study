package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student2 studentKim = new Student2();
	studentKim.setStudentName("김석준");
	System.out.println(Student2.getSerialNum());
	System.out.println(studentKim.studentName+"학번:"+studentKim.studentID);
	
	Student2 studentPark = new Student2();
	studentPark.setStudentName("박박이");
	System.out.println(Student2.getSerialNum());
	System.out.println(studentPark.studentName+"학번:"+studentPark.studentID);
	
	}

}
