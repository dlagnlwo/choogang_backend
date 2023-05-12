package inherit;

public class InheritApp {

	public static void main(String[] args) {
		SuperClass superclass = new SuperClass();
		ChildClass childclass = new ChildClass();
		
		superclass.setName("하늘");
		superclass.print(); //하늘
		
		
		childclass.print(); //자바
		//자식 이름 설정
		childclass.setName("하늘 밑에 구름");
		childclass.print(); //하늘 밑에 구름
		
		//메인 마지막에 메인이 끝났다는 표시를 하는것이 좋음.
		System.out.println("----------프로그램 finish----------");

	}

}
