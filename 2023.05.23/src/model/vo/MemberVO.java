package model.vo;

public class MemberVO {
	//멤버변수(필드)
	private int id;
	private int age;
	private String first;
	private String last;
	
	//전체 멤버변수를 초기화하는 생성자가 있으면 좋음
	
	public MemberVO(int id, int age, String first, String last){
		this.id = id;
		this.age = age;
		this.first = first;
		this.last = last;
	}
	
	
	//메소드
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
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
	
	
}
