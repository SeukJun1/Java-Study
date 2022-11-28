package singletion;
//싱글톤 패턴
public class Company {
	private static Company instance = new Company();//유일하게 만든 인스턴스
	private Company() {	
	}
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
