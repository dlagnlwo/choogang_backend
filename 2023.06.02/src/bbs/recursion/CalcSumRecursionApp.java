package bbs.recursion;

public class CalcSumRecursionApp {
	public static void main(String[] args) {
		sum(100);
	}
	
	public static int sum(int exitNum) {
		if(exitNum == 1) {
			return 1;
		}else {
			int total = 0;
			for(int i = 0; i < 101; i++) {
				total += i;
			}
			System.out.println("1~100까지의 합 : " + total);
			sum(exitNum - 1);
			return total;
		}
	}
}
