package dateex.dategame;

import java.util.Calendar;

public class Today {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		
	
		System.out.println(year + "년 " + month + "월 " + 
		day + "일");

	}

}
