package myexception;

public class DivideExceptionApp3 {

	public static void main(String[] args) throws ArithmeticException {
		
		//배열로 반복문을 돌릴 것 같으면 try catch로 감싸주는 것이 좋음
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			divide(num1, num2); 
		}catch (ArithmeticException a) {
			System.out.println("두번째 숫자는 0이 아닌 수를 입력 : ");
		}catch (Exception e) {
			System.out.println("예외 발생 " + e);
			e.printStackTrace(); //오류를 자세하게 보여줌
		}

	}

	// throws 구문을 사용하여 여기서 이런 예외(자바에서는 에러를 예외로 부름)
	// 예외가 발생할지도 모르니 상위처리부분(함수호출)에서 대비해 주세요라고 미리 공지하는것
	private static void divide(int num1, int num2) throws ArithmeticException{
		int result = num1 / num2;
		System.out.println("나눗셈 결과 : " + result);
	}
}
