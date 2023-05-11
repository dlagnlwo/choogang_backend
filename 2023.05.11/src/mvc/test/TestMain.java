package mvc.test;

public class TestMain {

	public static void main(String[] args) {
		
		TestDAO testDAO = new TestDAO(5);
		Test test = new Test(
				"홍길순",
				"010-7899-4445",
				"경기",
				"asd@naver.com",
				20);
		
		testDAO.insertTest(test);
		test = testDAO.selectTestByIndex(1);
		System.out.println(test);
		

//		System.out.println(test.toString());
	}
	
}
