package vehicle.plane;

import vehicle.car.*;

public class MyPlane extends MyCar{
	//필드
	private String name;
	
	//생성자
	public MyPlane() {
		this.name = "나의 비행기";
	}
	

	//메소드
	//날 수 있는 기능만
	public void flight() {
		System.out.println("하늘을 납니다");
	}
}
