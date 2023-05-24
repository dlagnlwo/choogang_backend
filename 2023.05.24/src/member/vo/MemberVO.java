package member.vo;

public class MemberVO {
	private int id;
	private String name;
	private String passwd;
	private String nick;
	
	
	public MemberVO(int id, String name, String passwd, String nick) {
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.nick = nick;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
	
	
}
