package inherit.mytest;

import static inherit.mytest.MyIO.*;

public class MyCar extends MyVehicle{

	@Override
	void run() {
		pl("달립니다.");
		
	}

	@Override
	public void speedUp(int speedValue) {
		pl("스피드가 " + speedValue + " 증가했습니다.");
		
	}

	@Override
	public void speedDown(int speedValue) {
		pl("스피드가 " + speedValue + " 감소했습니다.");
		
	}

	@Override
	public void stop() {
		pl("멈췄습니다.");
		
	}

	
	
}
