package inherit.myinterface;

public interface ICalc {
	//인터페이스는 실제 메소드를 정의하고 구현하는 것이 아니라
	//메소드의 헤더부분만 선언하여 이 메소드를
	//실제 정의하는 클래스에서 메소드 본체를 완성한다.
	//이렇게 하는 이유는 호환성을 보장하고 이 메소드는 반드시
	//구현하여야 한다는 것을 프로그램차원에서 보증한다.
	//그래서 보통 인터페이스를 작업지시서 또는 주문확인서라고 이해하면 된다.
	double add(double x, double y);
	double sub(double x, double y);
	double mul(double x, double y);
	double div(double x, double y);
	
}
