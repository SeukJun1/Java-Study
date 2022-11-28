package staticex;

public class Student3 {
	public static int studentnum = 1000;
	public String studentName;
	public int studentID;
	public int studentCard;
	
public Student3() {
	
	studentnum++;
	studentID = studentnum;
	studentCard = studentID+100;
	

}
public String getStudentName() {
	return studentName;
}

public void setStudentName(String name) {
	studentName = name;
}


}
