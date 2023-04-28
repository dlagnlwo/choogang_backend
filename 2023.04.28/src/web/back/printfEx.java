package web.back;

import java.util.*;

public class printfEx {

	public static void main(String[] args) {
		int i = 100;
//		System.out.printf("변수 i = %d", i);
//		System.out.printf("%d + %d = %d", i, i, (i*i));
//		System.out.println();
		
//		String str1 = "가나다";
//		String str2 = "abc";
//		
//		System.out.printf("문자열 : %s", str1);
//		System.out.println();
//		System.out.printf("문자열 : %s", str2.toUpperCase());
//		System.out.println();
//		
//		double d = 123.1513125;
//		double d1 = 1.23;
//		double d2 = 33.123;
//		double d3 = 3.5;
//		double d4 = 123;
//		
//		System.out.printf("dobule = %.3f\n", d);//소수점이하 3자리까지
//		System.out.printf("%10.3f\n", d1); //10자리 중에 소수점 이하 3자리
//		System.out.printf("%10.3f\n", d2);
//		System.out.printf("%10.3f\n", d3);
//		System.out.printf("%10.3f\n", d4);
//		
//		//10자리 중 빈자리를 0으로 채움
//		System.out.printf("%010.3f\n", d4);
//		//10자리 중 소수점 이하 3자리를 0으로 채
//		System.out.printf("%-10.3f\n", d4);
		
		// Calendar 라이브러리 사용
		// 달력기능모음
		Calendar cal = Calendar.getInstance();
		System.out.printf("올해는 %tY년 입니다.\n", cal);
		System.out.printf("올해는 %ty년 입니다.\n", new Date());
		System.out.printf("%tY년 %tm월 %td일 %ta요일 %th시 %tM분 %tS초",
				2023,4,28,"금",17,50,20);

	}

}
