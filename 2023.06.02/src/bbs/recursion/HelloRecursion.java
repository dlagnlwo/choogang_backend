package bbs.recursion;

public class HelloRecursion {
	public static void main(String[] args) {
		function(5);	
		sum();
	}


	public static void function(int exitNum) {
		if(exitNum == 0) {
			return;
		}else {
			System.out.printf(
					"안녕하세요 이제는 (%d == 0)면 마칠수 있음.\n",
					exitNum);
			function(exitNum - 1);
			sum();
			return;
		}
	}
	
	public static int sum() {
		int total = 0;
		for(int i = 0; i < 101; i++) {
			total += i;
			
		}
		
		System.out.println("1~100까지 합 : " + total);
		return total;
	}
}