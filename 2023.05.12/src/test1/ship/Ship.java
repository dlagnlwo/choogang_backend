package test1.ship;

import test1.car.*;

public class Ship extends Car{
	// 필드
	private String shipName;
	
	//생성자
	public Ship() {
		this.shipName = "배";
	}
	
	//메소드
	public void run() {
		System.out.println("배가 달립니다.");
	}
}
