package menu;

public class Menu {
	//필드
	String coffee;
	String latte;
	String greentea;
	String end;
	
	//생성자
	Menu(String coffee, String latte,
			String greentea, String end){
		this.coffee = coffee;
		this.latte = latte;
		this.greentea = greentea;
		this.end = end;
	}
	
	//메소드
	public void printMenu() {
		System.out.println("------메뉴------");
		System.out.println("1. " + coffee);
		System.out.println("2. " + latte);
		System.out.println("3. " + greentea);
		System.out.println("4. " + end);
	}
}
