package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student1 studentKim = new Student1();
	studentKim.setStudentName("김석준");
	System.out.println(studentKim.serialNum);
	System.out.println(studentKim.studentName+"학번:"+studentKim.studentID);
	
	Student1 studentPark = new Student1();
	studentPark.setStudentName("박박이");
	System.out.println(studentPark.serialNum);
	System.out.println(studentPark.studentName+"학번:"+studentPark.studentID);
	
	}

}
