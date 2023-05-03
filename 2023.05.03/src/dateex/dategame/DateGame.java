package dateex.dategame;

import java.text.SimpleDateFormat;
import java.util.*;
import classex.student.util.model.MyIO;

public class DateGame {

	public static void main(String[] args) {

		Random ran = new Random();
		//절대값에 101까지를 int r에 담음
		int r = Math.abs(ran.nextInt() % 100) + 1;
		
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat(
				"yyyy년 MM월 dd일 E요일");
		
		String time = simple.format(date);

		System.out.println("오늘의 날짜 : " + time);
		System.out.println("당첨될 확률 : " + r + "%");
		if (r >= 90) {
			System.out.println("복권사세요");
		}
		
		//Calendar 형식 지정자
		//YEAR : 년도 예) 2100
		//MONTH : 월 예) 07
		//DATE : 한달 중에 며칠 예) 11
		//HOUR : 시간(1-12)
		
		System.out.println("--------------------------------");
		Calendar cal = Calendar.getInstance();

		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		
		

	}
}
