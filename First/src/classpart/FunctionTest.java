package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		
		int sum = add(num1,num2);
		System.out.println(num1 + "+" +num2 +"=" + sum + "입니다.");
		
		int sub = minus(num1,num2);
		System.out.println(num1 + "-" +num2 +"=" + sub + "입니다.");
		
		float divide = divide(num1,num2);
		System.out.println(num1 + "/" +num2 +"=" + divide + "입니다.");
		
		int mul = multi(num1,num2);
		System.out.println(num1 + "*" +num2 +"=" + mul + "입니다.");
		
		
	}
	
	public static int add(int n1, int n2) {
		
	int result = n1+n2;
	return result;
	}
	
	public static int minus(int n1, int n2) {
		
		int result = n1-n2;
		return result;
	}
	
	public static float divide(int n1, int n2) {
		
		int result=n1/n2;
		return result;
	}
	public static int multi(int n1, int n2) {
		
		int result = n1*n2;
		return result;
	}

}
