package phone;
//상속 = 생성자와 메소드만 상속받을 수 있음.

public class DmbCellPhoneTestApp {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);
		
		
		//phone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		//DmbCellPhone 자기 고유 필드
		System.out.println("채널 : " + dmb.channel);
		
		//dmb기능 테스트
		//phone으로부터 상속받은 기능 테스트 호출
		dmb.powerOn();
		dmb.bell();
		
		dmb.sendVoice("안녕하세요"); //sendVoice CellPhone으로 부터
		dmb.reciveVoice("안녕하세요");//reciveVoice CellPhone으로 부터
		
		dmb.powerOff();
		
		//dmb 테스트
		//dmb 키기
		dmb.turnOnDmb();
		//dmb 채널 변경
		dmb.changeChannelDmb(15);
		//dmb 끄기 
		dmb.turnOffDmb();
		
		System.out.println("--------finish-----------");
	}

}
