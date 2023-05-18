package myexception;

import java.util.*;

public class DivideExceptionApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//예외처리
		try {
			System.out.print("첫번째 숫자를 입력 : ");
			int num1 = Integer.parseInt(sc.next());
			
			System.out.print("\n첫번째 숫자를 입력 : ");
			int num2 = Integer.parseInt(sc.next());
			
			int result = (num1 / num2);
			
			System.out.println("두수 나누기 : " + result);
		}catch (Exception e) {
			System.out.println("오류입니다.");
			e.toString();
		}
		
		
		
		
		
		
		
		
//		try {
//			Thread.sleep(1000);
//			System.out.println("두수 나누기 : " + result);
//		} catch (Exception e) {
//			System.out.println("오류입니다");
//		}
		

	}

}
