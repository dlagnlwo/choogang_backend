package inherit.myinterface;

import static inherit.myinterface.MyIO.*;

public abstract class Vehicle { //불완전한 클래스
	void powerOn(){
		pl("전원을 킨다.");
	}
	
	void powerOff() {
		pl("전원을 끈다.");
	}
	
	abstract void run();
}
