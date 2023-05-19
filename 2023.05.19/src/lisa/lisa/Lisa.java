package lisa.lisa;

public class Lisa implements Lisaable{
	private String name;

	//고칠 때 여기 생성자만 고치면 됨.
	public Lisa(String name) {
		this.name = name;
	}
	
	
	//생성자 오버로딩
	//값을 고정(고치면 안됨)한 경우 set을 생성안하고
	//생성자에서 값을 넣어줌.
	
	Lisa(){
		this("리사");
	}
	
	public String getName() {
		return name;
	}
	
	//외부로 부터 왔음을 명시하는 어노테이션
	@Override
	public String toString() { //인터페이스에서 온 toString()
		String msg ="" + 
					getName() +
					" *^^* " +			//클래스 형식을 알 수 있음
					super.getClass() + //object의 getClass를가져옴
					" *^^* " +
					getName();
		
		return msg;
	}
	
}
