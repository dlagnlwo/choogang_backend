package inherit.overriding;

//자식
public class Computer extends Calculator{
	//메소드
	double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle()실행");
		double result = Math.PI * r * r;
		return result;
	}


}
