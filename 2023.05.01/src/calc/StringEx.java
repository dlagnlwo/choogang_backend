package calc;

public class StringEx {

	public static void main(String[] args) {
		String strVal1 = "서울";
		String strVal2 = "서울";
		
		if (strVal1 == strVal2) {
			System.out.println("strVal1 == strVal2");
		}else {
			System.out.println("strVal1 != strVal2");
		}
		if (strVal1.equals(strVal2)) {
			System.out.println("strVal1 == strVal2");
		}else {
			System.out.println("strVal1 != strVal2");
		}

		String strVal3 = new String("서울");
		String strVal4 = new String("서울");
		
		if (strVal3 == strVal4) {
			System.out.println("strVal3 == strVal4");
		}else {
			System.out.println("strVal3 != strVal4");
		}
		if (strVal3.equals(strVal4)) {
			System.out.println("strVal3 == strVal4");
		}else {
			System.out.println("strVal3 != strVal4");
		}
		//참조가다름
		if (strVal1 == strVal3) {
			System.out.println("strVal1 == strVal3 참조가 같음");
		}else {
			System.out.println("strVal1 != strVal3 참조가 다름");
		}
		//값은 똑같음
		if (strVal1.equals(strVal3)) {
			System.out.println("strVal1 == strVal3 값이 똑같음");
		}else {
			System.out.println("strVal1 != strVal3 값이 다름");
		}
		
	}

}
