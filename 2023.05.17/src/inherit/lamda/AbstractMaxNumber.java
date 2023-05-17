package inherit.lamda;

public abstract class AbstractMaxNumber {
	//max값을 찾는 메소드
	abstract int getMaxNumber(int x, int y);
	
	abstract void p(String msg);
	
	void pl(String msg) {
		System.out.println(msg);
	}
}
