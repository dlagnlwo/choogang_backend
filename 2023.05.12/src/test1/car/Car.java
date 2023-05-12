package test1.car;

public class Car {
	//필드
	
	private String name;
	
	//생성자
	public Car(){
		this.name = "자동차";
	}
	
	//메소드
	//자동차 시동켜기달리기끄기 기능
	
	public void powerOn() {
		System.out.println("시동을 켭니다.");
	}
	
	public void run() {
		System.out.println("달리는 중입니다.");
	}
	
	public void powerOff() {
		System.out.println("시동을 끕니다.");
	}
}
