package inherit.lamda;

public class MaxNumberImpl implements IMaxNumber{

	//필드
	
	//생성자
	
	//메소드
	@Override
	public int getMaxNumber(int x, int y) {
		return (x > y) ? x : y;
	}
	
	
	
	
}
