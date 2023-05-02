package game;

import java.text.SimpleDateFormat;
import java.util.*;
public class DateGame {

	public static void main(String[] args) {
		
		Date date = new Date(); 
		SimpleDateFormat simple = new SimpleDateFormat(
				"yyyy년 MM월 dd일 hh시 mm분 ss초");
//		System.out.println(simple.format(date));
		
		Random ran = new Random();
		int r = ran.nextInt(101);
		
		System.out.println("현재 : " + simple.format(date) + 
				"\t" + "금전운 : " + r + "%");
		if (r >= 90) {
			System.out.println("복권 사세요");
		}
	}

}
