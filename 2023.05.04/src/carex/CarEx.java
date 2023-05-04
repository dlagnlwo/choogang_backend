package carex;

public class CarEx {
	//필드
	//남아있는 가스 생성
	int gas;
	
	//생성자
	CarEx(){
		gas = 10;
	}
	
	//메소드
	//가스를 저장하는 곳
	void setGas(int gas) {
		this.gas = gas;
	}
	
	void Start() {
		System.out.println("자동차의 시동이 켜집니다.");
	}
	
	boolean isGas() {
		if(gas == 0) {
			System.out.println("가스를 충전해주세요");
			Stop();
			return false;
		}
		System.out.println("가스가 남아있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.printf("이동중, 가스잔량 : %d\n", gas);
				//딜레이 1초
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				gas -= 1;
			}else {
				System.out.printf("멈춤, 가스잔량 : %d\n", gas);
				return;
			}
		}
	}
	void Stop() {
		System.out.println("자동차의 시동이 꺼집니다.");
	}
	
}
