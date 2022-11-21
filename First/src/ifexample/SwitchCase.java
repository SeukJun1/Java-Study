package ifexample;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("등수를 입력해주세요.(1~3) :");
		Scanner sr = new Scanner(System.in);
		int ranking = sr.nextInt();
		char medalColor;
		
		switch(ranking) {
		
		case 1: medalColor = 'G';
		System.out.println("1등의 메달 색은 " + medalColor+"old 입니다.");
			break;
		case 2: medalColor = 'S';
		System.out.println("2등의 메달 색은 " + medalColor+"ilver 입니다.");
			break;
		case 3: medalColor = 'B';
		System.out.println("3등의 메달 색은 "+ medalColor+"onzy 입니다.");
			break;
		default:
			medalColor = 'A';
		}
		
	}
	

}
