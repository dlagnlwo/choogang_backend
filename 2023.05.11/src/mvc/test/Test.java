package mvc.test;

// 모델(변수들)

public class Test {
	
	//회원관리필드
	private String name;
	private String tel;
	private String addr;
	private String email;
	private int age;
	
	//생성자
	
	//사용자 정의 생성자
	Test(	String name,
			String tel,
			String addr,
			String email,
			int age) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.email = email;
		this.age = age;
	}

	
	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 100 || age < 0) {
			this.age = 25;
		}else {
			this.age = age;	
		}
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", tel=" + tel + ", addr=" + addr + ", email=" + email + ", age=" + age + "]";
	}
	
	
	
	
}
