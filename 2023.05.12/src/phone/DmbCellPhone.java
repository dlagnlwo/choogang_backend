package phone;
//Dmb
public class DmbCellPhone extends CellPhone{
	//필드
	
	int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
//		super(); //부모클래스의 생성자를 호출
		
		//부모로부터 상속
		this.model = model;
		this.color = color;
		
		//고유필드
		this.channel = channel;
	}
	
	
	//메소드
	void turnOnDmb(){ //Dmb를 단순히 키는거니까 void
		System.out.println("채널 " + this.channel + "번 방송"
				+ "수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		 this.channel = channel;
		 System.out.println("채널 " + this.channel + "번으로"
					+ " 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("Dmb방송 수신을 멈춥니다.");
	}
	
	// 강제로 통화기능 추가
//	void sendVoice(String msg) {
//		System.out.println("😊나 : " + msg);
//	}
//	
//	void reciveVoice(String msg) {
//		System.out.println("👍상대방 : " + msg);
//	}
	
}
