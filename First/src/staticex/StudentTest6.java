package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student3 studentKim = new Student3();
		Student3 studentPark = new Student3();
		studentKim.setStudentName("김석준");
		studentPark.setStudentName("박박이");
		
		System.out.println(studentKim.studentName+"카드번호:"+studentKim.studentCard);
		System.out.println(studentPark.studentName+"카드번호:"+studentPark.studentCard);;
		
		
	}

}
