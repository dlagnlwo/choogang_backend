package game;

import java.util.Random;

public class aa {

	public static void main(String[] args) {
		// 5명 학생 국어점수 영어점수 확인해 등급 부여
		// 국어점수 및 영어점수 합계 평균구하기

		Random ran = new Random();
		String grade;
		int max = 5;
		String[] name = { "홍길동", "홍길순", "김철수", "이순신", "임꺽정" };
		String[] score5 = {"국어","영어","수학","과학","역사"};
		int korTotal = 0;
		double korAvg = 0;
		double engAvg = 0;
		int engTotal = 0;
		int kor[] = new int[max];
		int eng[] = new int[max];

		for (int i = 0; i < max; i++) {
			kor[i] = ran.nextInt(101);
			korTotal += kor[i];
			korAvg = korTotal / max;
			if (kor[i] >= 90) {
				grade = "A";
			} else if (kor[i] >= 80) {
				grade = "B";
			} else if (kor[i] >= 70) {
				grade = "C";
			} else if (kor[i] >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println("학생: " + name[0] + "\t" + 
					score5[i] + ": " + kor[i] + "\t" +
					"\t" + 
					score5[i] + "평균: " + korAvg + "\t" +
					score5[i] + "등급: " + grade);
			System.out.println("-------------------------------------------------");
		}

	}

}
