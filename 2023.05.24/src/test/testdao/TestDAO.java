package test.testdao;

import static test.util.testUtil.pl;

import test.vo.TestVO;



//메뉴번호를 선택했을 때 기능
public class TestDAO {
	//멤버변수
	TestVO testvo;
	
	//생성자
	public TestDAO(){
		pl("파라미터가 없는 생성자");
	}
	//사용자 정의 생성자
	public TestDAO(int id, String name, int goodscode, int price){
		testvo = new TestVO(id, name, goodscode, price);
		pl("파라미터가 있는 생성자");
		
	}
	
	//메소드
	public void getTestList() {
		
	}
	public void insertTest() {
		
	}
	public void updateTest() {
		
	}
	public void deleteTest() {
		
	}
	
	
}
