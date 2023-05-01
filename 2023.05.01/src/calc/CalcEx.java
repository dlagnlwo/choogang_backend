package calc;

public class CalcEx {
	public static void main(String[] args) {
		Calc a = new Calc();
		int add1 = a.add(200,100);
		int sub1 = a.sub(200,100);
		int mul1 = a.mul(200,100);
		int div1 = a.div(200,100);
		System.out.println(add1);
		System.out.println(sub1);
		System.out.println(mul1);	
		System.out.println(div1);
	}
}
class Calc {
	public static int add(int x, int y) {
		return x + y;
	}
	public static int sub(int x, int y) {
		return x - y;
	}
	public static int mul(int x, int y) {
		return x * y;
	}
	public static int div(int x, int y) {
		return x / y;
	}
}