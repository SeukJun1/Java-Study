package loopexample;

public class Test3 {
//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=2; i<=9;i++) {
			
			for(int j=1;j<=9;j++) {
					if(i<j)
						break;
				System.out.println(i +"*" + j + "=" + i*j);
			}
			System.out.println();
		}
	}

}
