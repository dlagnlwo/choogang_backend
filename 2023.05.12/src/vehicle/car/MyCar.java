package vehicle.car;

public class MyCar {
	//필드
	private String name;
	
	//생성자
	public MyCar(){
		this.name = "자동차";
	}
	
	//메소드
	
	public void start() {
		System.out.println("시동을 켭니다");
	}
	public void stop() {
		System.out.println("시등을 끕니다");
	}
	public void run() {
		System.out.println("달립니다");
	}
	
	
}
