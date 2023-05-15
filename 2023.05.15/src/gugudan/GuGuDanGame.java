package gugudan;

import java.util.Scanner;

//구구단 게임은 인수로 값을 주면, 이 값과 난수로 만든 값을 곱해 문제를 만들고
//플레이어가 입력한 값과 비교해서 정답 여부를 알려주는 게임
//1, 먼저 프로그램을 실행 시킬 때 주는 인수를 얻는데, 이 인수는 String 형이므로 숫자로
//바꿔 저장하시오.
//2. 이 때 만약 인수로 준 값이 없으면 에러처리 하지 말고 난수로 1에서 9까지의 값중 하나를
//만들어 사용합니다.
//3. 컴퓨터가 생각한 숫자와 플레이어가 입력한 숫자가 같으면 정답임을 출력하고 정답을 알려줌.
public class GuGuDanGame {
	//필드
	private int x, y;
	
	//생성자
	public GuGuDanGame() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 입력 : " );
		x = sc.nextInt();
		setX(x);
		
		y = (int) ((Math.random() * 10) + 1);
		setY(y);
	}

	
	//메소드
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "GuGuDanGame " + getX() + "" + getY();
	}
	
	
	
	
	
	
	
}
