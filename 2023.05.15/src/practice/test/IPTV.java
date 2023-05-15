package practice.test;

public class IPTV extends ColorTv{

	//필드
	private String ip;
	
	//생성자
	public IPTV(String ip, int size, int quality) {
		super(size, quality);
		this.ip = ip;
	}
	
	protected String getIp() {
		return ip;
	}
	
	//메소드
	public void printProperty() {
		pl("나의 IPTV는 " + getIp() + " 주소의 " + getSize() + "인치 "
				+ getQuality() + "컬러");
	}
	
	public static void pl(String msg) {
		System.out.println(msg);
	}
	
}
