package singletion;

public class Car {
	public static int CarNum = 100001;
	public int Num;
	
	
public Car() {
	
	CarNum++;
	Num = CarNum;
}

public static int getCarNum() {
	
	int i = 10;
	return CarNum;
}
public static void setCarNum(int CarNum) {
	
	Car.CarNum = CarNum;
	
	}

}
