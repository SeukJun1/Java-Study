package copperation;

public class Taxi {

	
	 String TaxiNumber;
	 int passengerCount;
	 int money;
	 
public Taxi(String TaxiNumber) {
	
	this.TaxiNumber = TaxiNumber; 
}
public void take(int money) {
	
	this.money +=money;
	passengerCount++;
}
public void showInfo() {
	
	System.out.println(TaxiNumber+"의 승객은" + passengerCount+"명 이며, 수입은"+ money+"원 입니다.");
	
}
}
