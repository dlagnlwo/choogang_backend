package Ex;

import java.util.*;
public class Ex {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String[] choice = {"가위", "바위", "보"};
		int choiceSize = choice.length;
		int winCount = 0;
		int loseCount = 0;
		int tieCount = 0;
		
		int comrand = rand.nextInt(3);
		pl("가위(0), 바위(1), 보(2)");
		p("사용자 입력 : ");
		String user = sc.next();
		
		if(user.equals(0)) {
			if(user.equals(0) || user.equals("가위")) {
				System.out.println("비겼습니다.");
				tieCount++;
			}else if(user.equals(1) || user.equals("바위")) {
				System.out.println("사용자가 이겼습니다.");
				winCount++;
			}else if(user.equals(2) || user.equals("보")) {
				System.out.println("사용자가 졌습니다.");
				loseCount++;
			}
		}else if(comrand == 1) {
			if(user.equals(0) || user.equals("가위")) {
				System.out.println("사용자가 졌습니다..");
				loseCount++;
			}else if(user.equals(1) || user.equals("바위")) {
				System.out.println("비겼습니다.");			
				tieCount++;
			}else if(user.equals(2) || user.equals("보")) {
				System.out.println("사용자가 이겼습니다.");
				winCount++;
			}
		}else if(comrand == 2) {
			if(user.equals(0) || user.equals("가위")) {
				System.out.println("사용자가 이겼습니다.");
				winCount++;
			}else if(user.equals(1) || user.equals("바위")) {
				System.out.println("사용자가 졌습니다.");			
				loseCount++;
			}else if(user.equals(2) || user.equals("보")) {
				System.out.println("비겼습니다.");
				tieCount++;
			}
		}
		
		
		
		
	}
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}

}
