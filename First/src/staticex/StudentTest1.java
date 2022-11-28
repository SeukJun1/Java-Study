package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student studentKim = new Student();
		studentKim.setStudentName("김석준");
		System.out.println(studentKim.serialNum);
		studentKim.serialNum++;
		
		Student studentPark = new Student();
		studentPark.setStudentName("박박이");
		System.out.println(studentPark.serialNum);
		System.out.println(studentKim.serialNum);
		
	}

}
