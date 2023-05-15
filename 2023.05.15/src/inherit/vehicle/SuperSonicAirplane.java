package inherit.vehicle;

public class SuperSonicAirplane extends Airplane{
	//필드
	public static final int NORMAL = 1; //정적 기호 상수
	public static final int SUPERSONIC = 2; //정적 기호 상수

	public int flyMode;
	//접근제한자가 부모보다 범위가 좁아지면 안됨.
	//반대로 접근제한자가 부모보다 범위가 넓어지면 가능.
	public SuperSonicAirplane(String name) {
		super(name);
		flyMode = NORMAL;
	}
	
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행");
		}else {
			System.out.println("일반비행합니다");
		}
	}
}
