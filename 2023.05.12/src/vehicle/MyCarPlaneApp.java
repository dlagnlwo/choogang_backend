package vehicle;
// 이 패키지 밑에 있는 모든 클래스형 파일 가져와라
import vehicle.car.*;
import vehicle.plane.*;

public class MyCarPlaneApp {

	public static void main(String[] args) {
		MyCar mycar = new MyCar();
		
		
		//차 시동걸기
		mycar.start();
		//차 달리기
		mycar.run();
		//차 멈추기
		mycar.stop();
		
		//하늘 날기
		MyPlane myplane = new MyPlane();
		
		myplane.start();
		myplane.flight();
		myplane.stop();
	}

}
