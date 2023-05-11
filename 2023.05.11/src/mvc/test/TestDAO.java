package mvc.test;

public class TestDAO {
	
	//필드 
	Test[] tests; //테이블 역할
	int index;
	
	//생성자
	TestDAO(int arraySize){
		tests = new Test[arraySize];
	}
	
	//메소드
	//회원 정보 추가
	//장소 생성
	void insertTest(Test test) {
		index++;
		tests[index] = test;
	}
	
	//회원정보 추가 메소드 오버로딩
	//데이터 삽입
	void insertTest(String name,
					String tel,
					String addr,
					String email,
					int age) {
		Test test = new Test(name, tel, addr, email, age);
		
		index++;
		tests[index] = test;
	}
	
	//전체 검색
	void selectTestAll() {

	}
		
	//번호로 회원정보 검색
	Test selectTestByIndex(int index) {
		return tests[index];
	}
	//수정
	void updateTest() {
		
	}
	//삭제
	void deleteTest() {
		
	}
	
	//출력부분
	public static void printTest() {
		
	}
	
	
	
	//동작 테스트
//	boolean testInsert(Test test) {
//		int count = index;
//		insertTest(test);
//		int insertCount = index;
//		if(insertCount - count > 0) {
//			return true;
//		}else {
//			return false;
//		}
//		
//	}
	
}
