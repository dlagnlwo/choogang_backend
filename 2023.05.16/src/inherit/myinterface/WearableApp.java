package inherit.myinterface;

public class WearableApp {

	public static void main(String[] args) {
		Headphone head = new Headphone();
		
		head.putOn();
		
		head.setVolume(10);
		
		head.putOff();
		
		WearableComputer com = new WearableComputer();
		
		com.putOn();
		
		com.reset();
		
		com.putOff();
		
		//웨어러블 기기들 관리
		//같은 종류의 데이터가 모일 장소를 설정
		Wearable[] wa = new Wearable[2];
		
		//업캐스팅 : 자식객체들 부모타입으로 변경하는 것
		//즉, 자식이 부모인 척을 하는 것
		wa[0] = new Headphone();
		wa[1] = new WearableComputer();
		
		//각 웨어러블 장비를 켜기
		wa[0].putOn();
		wa[1].putOn();
		
		//각 웨어러블 장비를 끄기
		wa[0].putOff();
		wa[1].putOff();
		
		//다운캐스팅 : 업캐스팅했던 객체를 본래 자기타입으로 다운한다.
		((Headphone)wa[0]).setVolume(0);
		((WearableComputer)wa[1]).reset();
		
		//이거 안됨
//		((Headphone)wa[1]).setVolume(15);
		
		//SmartWatch객체 생성
		//업캐스팅
		SmartWatch sw = new SmartWatch();
		WearableComputer sw1 = new SmartWatch();
		Wearable sw2 = new SmartWatch();
		
		
		//SmartWatch sw는 ring()을 부를 수 있을까요?
		sw.ring();
		//WearableComputer sw1은 ring()을 부를 수 있을까요?
//		sw1.ring(); //부모클래스로 승격했으므로 WearableComputer만 보임
		
		//만약 sw1을 SmartWatch로 바꾸면 어떻게 될까요?
		//다운캐스팅으로 불러짐
		((SmartWatch)sw1).ring();
		
		//지금 sw2에는 putOn()과 putOff()만 있기 때문에 그것 만 불러올수 있음
//		sw2.ring(); 
		
		//만약 sw2를 SmartWatch로 바꾸면 어떻게 될까요?
		//다운캐스팅으로 하면 실행 가능.
		((SmartWatch)sw2).ring();
	

	}

}
