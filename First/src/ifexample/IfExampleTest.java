package ifexample;

import java.util.Scanner;

public class IfExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점수를 입력해 주세요 : ");
		
		Scanner st = new Scanner(System.in);
		int score = st.nextInt();
		
		
		if(score>=90) {
			System.out.println("학점은 A 입니다.");
		}
		else if(score<90 && score>=80){
			System.out.println("학점은 B 입니다.");
		}
		else if(score<80 && score>=70) {
			System.out.println("학점은 C 입니다.");
		}
		else if (score<70 && score>=60) {
			System.out.println("학점은 D 입니다.");
		}
		else {
			System.out.println("학점은 F 재수강 입니다.");
			
		}
		
	}

}
