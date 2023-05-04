package car;

public class Car {
	// 가스가 떨어지면
	// 필드
	int gas; //가스가 없으면 자동차 안움직임.
	
	// 생성자
	Car(){ //default 접근제한자, 기본 생성자
		gas = 50;
	}
	
	// 필드의 데이터를 읽고 쓰기만 하는 메소드
	// 속성함수 프라퍼티 함수
	// set --> 저장하는 곳
	void setGas(int gas) { //void를 쓰면 리턴값 없음
		this.gas = gas;
	}
	
	// 가스가 남아 있는지 없는지 알려주는 함수(true or false)
	// true 아님 false이기 때문에 if문 안에는 false if문 밖에는 true
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("가스가 없습니다.");
			Stop();
			return false; //return false;를 안에다가 써야함!
		}
		System.out.println("가스가 남았습니다.");
		return true;
	}
	
	//void = return값 없음
	void run() {
		Start(); //this.Strat()를 굳이 안함.
		//가스가 있다면 break전까지 계속 돌음
		while(true) {
			if(gas > 0) {
				System.out.printf("달립니다. 가스잔량 : %d\n",gas);
				gas -= 1; //차가 일정거리를 달리면 가스소비 -1
			}else { //가스가 0보다 작은 경우
				System.out.printf("멈춥니다. 가스잔량 : %d\n", gas);
				// 자동차가 멈추었으므로 시뮬레이션 종료
				return; //메소드의 명시
			}
		}
	}
	void Start(){
		System.out.println("자동차 시동을 걸었습니다.");
	}
	void Stop() {
		System.out.println("자동차 시동을 껐습니다.");
	}
	
	
	// get --> 가져오는 곳
	
}
