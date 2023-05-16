package inherit.myinterface;

public class Ccalc implements ICalc{

	//필드
	
	//생성자
	
	//메소드
	@Override
	public double add(double x, double y) {
		double result = x + y;
		return result;
	}
	@Override
	public double sub(double x, double y) {
		double result = x - y;
		return result;
	}
	@Override
	public double mul(double x, double y) {
		double result = x * y;
		return result;
	}
	@Override
	public double div(double x, double y) {
		double result = x / y;
		return result;
	}
	
	public void p(String msg) {
		System.out.print(msg);
	}
	
	public void pl(String msg) {
		System.out.println(msg);
	}
	
}
