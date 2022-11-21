package ifexample;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("이동을 원하시는 층을 입력해주세요 :");
		Scanner n = new Scanner(System.in);
		int b = n.nextInt();
		
		switch(b) {
		
		case 1:
			System.out.println("약국 입니다.");
			break;
		case 2:
			System.out.println("정형외과 입니다.");
			break;
		case 3:
			System.out.println("피부과 입니다.");
			break;
		case 4:
			System.out.println("치과 입니다.");
			break;
		case 5:
			System.out.println("헬스클럽 입니다.");
			break;
		}
	}

}
