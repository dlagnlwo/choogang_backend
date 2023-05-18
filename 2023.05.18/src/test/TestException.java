package test;

import java.util.*;

public class TestException {

	public static void main(String[] args) {
		
		
		try {
			printResult();
			
		}catch (ArithmeticException e) {
			System.out.println("산술 연산 예외" + e.getMessage());
		}catch (Exception e){
			System.out.println("숫자가 아닌 다른 값을 입력할 때 나오는 에러");
			System.out.println("가장 마지막에 작성하는 Exception"
					+ e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("try문장 끝");
		}
		
		

	}
	public static void printResult() {
		Scanner sc = new Scanner(System.in);
		int n1, n2, result;
		
		System.out.print("첫번째 숫자 입력 : ");
		n1 = Integer.parseInt(sc.next());
		
		System.out.print("두번째 숫자 입력 : ");
		n2 = Integer.parseInt(sc.next());
		
		result = n1 / n2;
		System.out.println("결과 : " + result);
	}

}
