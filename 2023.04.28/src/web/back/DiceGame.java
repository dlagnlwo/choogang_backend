package web.back;

import java.util.*;

public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println((int)(Math.random() * 100));
		/*
		 * 1. 필요한 것 : 컴퓨터, 나 2. 컴퓨터가 생각한 수 내가 생각한 수 비교 가장큰 수가 나온 사람(컴퓨터)가 이김 3. 임의의 수 :
		 * 난수(간단한 Math클래스 난수를 이용) 4. 주사위를 던지는 루틴 두 주사위를 비교해서 큰값을 판정하는 판정 루틴 승자를 출력하는 출력
		 * 루틴 경기할 배우들
		 */
		// Model = 데이터
		int com, na;
		int endCount = 10;
		String gamePlay;
		Random ran = new Random(); // 난수발생
		// Math.random(); 이용한 방법
//		com = (int)(Math.random() * 6) + 1;
//		na = (int)(Math.random() * 6) + 1;
		// ran.nextInt(); 이용한 방법
		
		String gameMsg = "";

		// controller = 경기 판정
		while (true) {
			com = ran.nextInt(6) + 1;
			na = ran.nextInt(6) + 1;
			if (com == na) {
//			gameMsg = "컴퓨터 점수 : " + com + "내 점수" + na;
				System.out.println("컴퓨터의 숫자 : " + com);
				System.out.println("나의 숫자 : " + na);
				System.out.println("비겼습니다.");
			} else if (com > na) {
				System.out.println("컴퓨터의 숫자 : " + com);
				System.out.println("나의 숫자 : " + na);
				System.out.println("컴퓨터가 이겼습니다.");
			} else if (com < na) {
				System.out.println("컴퓨터의 숫자 : " + com);
				System.out.println("나의 숫자 : " + na);
				System.out.println("내가 이겼습니다.");
			}
			System.out.print("다시 시작하시겠습니까? y/n ");
			gamePlay = sc.nextLine();
			if(gamePlay.equals("y") || gamePlay.equals("Y")) {
				continue;
			}else if(gamePlay.equals("n") || gamePlay.equals("N")) {
				break;
			}
			endCount--;
			if(endCount == 0) {
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
		

	}
}
