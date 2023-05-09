package game;

public class DiceApp {

	public static void main(String[] args) {
		Dice dice = new Dice();
//		playDiceIndividual();
		playDiceByArray();
		
		
		// 지금까지 주사위 총 몇개?
		// for문 x
		// static을 활용
		// 정적멤버는 같은 참조데이터형 사이의 정보공유용으로 사용한다.
		// 정적메소드는 같은 공유멤버의 데이터변경 용으로 사용한다.
		
		// 프로그램 종료
		System.out.println("*** 프로그램 종료 ***");
	}
	
	// static으로 작성된 것은 static에서만 부를 수 있음.
	public static void playDiceIndividual() {
		// 1번
				Dice dice = new Dice();
				dice.roll();
				int selectedDiceNumber = dice.choice();
				System.out.println(dice.toString());

				// 2번
				Dice dice2 = new Dice();
				dice2.roll();
				int selectedDiceNumber2 = dice2.choice();
				System.out.println(dice2.toString());

				// 3번
				Dice dice3 = new Dice();
				dice3.roll();
				int selectedDiceNumber3 = dice3.choice();
				System.out.println(dice3.toString());

				// 4번
				Dice dice4 = new Dice();
				dice4.roll();
				int selectedDiceNumber4 = dice4.choice();
				System.out.println(dice4.toString());
	}
	public static void playDiceByArray() {
		Dice[] dices = new Dice[4];
		
		for(int i = 0; i < dices.length; i++) {
			dices[i] = new Dice();
			dices[i].selectColor();
			dices[i].roll(); //방마다 랜덤 숫자 지정
			System.out.printf(
					"[%s] 선택된 값 : %s\n",
					dices[i].getColor(),
					dices[i].toString()
					);
			
		}//for 끝
		System.out.println("--------------------------");
		// 다이스 객체 2개 제거
		Dice.decrease();
		Dice.decrease();
		System.out.println("다이스 객체 두개 제거");
		System.out.println("현재 객체 수 : " + Dice.getCount());
		
		Dice.increase();
		Dice.increase();
		Dice.increase();
		System.out.println("다이스 객체 세개 증가");
		System.out.println("현재 객체 수 : " + Dice.getCount());
	}

}
