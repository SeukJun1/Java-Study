package singletion;

public class CarFactory {

	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {
	}
	
		public static CarFactory getinstance() {
			
			if(instance ==null) {
				instance = new CarFactory();
			}
			return instance;
		
		}

		public Car createCar() {
			// TODO Auto-generated method stub
			Car.CarNum++;
			return null;
			
		}
}

