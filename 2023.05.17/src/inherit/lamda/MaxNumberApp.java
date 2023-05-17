package inherit.lamda;

public class MaxNumberApp {

	public static void main(String[] args) {
		MaxNumberImpl maxNumber = new MaxNumberImpl();
		
		
		// 만일 우리가 인터페이스에 있는 메소드만 호출사용한다면
		// 부모타입으로 업캐스팅을 하면 편리하다.
		// 부모 클래스와 관련없는 멤버들이 감추어 지므로 보안면에서 유리하다
		// 업캐스팅
		// IMaxNumber 는 인터페이스 = 부모
		// MaxNumberImple 은 인터페이스를 상속받은 클래스 = 자식
		// IMaxNumber imaxNumber = new MaxNumberImpl();
		
		
		System.out.print("두 숫자 중 큰수 : ");
		System.out.println(maxNumber.getMaxNumber(4, 3));
		
		
		// 위의 정규방식을 익명형식으로 이용하는 방법으로 고쳐보겠습니다.
		// 상속을 해주는 타입(인터페이스 또는 부모클래스) 변수로 선언하라는 의미
		// 대입연산자 '='를 기준으로 왼쪽 편은 부모타입
		// IMaxNumber imaxNumber
		// 대입연산자 '='를 기준으로 오른쪽 편은 new(객체를 생성하라)
		// 부모타입이 옵니다.
		// 생성자라는 뜻으로 부모타입명 다음에 ()를 붙여주세요.
		// 실행중인 상태에서 선언과 구현을 한자리에서 다 하겠다는 뜻.
		// 익명클래스의 코드길이가 1줄 ~ 20줄 정도인 경우에 많이 사용합니다.
		// 객체를 생성 호출 사용 생략하므로 속도를 올릴 수 있고 
		// 직관적 의미 파악에 도움이 되고
		// 유지보수가 좋은 편입니다.
		// 단점1 : 코드가 너무 복잡하게 보입니다.
		// 단점2 : 경험이 적은 주니어 개발자들에게는 코드 이해에 어려움이 있을 수 있음
		
		
		//즉, 익명클래스를 사용 하는 이유는 딱 한번만 사용하고 재사용 하지 않겠다
		IMaxNumber imaxNumber = new IMaxNumber() {
			
			@Override
			public int getMaxNumber(int x, int y) {
				return (x > y) ? x : y;
			}
		};//세미콜론 붙여야함
		System.out.println("max number = " + imaxNumber.getMaxNumber(100,200));;
		
		System.out.println();
		
		//한번만 사용하는 추상클래스에서 만들어진 추상메소드
		//익명함수 업캐스팅
		AbstractMaxNumber amaxNumber = new AbstractMaxNumber() {
			
			@Override
			public int getMaxNumber(int x, int y) {
				return (x > y) ? x : y;
			}
			
			@Override
			public void p(String msg) {
				System.out.print(msg);
			}
			
			@Override
			public void pl(String msg) {
				System.out.println(msg);
			}
		};
		
		amaxNumber.pl("max value " + amaxNumber.getMaxNumber(4, 6));
		//(x, y) -> : 이 뜻은 int x, int y를 사용하겠다는 뜻
		IMaxNumber ramdaMaxNumber = (x, y) ->(x > y) ? x : y;
				
		
		System.out.println("람다함수로 구현");
		System.out.println("max number : " + 
							ramdaMaxNumber.getMaxNumber(100, 200));
		
	}

}
