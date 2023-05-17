package animal;

public class Cat extends AbstractAnimal{

	private int age;
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}

	@Override
	public void bark() {
		System.out.println("야옹");
		
	}
	public void go() {
		System.out.println(this.getName() + "가 올라감");
	}
	


	
}
