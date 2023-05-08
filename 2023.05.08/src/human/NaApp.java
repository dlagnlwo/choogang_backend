package human;

public class NaApp {

	public static void main(String[] args) {
		Na na = new Na("홍길동", "010-5464-5464");
		na = new Na("백두산", "010-9989-8855", 190, 70, '남');
		
		na.printInfo();

	}

}
