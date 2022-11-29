package array;
import java.util.ArrayList;
public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Student> student = new ArrayList <Student>();
	
	student.add(new Student(1001,"김"));
	student.add(new Student(1002,"석"));
	student.add(new Student(1003,"준"));
	
	for(Student student1:student) {
		student1.StudentInfo();
	}
	
	}
	

}
