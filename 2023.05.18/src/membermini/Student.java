package membermini;

import java.util.*;

//vo OR dto클래스
public class Student {
	Scanner sc = new Scanner(System.in);
	//필드
	private String name;
	private int id;
	private int age;
	private int kor; //국어성적
	private int eng; //영어성적
	private int math; //수학성적
	
	//생성자
	Student(){
		
	}

	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	public boolean equals(Object obj) {
		//obj객체는 최상위 클래스로 업캐스팅 되었으므로
		//실제 데이터타입을 모릅니다. 그래서 실제 데이터 타입으로
		//형변환을 하여 각각의 멤버변수를 비교하여 같으면 동일한 객체입니다.
		if(obj instanceof Student) {
			//다운캐스팅 = 업캐스팅된 객체를 자식형식으로 되돌림
			Student st = (Student)(obj);
			
			//원래는 id만 비교해도됨.
			//하지만 더 정확하게 하기위해 이름까지 비교를 함.
			if((id == st.id) && (name.equals(st.name))){
				return true;
			}
		}
		return false;
	}
	public int sum() {
		int result = getKor() + getEng() + getMath();
		return result;
	}
	public double avg() {
		double result = (getKor() + getEng() + getMath()) / 3.0;
		return result;
	}
	
	
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}
	
	
	
	
	
	
	
}
