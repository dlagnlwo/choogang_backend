package game;

import java.util.Scanner;

/*
 * 클래스명 : Dice
 * 개발자 : 나
 * 작성날짜 : 2023.05.09
 * 프로그램 설명 : 주사위 클래스
 * 멤버변수 : 
 * 멤버함수 :  
 */



public class Dice {
	//필드(멤버변수)
	private String color;
	private int selectedNumber; //돌렸을 때 보이는 면
	private static int count; //전체 객체에서 공유 해야함.
	
	
	//생성자
	Dice(){
		count++; //생성자에서 만들어진 객체의 수를 계산
	}
	static int getCount() {
		return Dice.count;
	}
	
	//현재 다이스 객체를 하나 줄이기
	static void decrease(){
		count--;
	}
	
	//현재 다이스 객체를 하나 늘리기
	static void increase() {
		count++;
	}
	
	//메소드
	// roll() : 주사위가 굴러가서 나오는 난수발생장치
	void roll() {
		selectedNumber = (int)(Math.random() * 6) + 1;
	}
	// choice() : 주사위가 생성한 난수값 확인	
	// 내부 멤버변수 selectedNumber에 저장하면 됨.
	int choice() {
		return selectedNumber;
	}
	//toString()은 오버라이딩 해야함

	// 모든 객체는 로그기능을 가져야 한다.
	// 로그기능에 해당하는 메소드가 toString()
	// toString()에 작성하면 기본기능을 고치겠다는 뜻.
	// @Override라는 어노테이션을 붙이고 시작.
	@Override
	public String toString() {
		String msg =
				"생성된 객체의 수 : " + count + "\n" +
				"주사위의 눈금 : " + selectedNumber; 
		return msg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSelectedNumber() {
		return selectedNumber;
	}

	private void setSelectedNumber(int selectedNumber) {
		this.selectedNumber = selectedNumber;
	}
	
	public void selectColor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("색깔 입력(빨강, 파랑, 주황, 노랑) : ");
		this.color = sc.nextLine();
		setColor(color);
	}
	
	

	

	
	
	
	
	
}	
