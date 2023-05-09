package test;

public class TestMain {

	public static void main(String[] args) {
//		TestGame();
		TestByArray();

	}

	public static void TestGame() {
		// 1번
		Test test = new Test();
		test.roll();
		int selectedTestNumber = test.choice();
		System.out.println(test.toString());

		// 2번
		Test test2 = new Test();
		test2.roll();
		int selectedTestNumber2 = test2.choice();
		System.out.println(test2.toString());
		// 3번
		Test test3 = new Test();
		test3.roll();
		int selectedTestNumber3 = test3.choice();
		System.out.println(test3.toString());
		// 4번
		Test test4 = new Test();
		test4.roll();
		int selectedTestNumber4 = test4.choice();
		System.out.println(test4.toString());
		// 5번
		Test test5 = new Test();
		test5.roll();
		int selectedTestNumber5 = test5.choice();
		System.out.println(test5.toString());
	}
	
	public static void TestByArray() {
		Test[] tests = new Test[4];
		
		for(int i = 0; i < tests.length; i++) {
			tests[i] = new Test();
			tests[i].roll();
			System.out.println(
					"선택된 값 : " + tests[i].toString());
		}//for 끝
		
	}
	
	

}
