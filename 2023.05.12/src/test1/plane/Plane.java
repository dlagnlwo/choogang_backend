package test1.plane;

import test1.car.*;

public class Plane extends Car{
	//필드
	private String name;
	
	//생성자
	public Plane() {
		this.name = "비행기";
	}
	
	//메소드
	public void fly() {
		System.out.println("비행합니다.");
	}
	
}
