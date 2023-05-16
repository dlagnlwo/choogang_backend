package inherit.myinterface;

import static inherit.myinterface.MyIO.*;

public class CarAirPlaneShipApp {

	public static void main(String[] args) {
		Car car = new Car();
		car.powerOn();
		car.run();
		car.powerOff();
		
		AirPlane airplane = new AirPlane();
		airplane.powerOn();
		airplane.fly();
		airplane.powerOff();

	}

}
