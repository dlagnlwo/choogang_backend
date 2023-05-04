package menu;

public class Menu2 {
	// 메뉴판 목록 저장
	
	// 필드
	String[] menuNames; //메뉴이름
	int[] menuPrices; //메뉴가격
	String[] menuOrigin; //원산지

//	밑에는 하드코딩
//	하드코딩은 하지말아라.
//	String menuName = "커피";
//	String menuName1 = "라떼";
//	String menuName2 = "녹차";
//	String menuName3 = "끝";

	// 생성자
	Menu2() {
		// 데이터형 [] 변수 = {...};
		// 변수선언 + 값대입 = 초기화
		// 변수 선언 후 초기화식으로 값을 대입하는 방법?
		// 배열변수명 = new 데이터형[]{"값1","값2"...};
		menuNames = new String[]{"커피", "라떼", "녹차"};
		menuPrices = new int[]{1500, 3000, 2500, -1};
		menuOrigin = new String[] {"한국", "미국", "호주","없음"};
	}
	
	//생성자
	Menu2(String[] menuItems) {
		for(int i = 0; i < menuItems.length; i++) {
			this.menuNames[i] = menuNames[i];
			this.menuPrices[i] = menuPrices[i];
		}
		
	}
	
	//메소드
	protected void printMenu() {
		Menu2 menuPan = new Menu2();
		System.out.println("Menu클래스를 이용한 메뉴판 만들기");
		System.out.println("------메뉴------");
		
		for(var menuItem : menuPan.menuNames) {
			System.out.println(menuItem
					+ "(원산지:" + menuPan.menuOrigin[0] + ")"
					+ "가격 : " + menuPan.menuPrices[0]);
			System.out.println(menuItem
					+ "(원산지:" + menuPan.menuOrigin[1] + ")"
					+ "가격 : " + menuPan.menuPrices[1]);
			System.out.println(menuItem
					+ "(원산지:" + menuPan.menuOrigin[2] + ")"
					+ "가격 : " + menuPan.menuPrices[2]);
			System.out.println("----------------------");
			
		}
		
	}
}
