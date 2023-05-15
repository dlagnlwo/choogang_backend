package inherit.abstractclass;

//abstract = 추상클래스(객체로 인스턴스를 만들 수 없다는 뜻.)
//즉, 메모리에 방을 만들 수 없다.
public abstract class AbstractCalc { 
	//필드
	
	
	//메소드
	
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	int sub(int x, int y) {
		int result = x - y;
		return result;
	}
	int mul(int x, int y) {
		int result = x * y;
		return result;
	}
	int div(int x, int y) {
		int result = x / y;
		return result;
	}
	
	//매개변수로 넘어온 계산기와 지금 계산기와 같은가?
	boolean CheckCalcSame(AbstractCalc calcTemp) {
		return (this == calcTemp);
	}
}
