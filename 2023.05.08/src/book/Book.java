package book;

public class Book {
	//필드
	//맴버변수에는 직접 접근하면 안됨.
	
	//static = 값이 고정되어 있을 것 같으면 static
	//title 제목으로 바뀌지 않음. 회사이름도 바뀌지 않음. 저자도 바뀌지 않음.
	
	//맴버변수를 private를 넣고 속성함수(getter, setter)를 이용해서
	//외부로 접근하게 해야됨.
	
	//private로 정했기 때문에 다른 클래스(외부)에 넘기지 못함.
	private String title, author;
	private int price;
	
	// 생성자
	// 명시적으로 객체를 생성하고 비어있음이란 뜻으로 해석
	// b2의 생성자
	Book(){
		this.title = ""; //제목 없음
		this.author = ""; //저자 없음
		this.price = 0; //가격 없음
	}


	//b1의 생성자
	public Book(String title, String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}


	//외부에서 접근하게 하려면 getter, setter
	// 메소드
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		String retVal = "" + 
		"b1의 제목 : " + this.getTitle() +
		"\nb1의 저자 : " + this.getAuthor() +
		"\nb1의 가격 : " + this.getPrice() +
		"\n";
		
		return retVal;
	}
	
	
	
	


	
}
