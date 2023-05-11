package mvc.mini;

public class Member {
	//필드
	private String name;
	private int age;
	private String tel;
	private String email;
	private String addr;
	private double weight;
	
	Member(){
		
	}
	
	Member(	String name,
			int age,
			String tel,
			String email,
			String addr,
			double weight
			){
		this.setName(name);
		this.setAge(age); //0 <= age < 150
		this.setTel(tel);
		this.setEmail(email);
		this.setAddr(addr);
		this.setWeight(weight); //1 <= weight
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if((age < 0) || (age >= 150)) {
			this.age = 0;
		}else {
			this.age = age;
		}
		
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if((weight < 1) || (weight > 200)) {
			this.weight = 50;
		}else {
			this.weight = weight;
			return; //명시
		}
	
	}

	
	//기존에 있던 것을 재정의 했다는 명시적 표현 = @Override
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", tel=" + tel + ", email=" + email + ", addr=" + addr
				+ ", weight=" + weight + "]";
	}

	
}
