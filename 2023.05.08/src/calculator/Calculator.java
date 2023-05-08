package calculator;

/* 
 * 정수 x,y를 멤버로 가진다
 * 정수형 메소드 add(x,y), sub(x,y), mul(x,y), div(x,y) 
 * 멤버 변수 생성자(x,y) 멤버 x에 x대입, 멤버 y에 y대입
 * Calc()함수를 이용하여 사칙연산 결과값을 배열로 리턴
 * 배열의 순서 0:덧셈 결과 1: 뺄셈결과 2: 곱셈결과 3: 나눗셈결과
 */

public class Calculator {
	//필드
	
	private int x, y;
	private int[] retCalc;
	private char[] sign;
	
	//생성자
	Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public char[] getSign() {
		return this.sign = new char[] {'+','-','*','/'};
	}



	public void setSign(char[] sign) {
		this.sign = sign;
	}




	public int[] getRetCalc() {
		return this.retCalc = new int[] {x + y, x - y, x * y, x / y};
	}



	public void setRetCalc(int[] retCalc) {
		this.retCalc = retCalc;
	}



	int[] calculate() {
		return this.retCalc;
	}
	


	int add() {
		return x + y;
	}
	int sub() {
		return x - y;
	}
	int mul() {
		return x * y;
	}
	int div() {
		return x / y;
	}
	
	@Override
	public String toString() {
		String result = 
				"x + y = " + this.add() +
				"\nx - y = " + this.sub() +
				"\nx * y = " + this.mul() +
				"\nx / y = " + this.div();
				
		return result;
	}
	
	
	
	
	
	
}
