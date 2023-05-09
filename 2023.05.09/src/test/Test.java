package test;

public class Test {

	//필드
	private int selectedNum; //주사위 돌릴때 보이는 면
	private String color; //주사위 색깔
	private int count;
	
	
	
	//생성자
	Test(){
		count++;
	}
	
	
	//메소드
	//주사위 굴러가는 메소드
	void roll() {
		selectedNum = (int)(Math.random() * 6) + 1;
	}
	
	//주사위가 생성한 난수값 확인
	int choice() {
		return selectedNum;
	}
	
	
	public int getSelectedNum() {
		return selectedNum;
	}
	public void setSelectedNum(int selectedNum) {
		this.selectedNum = selectedNum;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		String msg = 
				"주사위 눈금 : " + selectedNum;
		return msg;
	}
	
	
	
	
}
