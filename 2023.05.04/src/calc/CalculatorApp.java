package calc;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
//		 계산기의 비즈니스로직
//		  1. 계산기의 전원을 킨다.
		calc.powerOn();
//		  2. 계산기의 전원을 끈다.
		calc.powerOff();

		double result = 0.0;
		double x = 0.0, y = 0.0;
//		  3. 덧셈을 계산해본다.
		x = 100.0;
		y = 200.0;
		result = calc.add(x, y);
		print(x, y, "+", result);
//		  4. 뺄샘
		result = calc.sub(x, y);
		
		print(x, y, "-", result);
//		  5. 곱샘
		result = calc.mul(x, y);
		print(x, y, "*", result);
//		  6. 나눗셈
		result = calc.div(x, y);
		print(x, y, "/", result);
//		  7. 배열을 이용한 덧셈 계산
		int[] data = {1, 2, 3};
		int retVal = calc.sum1(data);
		System.out.println("배열을 이용한 덧셈 계산 = " + retVal);

		
		retVal = calc.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("배열을 이용한 덧셈 계산 = " + retVal);
		
//		  8. 작은규모의 배열을 이용한 덧셈계산
		retVal = calc.sum2(1, 2, 3, 4, 5);
		System.out.println("암시 배열을 이용한 덧셈 계산 = " + retVal);
	}
	
	public static void print(
			double x,
			double y, 
			String operator, 
			double result) {
		
		System.out.printf(
				"%.1f %s %.1f = %.1f\n",
				x,
				operator,
				y,
				result);
	}
	

}
