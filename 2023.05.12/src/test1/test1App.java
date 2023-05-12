package test1;

import test1.car.*;
import test1.plane.*;
import test1.ship.*;
public class test1App {

	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("------자동차------");
		car.powerOn();
		car.run();
		car.powerOff();
		
		
		System.out.println("------비행기------");
		Plane plane = new Plane();
		plane.powerOn();
		plane.fly();
		plane.powerOff();
		
		System.out.println("------배------");
		Ship ship = new Ship();
		ship.powerOn();
		ship.run();
		ship.powerOff();

	}

}
