package inherit.lamda;

public class StringConcatApp {

	public static void main(String[] args) {
		StringConcat concat = 
				(s1, s2) -> System.out.println(s1 + s2);
				
		concat.makeString("Welcome ", "자바월드");
		
		//위에 람다함수로 쓴 것과 똑같음
//		StringConcat concat = new StringConcat() {
//			
//			@Override
//			public void makeString(String s1, String s2) {
//				System.out.println(s1 + s2);
//				
//			}
//		};

	}

}
