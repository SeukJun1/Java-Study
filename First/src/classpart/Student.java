package classpart;

public class Student {
		
	int studentID;
	String studentName;
	int grade;
	String address;
	

	//학생 이름을 가져오겠다 get 어디에서 studentName 함수에서.
	public String getStudentName() { 
		
		return studentName;
	}
	public void setStudentName(String name) {
		
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentKsj = new Student();
		studentKsj.studentName = "김석준";
		
		System.out.println(studentKsj.studentName);
		System.out.println(studentKsj.getStudentName());
		
	}

}
