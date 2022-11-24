package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKsj = new Student() ;
		studentKsj.studentName = "김석준";
		
		System.out.println(studentKsj.studentName);
		System.out.println(studentKsj.getStudentName());
		
		}

}
