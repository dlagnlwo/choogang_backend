package calc;

public class Operator {
	public static void main(String[] args) {
//		int kor = 77, eng = 87;
//		int total = kor + eng;
//		double avg = total / 2;
//		
//		System.out.printf("총점 : %d", total);
//		System.out.println("평균 : " + (int)avg);
		
		
		add a = new add();
		System.out.println("총점 : " + add.total(77, 87)); 
		System.out.println("평균 : " + (int)add.avg(77, 87));
		
		Integer i = null;
		
		System.out.println(i);
		
		int intArray[] = null;
		intArray[0] = 10;
		System.out.println(intArray[0]);
	}
}

class add {
	public static int total(int kor, int eng) {
		return kor + eng;
	}
	public static double avg(int kor, int eng) {
		return (kor + eng) / 2;
	}
}
