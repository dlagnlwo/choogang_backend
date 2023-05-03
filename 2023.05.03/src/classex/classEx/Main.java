package classex.classEx;

import java.util.*;

class Student {
	//필드 
	private String name;
	private int id;
	
	//생성자 getter, setter
	public void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name + "과";
	}
	public void setId(int id) {
		this.id = id;
	}
	int getId() {
		return this.id;
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 문제 1 - 다음을 만족하는 Student 클래스를 작성하시오.

		· String형의 학과와 정수형의 학번을 필드로 선언

		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력

		문제 - 2. 위에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성하시오.

		· 필드를 모두 private로 하고, getter와 setter를 구현하고

		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력
		 */
		Student st1 = new Student();
		
		pl("---회원가입---");
		p("학과 입력 : ");
		String name = sc.nextLine();
		st1.setName(name);
		
		p("학번 입력 : ");
		int id = sc.nextInt();
		st1.setId(id);
		
		pl("학생의 학과 : " + st1.getName());
		pl("학생의 번호 : " + st1.getId() + "번");
		
		
		
		
	}
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}

}
