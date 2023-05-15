package inherit.vehicle;

public class Airplane {
	//필드(멤버변수)
	
	String name;
	
	//생성자
	Airplane(String name){
		this.name = name;
	}
	
	//메소드
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly(){
		System.out.println("비행합니다.");
	}
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
