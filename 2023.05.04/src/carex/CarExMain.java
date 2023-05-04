package carex;

public class CarExMain {

	public static void main(String[] args) {
		CarEx car = new CarEx();
		
		car.setGas(5);
		
		boolean gasState = car.isGas();
		if(gasState) { //gasState가 true면
			System.out.println("차가 움직입니다.");
			car.run();
		}
		
		if(car.isGas()) {
			System.out.println("가스 주입 x");
		}else {
			System.out.println("가스를 주입해주세요.");
		}

	}

}
