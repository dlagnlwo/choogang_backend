package car;

public class CarApp {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); //gas값을 5로 초기화
		
		//가스가 있으면 true 없으면 false
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("차를 출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) { //가스가 있는경우
			System.out.println("gas를 주입할 필요 x");
		}else { //가스가 없는경우
			System.out.println("gas를 주입해주세요");
		}

	}

}
