package myexception;

import java.util.Scanner;

public class DivideException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		//오류가 날 것 같은 것을 try catch로 감싼다
		//실행 후(try) 에러 감지(catch)
		try {
			int num1 = 1000;
			int num2 = 0;
			
			//static 이기 때문에 divide 메소드에 static을 붙여야 함.
			divide(num1, num2);
		}catch (Exception e){
			System.out.println("오류입니다.");
			//finally는 예외가 나든 안나든 반드시 실행하는 구문
		}finally {
			System.out.println("나는 무조건 실행");
		}
		

	}
	
	//메인이 static 이기 때문에 static을 붙여야 함.
	//내부에서만 쓴다 = private을 붙여라
	//여기는 클래스 내부 이기 때문에 private이 됨 
	private static void divide(int num1, int num2){
		System.out.printf("%d / %d = %d\n",
				num1, num2, (num1 / num2));
	}

}
