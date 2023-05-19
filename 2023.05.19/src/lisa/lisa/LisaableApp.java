package lisa.lisa;

public class LisaableApp {

	public static void main(String[] args) {
		
		Lisa lisa = new Lisa();
		System.out.println("리사의 이름은 : " + lisa.getName()
		+ "입니다.👍👍👍");

		//업캐스팅 Lisa()가 Lisaable처럼 행동하는것
		//즉, 자식이 부모처럼 행동하는것
		//부모	  객체변수			//자식
		Lisaable lisaable = new Lisa();
		System.out.println("Lisaable은 " + lisaable.toString());
		//lisaable.toString() Lisa클래스의 toString()을 가져온 것.
		//그러므로 Lisa클래스의 toString()메소드는 반드시 구현해야함.
		
		//Jisu가 Lisa처럼 행동하는 것
		Lisa jisu = new Jisu();
		
		
		//Lisa가 가지고 있는 getName()
		pl("jisu name : " + jisu.getName());
		pl("-------------------------------------");
		pl(jisu);
		
		
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}
	public static void pl(Object obj) {
		//obj.toString()을 불러오는 것.
		System.out.println(obj);
	}

}
