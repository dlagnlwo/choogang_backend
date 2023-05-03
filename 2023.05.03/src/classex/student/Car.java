package classex.student;

import java.awt.Color;

public class Car {
	
	//필드
	private int num;
	String company = "기아";
	String model = "k5";
	String color = "white";
	int maxSpeed = 350;
	int speed = 50;
	
	//생성자
	Car(){
		// car("현대", "blue", 60)과 같다
		this.model = "현대";
		this.color = "blue";
		this.maxSpeed = 60;
	}
	
	Car(String model) {
		// car(model, "green", 100)과 같다
		this.model = model;
		this.color = "green"; //기본값으로 green할당
		this.maxSpeed = 100; //기본값으로 100할당
	}
	
	Car (String model, String color) {
		// car(model, color, 150)과 같다
		this.model = model;
		this.color = color;
		this.maxSpeed = 150; //기본값으로 150으로 설정
		
	}
	
	//사용자 정의 생성자
	Car(String model, String color, int maxSpeed) {
		this.model = model; //외부에서 입력
		this.color = color; //외부에서 입력
		this.maxSpeed = maxSpeed; //외부에서 입력0
	}
	
	Car(int speed, String company, String color, String model) {
		this.speed = speed;
		this.company = company;
		this.color = color;
		this.model = model;
	}
	
	//사용자 정의 생성자 매개변수 4개
	//model, 색상, 최고속도, 현재속도
	Car(String model, String color, int maxSpeed, int speed){
		this.model = model;
		this.color = color;
		//최고속도가 300km보다 크면
		//300km로 제한(초기화)
		if(maxSpeed > 300) {
			this.maxSpeed = 300;
		}else if(maxSpeed < 0){
			this.maxSpeed = 300;
		}else {
			this.maxSpeed = maxSpeed;
		}
		//현재속도가 음수면 역주행이므르
		//조건문으로 0으로 설정
		if(speed < 0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
		
	}
	

	
	//메소드
	public void printCar() {
		p("company = " + company);
		p("model = " + model);
		p("color = " + color);
		p("maxspeed = " + maxSpeed);
		p("num = " + num);
	}
	
	public static void p(String msg) {
		System.out.println(msg);
	}
}

