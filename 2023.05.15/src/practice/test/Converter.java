package practice.test;

import java.util.Scanner;

public abstract class Converter {
	private String src;
	private String dest;
	protected double ratio;
	//메소드
	
	
	public String getSrc() {
		return src;
	}



	public void setSrc(String src) {
		this.src = src;
	}



	public String getDest() {
		return dest;
	}



	public void setDest(String dest) {
		this.dest = dest;
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrc() + " 을" + getDest() + 
				"로 바꿉니다.");
		System.out.print("원을 입력하세요>> ");
		double won = sc.nextDouble();
		
	}
	
	
}
