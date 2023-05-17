package animal;

public class Tiger extends AbstractAnimal{

	private String color;
	
	public Tiger(String name, String color) {
		super(name);
		this.color = color;
	}

	@Override
	public void bark() {
		System.out.println("떡 하나 주면 안잡아먹지");
	}
	
	

}
