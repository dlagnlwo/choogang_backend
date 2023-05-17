package inherit.lamda;

public class CalculatorApp {

	public static void main(String[] args) {
		//Calculator는 인터페이스임
		//인터페이스를 객체화 한거
		//클래스가 아님
		
		Calculator cal = new Calculator() {
			
			@Override
			public int cal(int x, int y) {
				int result = x + y;
				return result;
			}
		};
		System.out.println(cal.cal(100, 200));
		
		
		//람다함수
		Calculator cal2 = 
				(x, y) -> x + y;
		System.out.println(cal2.cal(100, 200));

	}

}
