
import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
	public static void main(String[] args) {
		/*
		 * 숫자 추측게임 나와 상대(컴퓨터) 게임 규칙 
		 * 1. 컴퓨터가 임의의 숫자 하나 생각함.
		 * 2. 나에게 문제를 풀어보라는 기회를 줌. 
		 * 키보드로 입력하는 기능 
		 * 3. 입력한 답을 컴퓨터가 생각한 값과 비교 해서 정답 여부 확인 
		 * 생각한 수 > 입력한 수 == 입력한 수가 높습니다.
		 * 생각한 수 < 입력한 수 == 입력한 수가 낮습니다. 생각한 수 == 입력한 수 : 정답
		 */

		// 난수발생방법 : random()
		// Random을 쓰려면 import해야함
		// 컴퓨터가 생각한 수 기억하는 변수 선언
		Random numberGuessGen = new Random();
		//컴퓨터가 생각한 변수 선언
		int answer = numberGuessGen.nextInt(100) + 1;
		//0 ~ 100까지
		//(0 + 1) <= (난수 + 1) < (100 + 1)
		System.out.println(answer);
		int myGeuss;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("숫자를 맞춰보시오");
		while(true) {
			System.out.print("정답 : ");
			int x = sc.nextInt();
			count ++;
			if(x > answer) {
				System.out.println("값이 더 낮습니다.");
			}else if(x < answer) {
				System.out.println("값이 더 높습니다.");
			}else {
				System.out.println("정답입니다.");
				System.out.println("시도 한 횟수 : " + count + "번");
				break;
			}
		}
		

		// 숫자 1~100까지 난수 발생 = (int)(Math.random() * 100));
		// 숫자 1~10까지 난수 발생 = (int)(Math.random() * 10000) % 10);
	}
}
