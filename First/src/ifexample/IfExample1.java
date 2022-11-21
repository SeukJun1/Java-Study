package ifexample;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int age = 6;
//		if(age>=8) {
//			
//			System.out.println("학교에 다닙니다.");
//			
//		}
//		else
//		{
//			System.out.println("학교에 다니지 않습니다.");
//			
//		}
		System.out.println("성별을 입력해 주세요 T:남성 F:여성 (입력란 : )");
		Scanner a = new Scanner(System.in);
		char gender = a.next().charAt(0);
		
		if(gender =='F'){
		
			System.out.println("여성 입니다.");
			
		}
		else {
			System.out.println("남성 입니다.");
		}
		
	}

}
