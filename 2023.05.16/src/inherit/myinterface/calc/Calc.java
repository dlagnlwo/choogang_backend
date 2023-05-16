package inherit.myinterface.calc;


//실제 기능을 구현하는 클래스
public class Calc extends AbstractCalc{

	//인터페이스에서 가져오는 건 반드시 접근제한자가 public이어야 함.
	@Override
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}

	@Override
	public int sub(int x, int y) {
		int result = x - y;
		return result;
	}

	@Override
	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	@Override
	public int div(int x, int y) {
		int result = x / y;
		return result;
	}

	@Override
	public void calc() {
		
		switch(getOper()) {
		case '+' :
			System.out.printf("%d %c %d = %d",
					getNum1(), getOper(), getNum2(), add(getNum1(), getNum2()));
			break;
		case '-' :
			System.out.printf("%d %c %d = %d",
					getNum1(), getOper(), getNum2(), sub(getNum1(), getNum2()));
			break;
		case '*' :
			System.out.printf("%d %c %d = %d",
					getNum1(), getOper(), getNum2(), mul(getNum1(), getNum2()));
			break;
		case '/' :
			System.out.printf("%d %c %d = %d",
					getNum1(), getOper(), getNum2(), div(getNum1(), getNum2()));
			break;
		default :
			System.out.println("잘못된 연산입니다.");
			break;
		}
	}

}
