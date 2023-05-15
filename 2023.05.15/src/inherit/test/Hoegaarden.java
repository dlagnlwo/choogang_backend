package inherit.test;

public class Hoegaarden extends TestBeer{
	//필드
	public String flavor;
	int abv = 6;
	
	//생성자
	public Hoegaarden(String model, String flavor) {
		super("밀맥주", model);
		this.model = model;
		this.flavor = flavor;
	}
	
	//생성자 오버로딩
	public Hoegaarden(String model, String flavor, int abv) {
		super("밀맥주", model);
		this.model = model;
		this.flavor = flavor;
		this.abv = abv;
	}
	
	//메소드
	
	
	public void flavordrink() {
		System.out.println(this.model + "맥주의" + flavor
				+ "맛을 마십니다.");
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getAbv() {
		return abv;
	}

	public void setAbv(int abv) {
		this.abv = abv;
	}
	
}
