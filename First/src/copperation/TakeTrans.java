package copperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student studentKim = new Student("Kim", 5000);
		Student studentLee  = new Student("Lee", 5000);
		Student Edward = new Student("Edward", 12000);
		
		Bus bus100 = new Bus(100);
		studentKim.takeBus(bus100);
		studentKim.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentLee.takeSubway(subwayGreen);
		studentLee.showInfo();
		subwayGreen.showInfo();
		
		Taxi Taxi4862 = new Taxi("Taxi 4862");
		Edward.takeTaxi(Taxi4862);
		Edward.showInfo();
		Taxi4862.showInfo();
		
	}

}
