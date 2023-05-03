package classex.student;

public class Student {
	public static void main(String[] args) {
		Student s1 = new Student();
		// "" + 숫자 == 문자열
		p("" + System.identityHashCode(s1)); //16진수 숫자 나옴
		Student s2 = new Student();
		p("" + System.identityHashCode(s2)); //16진수 숫자 나옴
	}
	
	// 메소드
	public static void p(String msg) {
		System.out.println(msg);
	}
}

class a {
	//필드
	String name;
	
	//생성자
	a(String name) {
		this.name = name;
	}
	
	//메소드
	public void printa() {
		System.out.println(name);
	}
}
