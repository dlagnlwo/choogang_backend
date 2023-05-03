package classex.student;

public class StudentEx {

	public static void main(String[] args) {
		//Student는 데이터 유형(역할)
		//s1은 Student 객체(주소)를 가르킴
		Student s1 = new Student(); 
		
		p("객체의 해시코드 : " + System.identityHashCode(s1));
		Student s2 = new Student();
		
		p("객체의 해시코드 : " + System.identityHashCode(s2));
	}
	
	public static void p(String msg) {
		System.out.println(msg);
	}

}
