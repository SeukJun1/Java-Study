package classpart;

public class TestPrintMan {

	public static void main(String[] args) {
		
		TestMan tm = new TestMan();
		tm.manAge = 40;
		tm.manName = "James";
		tm.isMarried = true;
		tm.children = 3;
		
		
		System.out.println("이 사람의 나이 : "+ tm.manAge);
		System.out.println("이 사람의 이름 : "+ tm.manName);
		System.out.println("이 사람의 결혼여부 : "+ tm.isMarried);
		System.out.println("이 사람의 자녀 수 : "+ tm.children);
		
		
	}

}
