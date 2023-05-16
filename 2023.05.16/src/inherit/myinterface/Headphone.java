package inherit.myinterface;

import static inherit.myinterface.MyIO.*;

public class Headphone implements Wearable{

	//필드
	private int volume;
	
	//생성자
	public Headphone() {
		this.volume = 0;
	}
	//메소드
	
	@Override
	public void putOn() {
		pl("헤드폰을 착용했습니다.");
	}

	@Override
	public void putOff() {
		pl("헤드폰을 벗었습니다.");
		
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
		pl("볼륨을 " + volume + "로 변경");
	}
	
	
}
