package test.vo;

public class TestVO {
	private int id;
	private String name;
	private int goodscode;
	private int price;
	
	public TestVO(int id, String name, int goodscode, int price){
		this.id = id;
		this.name = name;
		this.goodscode = goodscode;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGoodscode() {
		return goodscode;
	}

	public void setGoodscode(int goodscode) {
		this.goodscode = goodscode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
