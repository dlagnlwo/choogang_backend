package inherit.myinterface;

import static inherit.myinterface.MyIO.*;

public class WearableComputer extends wearableReset implements Wearable{

	@Override
	public void putOn() {
		pl("컴퓨터를 실행했습니다.");
		
	}

	@Override
	public void putOff() {
		pl("컴퓨터를 껐습니다.");
		
	}

	@Override
	public void reset() {
		pl("컴퓨터를 재시작했습니다.");
		
	}
	
	

	
}
