package game;

import java.util.Random;

public class score {

	public static void main(String[] args) {
		int maxSize = 5; // 학생 최대수
		int[] kor = new int[maxSize];
		int[] eng = new int[maxSize];
		int korTotal = 0;
		int engTotal = 0;
		int korAvg = 0;
		int engAvg = 0;

		// 학생의 각 과목 입력
		Random ran = new Random();
		for (int i = 0; i < maxSize; i++) {
			kor[i] = ran.nextInt(101);
			korTotal += kor[i];
			korAvg = korTotal / maxSize;
		}
		for (int i = 0; i < maxSize; i++) {
			eng[i] = ran.nextInt(101);
			engTotal += eng[i];
			engAvg = engTotal / maxSize;
		}

		p("국어 총점수 : " + korTotal);
		p("국어 평균 : " + korAvg);
		p("--------------------------");
		p("영어 총점수 : " + engTotal);
		p("영어 평균 : " + engAvg);
	}

	public static void p(String msg) {
		System.out.println(msg);
	}
	public static String checkGrade(int score) {
		String grade = "f";
		
		if (score >= 90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "C";
		}else if (score >= 60) {
			grade = "D";
		}
		return grade;
	}

}
