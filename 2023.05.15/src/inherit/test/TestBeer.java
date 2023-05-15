package inherit.test;

public class TestBeer {
	//필드
	public String type; //맥주종류
	public String model; //맥주모델
	
	//생성자
	TestBeer(String type, String model){
		this.type = type;
		this.model = model;
	}
	
	//메소드
	
	//마시기
	public void drink() {
		System.out.println("마십니다.");
	}
	
	//섞기
	public void mix() {
		System.out.println("섞습니다.");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
