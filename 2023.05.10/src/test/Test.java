package test;

import java.util.Random;

public class Test {
	//필드
	
	private int selectedNum;
	private static int count;
	
	//생성자
	Test(){
		count++;
	}
	
	//메소드
	
	//난수 발생
	void rand() {
		Random ran = new Random();
		this.selectedNum = Math.abs(ran.nextInt(6) + 1);
	}
	int choice() {
		return this.selectedNum;
	}
	@Override
	public String toString() {
		String msg = "난수 : " + selectedNum; 
		return msg;
	}
	
	public static void printTest() {
		
		Test test = new Test();
		int[] result = new int[4];
		for(int i = 0; i < result.length; i++) {
			test.rand();
			result[i] = test.choice();
			System.out.println(test.toString());
		}
		
		
		
	}
	

	
	
	
	
}
