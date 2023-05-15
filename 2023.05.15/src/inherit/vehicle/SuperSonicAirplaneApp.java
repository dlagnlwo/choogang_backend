package inherit.vehicle;

public class SuperSonicAirplaneApp {

	public static void main(String[] args) {
		SuperSonicAirplane su = new SuperSonicAirplane("콩코드");
		su.takeOff();
		su.fly();
		su.flyMode = SuperSonicAirplane.SUPERSONIC;
		su.fly();
		su.flyMode = SuperSonicAirplane.NORMAL;
		su.fly();
		su.land();
	}

}
