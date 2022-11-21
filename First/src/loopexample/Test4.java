package loopexample;

public class Test4 {
//반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어보세요.
			
	
//				*
//			   ***
//			  *****
//			 ******* 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;
		int k;
		int num = 5;
		
		for(i=0;i< num; i++)
		{
		for(j=1; j<num-i;j++)
		{			
			System.out.print(" ");
			}
		
		for(k=0;k<i*2+1;k++) {
			System.out.print("*");
		}
		System.out.println("");
		}
		
		
		
		
		
	}
	
	

}
