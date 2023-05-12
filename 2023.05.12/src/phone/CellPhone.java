package phone;

//CellPhone
public class CellPhone extends Phone{
	//필드
	
	//생성자
	
	//메소드
	
	void powerOn() {
		System.out.println("CellPhone 전원을 넣었습니다.😁");
	}
	
	//목소리 보냄
	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	
	//응답
	void reciveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
}
