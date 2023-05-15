package gugudan;

import java.util.Scanner;

public class GuGuDanGameApp {

	public static void main(String[] args) {
		GuGuDanGame gu = new GuGuDanGame();
		
		System.out.println(gu.getY());
		
		if(gu.getX() == gu.getY()) {
			System.out.println("정답입니다.");
			System.out.println("현재 값 : " + gu.getX() + gu.getY());
		}else {
			System.out.println("틀렸습니다.");
		}
		
		gu.toString();

	}

}
