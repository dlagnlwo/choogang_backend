package animal;

public class AnimalApp {

	public static void main(String[] args) {
		Cat cat = new Cat("고양이", 5);
//		cat.bark();
//		cat.go();
		
		
		
		Dog dog = new Dog("강아지", "말티즈");
//		dog.bark();
//		dog.run();
		
		
		
		
		// AbstractAnimal에 있는 메소드만 불러오겠다는 뜻.
		// 즉, Dog의 메소드는 사용할 수 없음.
		// anudog.run(); 안됨.
		AbstractAnimal anidog = new Dog("인절미", "리트리버");
		anidog.bark();
		anidog.run();   //가장 가까운 run()이 Dog 클래스에 있음
						//AbstractAnimal에 run()이 있어도
						//dog 클래스의 run이 본래의 것이기 때문에 
					  	//dog 클래스의 run이 실행됨
		
		
		
		AbstractAnimal anicat = new Cat("고양이1", 2);
		anicat.bark();
		
		AbstractAnimal aniTiger = new Tiger("호돌이", "검은색");
		aniTiger.run();
		aniTiger.bark();
		
		AbstractAnimal[] ani = new AbstractAnimal[3];
		
		ani[0] = new Dog("망치", "치와와");
		ani[1] = new Cat("삼색이", 20);
		ani[2] = new Tiger("호랭이", "노란색");
		
		for(AbstractAnimal s : ani) {
			System.out.println("동물의 이름은 : " + s.getName());
			s.bark();
			s.run();
		}
		
		

	}

}
