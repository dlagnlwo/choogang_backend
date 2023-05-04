package menu;

import java.util.*;

public class MenuShowApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] menus = {"커피", "라떼", "녹차", "끝"};
		Menu menu = new Menu("커피", "라떼", "녹차", "끝");
		menu.printMenu();
		
//		pl("------메뉴------");
//		pl("1. 커피 \n2. 라떼 \n3. 녹차\n4. 끝 ");

		

		while (true) {

			p("메뉴선택 해주세요 : ");
			String sel = sc.nextLine();
			
			if (sel.equals("1") || sel.equals(menus[0])) {
				pl("커피를 선택하셨습니다.");
				break;
			} else if (sel.equals("2") || sel.equals(menus[1])) {
				pl("라떼를 선택하셨습니다.");
				break;
			} else if (sel.equals("3") || sel.equals(menus[2])) {
				pl("녹차를 선택하셨습니다.");
				break;
			} else if (sel.equals("4") || sel.equals(menus[3])) {
				pl("감사합니다.");
				break;
			} else {
				pl("메뉴에서 선택해주세요");
				menu.printMenu();
				continue;
			}
			
		}
		
		
		sc.close();
		pl("주문 종료");

	}

	public static void p(String msg) {
		System.out.print(msg);
	}

	public static void pl(String msg) {
		System.out.println(msg);
	}
	
}
