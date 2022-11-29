package array;

public class Student {

	
	public int studentID;
	public String name;
	
public Student(int studentID, String name) {
	this.studentID = studentID;
	this.name = name;
}
public int getStudentID() {
	return studentID;
}
public void setStudentID(int studentId) {
	
	this.studentID = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public void StudentInfo() {
	System.out.println(studentID +","+name);
}
}
