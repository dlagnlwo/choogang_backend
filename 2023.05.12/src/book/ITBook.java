package book;

public class ITBook extends Book{
	//필드
	public String gemre; //분야
	public String publisher; //출판사
	
	
	//생성자
	ITBook(){
		this.gemre = "IT";
		this.publisher = "한빛미디어";
	}
	
	//메소드
	public String getGemre() {
		return gemre;
	}
	public void setGemre(String gemre) {
		this.gemre = gemre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void printBook() {
		System.out.println("책 분야 : " + gemre);
		System.out.println("책 출판사 : " + publisher);
	}

	@Override
	public String toString() {
		String msg = "책 이름 = " + this.getName() + "\n" +
				"책 저자 = " + this.getAuthor() + "\n" +
				"책 가격 = " + this.getPrice() + "\n" +
				"분야 = " + this.getGemre() + "\n" +
				"출판사 = " + this.getPublisher() + "\n";
		return msg;
				
	}
	
	
}
