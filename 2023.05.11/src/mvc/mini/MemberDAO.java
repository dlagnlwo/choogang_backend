package mvc.mini;

// Member VO객체를 관리하는 클래스
//Member에 데이터값을 저장
//Member에 데이터값을 읽어옴
//Member와 데이터베이스의 사이의 중계(CRUD)
public class MemberDAO {
	//테이블의 구조는 Member클래스의 멤버변수가 컬럼역할을 한다.
	//레코드와 테이블구조는 상관없다.
	//레코드 = 컬럼들의 합
	//레코드들 = 이 컬럼들의 합인 레코드의 배열
	
	//필드
	Member[] members; //db의 테이블 역할
	int currentIndex; //객체의 개수

	//생성자
	MemberDAO(int arraySize) {
		members = new Member[arraySize];
		currentIndex = -1; //현재 추가된 Member객체 없음
	}
	
	//회원 정보 추가
	//장소 생성
	void insertMember(Member member) {
		//한회원의 정보 (Member객체)를 테이블에 넣는 역할
		//위에 member객체를 members[currentIndex]에 담음.
		currentIndex++;
		members[currentIndex] = member;
	}
	
	// 회원정보 추가 메소드 오버로딩(파라미터로 개별 멤버데이터 입력)
	// 데이터 삽입
	void insertMember(
		String name,
		int age,
		String tel,
		String email,
		String addr,
		double weight) {
		Member newMember = 
				new Member(name, age, tel, email, addr, weight);
		//새로운 인덱스 생성
		currentIndex++;
		members[currentIndex] = newMember;
	}
	
	//동작 테스트
	boolean testInsertMember(Member member) {
		int count = currentIndex; //현재 테이블의 레코드 수
		insertMember(member); //동작이 성공하면 true
		int insertCount = currentIndex; // 추가된 자료수
		
		//추가된 테이블 자료 수 - 이전 테이블 자료수 > 0
		//성공하면 자료 추가됨.
		if(insertCount - count > 0) {
			return true;
		} else {
			return false;
		}
		
		
	}
	//전체회원 정보 검색
	void selectMemberAll() {
		
	}
	
	// 번호로 지정된 회원정보검색
	Member selectMemberByIndex(int index) {
		return members[index];
	}
	
	
	
	//회원 정보 수정
	void updateMember() {
		
	}
	//회원 정보 삭제
	void deleteMember() {
		
	}
	
	

}
