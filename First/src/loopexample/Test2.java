package loopexample;

public class Test2 {
//구구단을 짝수 단만 출력하도록 프로그램을 만들어보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
	
		for(i=2;i<=9;i++) {
			if (i%2==0)
			for(j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}

}
