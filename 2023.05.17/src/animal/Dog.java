package animal;

public class Dog extends AbstractAnimal{

	private String type;
	
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	
	

	@Override
	public void bark() {
		System.out.println("멍멍");
		
	}

	@Override
	public void run() {
		System.out.printf("강아지 이름은 : %s",getName() + "\n");
	}
	
	
	
}
