package array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] arr = {{"ab","cd","ef","gh","ij","kl","mn","op"},{"qr","st","uv","wx","yz"}};

		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
}

}
