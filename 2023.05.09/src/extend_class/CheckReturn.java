package extend_class;

public class CheckReturn {

	public static void main(String[] args) {
		
		
		CheckReturnClass check = new CheckReturnClass();
		
		check.add(5, 6);
		check.add(10.0, 5.0);
		System.out.println(check.getY());
		
		

	}

}
