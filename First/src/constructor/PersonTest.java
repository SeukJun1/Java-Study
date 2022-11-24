package constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		
		Person personKim = new Person();
		
		personKim.height =175.24F;
		personKim.name = "김석준";
		personKim.weight = 74.24F;
		
		
		System.out.println("이름 :" + personKim.name);
		System.out.println("키 :" + personKim.height);
		System.out.println("몸무게 :" + personKim.weight);
		Person personKim1 = new Person("김석준1", 175,75);
		
		System.out.println(personKim1.name + personKim1.height + personKim1.weight);
	}

}
