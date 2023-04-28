package web.back;

import java.util.*;

public class my_DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		String h, com;
		int hCount = 0;
		int comCount = 0;

		while (true) {
			System.out.println("주사위를 굴리세요");
			System.out.print("사람이 숫자 입력 : ");
			h = sc.nextLine();

			if (h.equals("")) {
				int ranNum = ran.nextInt(6) + 1;
				hCount = ranNum;
				System.out.println("사람의 숫자는 : " + hCount);
			}

			System.out.println("주사위 굴립니다. 엔터 입력");
			com = sc.nextLine();

			if (com.equals("")) {
				int ranNum = ran.nextInt(6) + 1;
				comCount = ranNum;
				System.out.println("컴퓨터의 숫자는 : " + comCount);
			}
			if (hCount > comCount) {
				System.out.println("사람이 이겼습니다.");
			} else if (hCount < comCount) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else if (hCount == comCount) {
				System.out.println("비겼습니다.");
			}

		}

	}
}
