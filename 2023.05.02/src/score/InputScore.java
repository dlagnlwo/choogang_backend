package score;

import java.util.*;

public class InputScore {

	public static void main(String[] args) {

		// 키보드로부터 학생이름 수학 점수 입력받아 출력하는 기능
		String[] names;
		int[] mathScores;

		// 학생수를 기호상수로 정의 밑에서학생수가 바뀌더라도 여기서만 고치면 됨
		// 나중에 STUDENT_SIZE = 5;로 고친다면 고칠 것 없음
		int STUDENT_SIZE = 2;
		names = new String[STUDENT_SIZE]; // 1명
		mathScores = new int[STUDENT_SIZE];

		Scanner sc = new Scanner(System.in);
		// STUDENT_SIZE가 2개
		for (int i = 0; i < STUDENT_SIZE; i++) {
			p("학생이름 입력 : ");
			names[i] = sc.next();
			// scanner의 nextLine() '\n'으로 데이터 입력의
			// 끝으로 간주하므로 만약 출력문에 '\n'이 포함되어 있으면
			// 빈줄을 입력한 것으로 간주하는 버그가 있다.
			// 이런경우는 빈칸을 구분기호로 사용하는 next()함수를
			// 사용하는것이 좋다.
			p("점수 입력 : ");
			mathScores[i] = sc.nextInt();
		}

		int count = 0;
		while (count < names.length) {
			pl("학생이름[" + count + "] : " + names[count]);
			pl("학생점수[" + count + "] : " + mathScores[count]);
			pl("-----------------------------");
			count++;
		}
		int sum = 0;
		double avg = 0;
		count = 0;
		// while로 합계 평균 구하기
		while (count < names.length) {
			sum += mathScores[count];
			count++;
		}
		// 향상된 for로 합계 평균 구하기
		sum = 0; // 합계를 0으로 초기화하고 진행한다.
		for (var score : mathScores) {
			sum += score;
		}
		avg = sum / names.length;
		pl("수학시험보는 학생 수 : " + names.length);
		pl("총점 : " + sum + "점");
		p("평균 : " + (int)avg + "점");

	}

	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}

}
