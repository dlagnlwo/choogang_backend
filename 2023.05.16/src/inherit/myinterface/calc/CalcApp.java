package inherit.myinterface.calc;

import java.util.Scanner;
import static inherit.myinterface.MyIO.*;

public class CalcApp {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		Scanner sc = new Scanner(System.in);
		p("첫번 째 숫자 입력 : ");
		calc.setNum1(sc.nextInt());
		
		p("연산자 입력 : ");
		calc.setOper(sc.next().charAt(0));
//		int x = sc.nextInt();
//		calc.setNum1(x);
		
		p("두번 째 숫자 입력 : ");
		calc.setNum2(sc.nextInt());
//		int y = sc.nextInt();
//		calc.setNum2(y);
		calc.calc();

	}
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}

}
