package inherit.overriding;

public class ComputerApp {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원면적 : " + cal.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("원면적 : " + com.areaCircle(r));

	}

}
