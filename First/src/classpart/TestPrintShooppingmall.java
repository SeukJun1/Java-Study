package classpart;

public class TestPrintShooppingmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestShoppingmall shop = new TestShoppingmall();
		shop.renum = 201803120001L;
		shop.reID = "abc123";
		shop.reDay = "2018년 3월 12일";
		shop.rename = "홍길순";
		shop.reItemNum = "PD0345-12";
		shop.reAddress = "서울시 영등포구 여의도동 20번지";
	
		
		System.out.println("주문번호 :"+shop.renum);
		System.out.println("주문자 아이디 : " +shop.reID);
		System.out.println("주문 날짜 : " +shop.reDay);
		System.out.println("주문자 이름 : " +shop.rename);
		System.out.println("주문 상품 번호 : " +shop.reItemNum);
		System.out.println("배송 주소 : " +shop.reAddress);

		
	}

}
