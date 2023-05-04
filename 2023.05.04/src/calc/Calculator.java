package calc;

public class Calculator {
	
	//메소드
	//void를 붙이면 return값이 없음.
	void powerOn() {
		System.out.println("계산기의 전원을 켰습니다.");
	}
	
	void powerOff() {
		System.out.println("계산기의 전원을 껐습니다.");
	}
	
	double add( double x, double y) {
		return x + y;
	}
	double sub( double x, double y) {
		return x - y;
	}
	double mul( double x, double y) {
		return x * y;
	}
	double div( double x, double y) {
		return x / y;
	}
	public int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//(int ... values) 는 배열
	public int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
