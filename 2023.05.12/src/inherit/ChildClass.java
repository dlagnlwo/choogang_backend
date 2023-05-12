package inherit;

//데이터 클래스 
//자식 클래스
//부모에 있는것중에 private 을 제외하고 다 쓸 수 있음.
//자식 클래스는 필드와 메소드를 받을 수 있다.
public class ChildClass extends SuperClass{
	public void printChild() {
		System.out.println("ChildClass의이름 : " + this.name);
	}
	public void print() {
		System.out.println("ChildClass의이름 : " + this.name);
	}
}
