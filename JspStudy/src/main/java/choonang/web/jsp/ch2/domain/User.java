package choonang.web.jsp.ch2.domain;


public class User {
	private String name;
	private String id;
	private String password;
	private String[] hobby;
	private String major;
	
	//생성자
	public User(
			String name,
			String id,
			String password,
			String[] hobby,
			String major) {
		
		setAllMember(name, id, password, hobby, major);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAllMember(	String name,
								String id,
								String password,
								String[] hobby,
								String major) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.hobby = hobby;
		this.major = major;
	}
	
	
}
