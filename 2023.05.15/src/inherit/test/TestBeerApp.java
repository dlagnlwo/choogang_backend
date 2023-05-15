package inherit.test;

public class TestBeerApp {

	public static void main(String[] args) {
		Hoegaarden ho = new Hoegaarden("호가든", "레몬", 3);
		
		System.out.println("타입 : " + ho.getType());
		System.out.println("알콜 도수 : " + ho.getAbv());
		
		System.out.println("맛 : " + ho.getFlavor());
		
		ho.flavordrink();

	}

}
