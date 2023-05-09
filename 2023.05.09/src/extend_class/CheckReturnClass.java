package extend_class;

import java.util.Random;
import java.util.Scanner;

public class CheckReturnClass {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	//필드
	private double x;
	private int[] y;
	
	public CheckReturnClass() {
		this.x = 5.0;
		this.y = new int[4];
	}
	

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public int[] getY() {
		this.y[0] = Math.abs(ran.nextInt() % 100) + 1;
		this.y[1] = Math.abs(ran.nextInt() % 100) + 1;
		this.y[2] = Math.abs(ran.nextInt() % 100) + 1;
		this.y[3] = Math.abs(ran.nextInt() % 100) + 1;
		return y;
	}

	public void setY(int[] y) {
		this.y = y;
	}

	public void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, (x + y) );
		return ;
	}
	
	public void add(double x, double y) {
		System.out.printf("%.2f + %.2f = %.2f", x, y, (x + y));
		return;
	}
	
	public void printXY() {
		CheckReturnClass check = new CheckReturnClass();
		
		
		System.out.println("x를 입력 : ");
		double na = sc.nextDouble();
		check.setX(na);
		
		
		
		
		
		
	}
}
