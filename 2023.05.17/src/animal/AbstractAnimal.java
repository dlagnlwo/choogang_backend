package animal;

public abstract class AbstractAnimal {
	private String name;
	
	//생성자
	public AbstractAnimal(String name) {
		this.name = name;
	}
	
	//추상메소드
	public abstract void bark();
	
	//일반메소드
	public void run() {
		System.out.printf("%s는 한가로이 풀을 뜯고 있습니다\n", name);
	}
	
	//읽기
	public String getName() {
		return name;
	}
	
	
}
