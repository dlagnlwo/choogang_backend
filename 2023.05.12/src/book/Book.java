package book;

public class Book {
	//필드
	private String name;
	private String author;
	private int price;
	
	//생성자
	Book(){
		this.name = "자바책";
		this.author = "홍길동";
		this.price = 25000;
	}
	
	//메소드

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		if(this.name.length() > 0) {
			this.name = name;
			return;
		}
		this.name = "이름없음";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if(this.author.length() > 0) {
			this.author = author;
			return;
		}
		this.author = "이름없음";
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(this.price >= 0) {
			this.price = price;
			return;
		}else {
			this.price = 0;
		}
		
	}
	
	public void printBook() {
		System.out.println("책 이름 : " + this.name);
		System.out.println("책 저자 : " + this.author);
		System.out.println("책 가격 : " + this.price);
	}
	
	
	
}
