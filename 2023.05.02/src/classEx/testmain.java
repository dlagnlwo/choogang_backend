package classEx;

public class testmain {

	public static void main(String[] args) {
		
		
		test t1 = new test(); //객체 생성
		
		// 학생 학생2 = new 학생();
		p("t2 변수가 또 다른 학생 객체를 참조합니다.");
		test t2 = new test(); //객체 생성
		
		if(t1 == t2) {
			pl("학생1변수는 학생2변수와 같은 객체 가르킴");
		}else {
			pl("학생1변수는 학생2변수와 다른 객체 가르킴");
		}
	}
	
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}

}
