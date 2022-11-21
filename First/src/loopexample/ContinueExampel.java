package loopexample;

public class ContinueExampel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int total = 0;
		 int num;
		 
		 for(num=1; num<= 100; num++) {
			 
			 if(num%3!=0)
				 continue;
			 System.out.println(num);
			
		 }
		 
	}

}
