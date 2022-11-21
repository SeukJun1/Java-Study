package loopexample;

import java.util.Scanner;
//operator 값이 + - * / 인 경우에 사칙연산을 수행하는 ㅍ릎로그램을 switch-case 문을 사용하여 작성하세요
	//int num1=10;
	//int num2 = 2;
	// char operator ='+';
public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =10;
		int num2= 2;
		
		System.out.print("계산할 수식을 입력해 주세요:");
		
		Scanner o = new Scanner(System.in);
		
		char operator = o.next().charAt(0);
		
		switch(operator) {
		
		case '+' :
			int num3 = num1+num2;
			System.out.println(num1 + "+"+ num2+"="+ num3 +"입니다.");
			break;
		case '-' :
			int num4 = num1-num2;
			System.out.println(num1 + "-"+ num2+"="+ num4 +"입니다.");
			break;
		case '*' :
			int num5 = num1*num2;
			System.out.println(num1 + "*"+ num2+"="+ num5 +"입니다.");
			break;
		case '/' :
			int num6 = num1/num2;
			System.out.println(num1 + "/"+ num2+"="+ num6 +"입니다.");
			break;
			
		
		
		}
	}

}
