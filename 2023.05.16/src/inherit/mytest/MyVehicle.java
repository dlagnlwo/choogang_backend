package inherit.mytest;

import static inherit.myinterface.MyIO.*;

public abstract class MyVehicle implements ISpeed{
	
	public void powerOn(){
		pl("전원을 킨다.");
	}
	
	public void powerOff() {
		pl("전원을 끈다.");
	}
	
	abstract void run();
}
