package array;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student St[] = new Student[5];
		
		St[0] = new Student(1001,"James");
		St[1] = new Student(1002,"Tomas");
		St[2] = new Student(1003,"Edward");
		
		for(int i=0;i<St.length;i++) {
			St[i].StudentInfo();
			
		}
	}

}
