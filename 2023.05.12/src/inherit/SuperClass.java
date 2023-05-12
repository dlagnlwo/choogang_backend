package inherit;

//부모 클래스(super)
public class SuperClass {
	//필드
	public String name;
	
	//생성자
	public SuperClass() {
		this.name = "자바";
	}
	//메소드
	public void setName(String name) {
//		this라는 것은 객체를 가리킨다(자기자신)
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	//정보 출력
	public void print() {
		System.out.println("SuperClass의이름 : " + this.name);
	}
}
