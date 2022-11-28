package singletion;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory factory = CarFactory.getinstance();
		Car mysonata = factory.createCar();
		Car yoursonata = factory.createCar();
		
		System.out.println(mysonata.getCarNum());
		System.out.println(yoursonata.getCarNum());
		
	}

}
