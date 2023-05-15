package inherit.abstractclass;

public class AbstractCalcApp {

	public static void main(String[] args) {
		// 직원1이 사용하는 계산기
		DataCalc data1 = new DataCalc();
		
		
		int x = 1000;
		int y = 500;
		int result;
		result = data1.add(x, y);
		p(x + " + " + y + " = " + result + "\n");
		if(data1.CheckCalcSame(data1)) {
			pl("같은 객체입니다.");
		}else {
			pl("다른 객체입니다.");
		}
		
	
		
		// 직원2가 사용하는 계산기
		DataCalc data2 = new DataCalc();
		
		x = 2000;
		y = 1000;
		result = data2.add(x, y);
		p(x + " + " + y + " = " + result + "\n");
		
		if(data2.CheckCalcSame(data2)) {
			pl("같은 객체입니다.");
		}else {
			pl("다른 객체입니다.");
		}
		
		
		// 직원3이 사용하는 계산기
		// 업캐스팅 : 자식클래스를 부모클래스로 승격하는 기능
//		         : 자식클래스가 부모클래스처럼 동작합니다.
//				 : 부모클래스가 가진 기능만 사용할 수 있습니다.
		DataCalc data3 = new DataCalc();
		
		
	}
	
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}

}
