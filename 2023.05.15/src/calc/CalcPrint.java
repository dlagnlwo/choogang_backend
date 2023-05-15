package calc;

public class CalcPrint extends CalcMulDiv{
	
	void print(int x, int y, char operator) {
		switch(operator) {
		case '+':
			System.out.printf("%d %c %d = %d\n", x, operator, y, add(x,y));
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n", x, operator, y, sub(x,y));
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n", x, operator, y, mul(x,y));
			break;
		case '/':
			System.out.printf("%d %c %d = %d", x, operator, y, div(x,y));
			break;
		default :
			System.out.println("끝");
		}
		
	}
}
