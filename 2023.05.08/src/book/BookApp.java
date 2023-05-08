package book;

public class BookApp {

	public static void main(String[] args) {
		Book b1 = new Book("이것이 자바다", "신용권", 35000);
		System.out.println(b1.toString());
		printBookInfo(b1);
		
		
		//private이기 때문에 오류
		
		Book b2 = new Book();
		b2.setTitle("혼자공부하는 자바");
		b2.setAuthor("신용권");
		b2.setPrice(25000);
		System.out.println(b2.toString());
		printBookInfo(b2);
		

//		if(b.equals(b2)) {
//			System.out.println("b1과 b2는 같습니다.");
//		}else {
//			System.out.println("다릅니다");
//		}
		
	}
	
	//static 함수는 static함수만 부를 수 있음.
	//프로그램이 실행될 때 함수를 한번만 만들어 놓고 공유한다.
	public static void printBookInfo(Book book){
		System.out.println("b1의 제목 : " + book.getTitle());
		System.out.println("b1의 저자 : " + book.getAuthor());
		System.out.println("b1의 가격 : " + book.getPrice());
	}
	
	

}
	
	
