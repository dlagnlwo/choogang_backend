package inherit.lamda;

public class MaxNumberLamdaApp {
	public static void main(String[] args) {
		
		//인터페이스를 객체로 만들기
		//익명암수를 이용하여 메인 클래스에서 구현
		IMaxNumber maxNumber = new IMaxNumber() {
			
			@Override
			public int getMaxNumber(int x, int y) {
				return (x > y) ? x : y;
			}
		};
		
		System.out.println(maxNumber.getMaxNumber(3, 1));
		
		IMaxNumber maxNumber2 = 
				(x, y) -> (x > y) ? x : y;
				
		System.out.println(maxNumber2.getMaxNumber(100, 200));
	}
}
