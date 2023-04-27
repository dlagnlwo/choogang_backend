import java.util.*;

public class SimpleCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a;
		System.out.print("데이터를 입력 : ");
		a = sc.nextLine();
		System.out.println(a);

		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		int result = x + y;
		System.out.println("x + " + "y = " + result);

	}

}
