package myexception;

public class InvalidInputExceptionApp {

	public static void main(String[] args) {
		try {
		//자바시험 점수입력
		int javaScore = Integer.parseInt(args[0]);
		
		if(javaScore < 0) {
			//잘못 된 인수가 넘어왔다 = IllegalArgumentException(); 
			throw new IllegalArgumentException();
		}
		
		System.out.println("입력한 자바 점수 : " + javaScore);
		}catch (IllegalArgumentException e) {
			System.out.println("잘못된 숫자입니다.");
			e.printStackTrace();
		}

	}

}
