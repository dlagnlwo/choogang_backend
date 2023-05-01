package game;

import java.util.*;

public class RockPaperScussorsGame {
	public static void main(String[] args) {
		String[] rockPaperScissor = {"바위", "가위", "보"};
		Scanner sc = new Scanner(System.in);
		
		String com;
		
		
//		System.out.println("사람이 입력해주세요 : ");
//		String na = sc.nextLine();
		
		// 관련있는 데이터인 경우
		for (String item : rockPaperScissor) {
			p(item);
		}
		//실제 변수의 타입을 실행시 데이터를 보고 자동 판단
		for (var item : rockPaperScissor) {
			p(item);
		}
		
		
		
		
	}
	public static void p(String msg) {
		System.out.println(msg);
	}

}
