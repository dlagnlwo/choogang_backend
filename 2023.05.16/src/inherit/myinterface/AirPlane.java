package inherit.myinterface;

import static inherit.myinterface.MyIO.*;

public class AirPlane extends Vehicle{

	@Override
	void run() {
		pl("달립니다.");
		
	}
	
	void fly() {
		pl("하늘을 납니다.");
	}
	
	
	

}
