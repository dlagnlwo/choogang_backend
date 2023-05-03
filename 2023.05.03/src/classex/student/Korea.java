package classex.student;

public class Korea {
	//필드
	String city, name, nation;
	
	//생성자
	Korea(){
		this("한국", "서울", "홍길동");
	}
	
	Korea(String nation) {
		this(nation, "서울", "홍길동");
	}
	
	Korea(String city, String nation) {
		this(nation, city, "홍길동");
	}
	Korea(String city, String name, String nation) {
		this.city = city;
		this.name = name;
		this.nation = nation;
	}
	
	//메소드
	public void printKorea() {
		System.out.println(this.city);
		System.out.println(this.name);
		System.out.println(this.nation);
	}
}
