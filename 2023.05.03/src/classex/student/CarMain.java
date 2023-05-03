package classex.student;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 객체 생성
		Car car = new Car();
//		car.printCar(); 
		Korea k = new Korea();
//		k.printKorea(); 

		// 필드값 읽기
		p("제작회사 : " + car.company);
		p("모델명 : " + car.model);
		p("색상 : " + car.color);
		p("최고속도 : " + car.maxSpeed + "km");
		p("현재속도 : " + car.speed + "km");

		// 필드값 변경
		car.speed = 60;
		p("변화된 현재속도 : " + car.speed + "km");

		///////////////////////////////////////////
		p("--------------------redCar--------------------");
		// 객체 생성
		Car redCar = new Car();
//				car.printCar(); 
		redCar.color = "RED";
		redCar.model = "Golf";
		redCar.company = "benz";

		// 필드값 읽기
		p("제작회사 : " + redCar.company);
		p("모델명 : " + redCar.model);
		p("색상 : " + redCar.color);
		p("최고속도 : " + redCar.maxSpeed + "km");
		p("현재속도 : " + redCar.speed + "km");

		// 필드값 변경
		redCar.speed = 100;
		p("변화된 현재속도 : " + redCar.speed + "km");

		p("--------------------carTruck----------------------");
		// 생성자 호출로 객체 만들기
		Car carTruck = new Car("봉고", "베이지색", -200, -100);
		p("모델명 : " + carTruck.model);
		p("색상 : " + carTruck.color);
		p("최고속도 : " + carTruck.maxSpeed + "km");
		p("현재속도 : " + carTruck.speed + "km");

		p("------------------carCompany------------------------");
		//()안에 순서가 바뀌면 값의 순서도 바뀜.
		Car carCom = new Car(60, "기아", "노란색", "k5");
		p("색상 : " + carCom.color);
		p("회사 : " + carCom.company);
		p("모델 : " + carCom.model);
		p("현재속도 : " + carCom.speed + "km");
		p("최고속도 : " + carCom.maxSpeed + "km");

		
	}

	public static void p(String msg) {
		System.out.println(msg);
	}
}
