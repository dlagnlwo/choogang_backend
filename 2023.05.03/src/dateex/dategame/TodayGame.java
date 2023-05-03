package dateex.dategame;

import java.text.SimpleDateFormat;
import java.util.*;

public class TodayGame {

	public static void main(String[] args) {
		Date date = new Date();
		Random ran = new Random();
		
		int r = Math.abs(ran.nextInt() % 100) + 1;
		
		SimpleDateFormat simple = new SimpleDateFormat(
				"yyyy년 MM월 dd일");
		String time = simple.format(date);
		
		
		System.out.println("현재 날짜 : " + time);
		System.out.println("금전운 : " + r + "%");
		
		if(r >= 90) {
			System.out.println("복권사세요.");
		}
		
		

	}

}
