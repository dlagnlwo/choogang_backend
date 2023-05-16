package inherit.mytest;

public class MyCarAirPlaneShipApp {

	public static void main(String[] args) {
		MyCar car = new MyCar();
		
		car.powerOn();
		car.speedUp(100);
		car.run();
		car.speedDown(0);
		car.powerOff();
		car.stop();

	}

}
