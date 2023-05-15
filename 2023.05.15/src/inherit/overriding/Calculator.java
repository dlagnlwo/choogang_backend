package inherit.overriding;

//부모
public class Calculator {
	//필드
	final double PI = 3.14; //고쳐야 할 때 여기만 고쳐주면 됨.
	
	//생성자
	
	//메소드
	double areaCircle(double r) {
		//로그기록
		System.out.println("Calculator 객체의 areaCircle()실행");
		double result = PI * r * r; 
		return result;
	}
	
	double circumferenceCircle(double r) {
		double result = PI * r * 2; 
		return result;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
