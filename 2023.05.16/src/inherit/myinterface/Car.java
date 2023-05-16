package inherit.myinterface;

import static inherit.myinterface.MyIO.*;

public class Car extends Vehicle{

	@Override //반드시 구현해야한다는 어노테이션
	void run() {
		pl("달립니다");
	}
	
}
