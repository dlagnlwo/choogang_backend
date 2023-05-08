package human;

import java.util.Scanner;

public class Human {
	// 필드
	double height, weight;
	char gender;
	
	// 생성자
	
	protected Human(){
		this.height = 150;
		this.weight = 50;
		this.gender = '남';
	}
	
	void setHeight(double height){
		this.height = height;
	}
	
	double getHeight() {
		return this.height;
	}
	
	void setWeight(double weight){
		this.weight = weight;
	}
	double getWeight() {
		return this.weight;
	}
	
	void setGender(char gender){
		this.gender = gender;
	}
	char getGender() {
		return this.gender;
	}
	
	
	
	// 메소드
	public void printHuman() {
		Human human = new Human();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("키 : %f cm \n" ,human.getHeight());
		System.out.printf("몸무게 : %f kg \n", human.getWeight());
		System.out.printf("성별 : %c \n", human.getGender());
		
		System.out.print("key를 입력 : ");
		double key = sc.nextDouble();
		human.setHeight(key);
		
		System.out.print("몸무게를 입력 : ");
		double mom = sc.nextDouble();
		human.setWeight(mom);
		
		System.out.print("성별을 입력 : ");
		char gen = sc.next().charAt(0);
		human.setGender(gen);
		
		System.out.println("키 : " + human.getHeight());
		System.out.println("몸무게 : " + human.getWeight());
		System.out.println("성별 : " + human.getGender());
		
		
//		human.setWeight(50);
//		human.setGender('남');
		
	}
}
