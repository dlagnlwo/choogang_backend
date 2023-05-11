package mvc.mini;

public class MemberApp {

	public static void main(String[] args) {
		//member 객체 추가 테스트
		//데이터베이스 테이블 연결
		MemberDAO memberDAO = new MemberDAO(5); //5개 방 만들기
		Member aMember = new Member(
				"홍길동",
				20,
				"010-5465-2131",
				"asd@naver.com",
				"서울",
				50);
		//메소드 하나 만들고 하나 테스트하는 방식으로 진행한다.
		memberDAO.insertMember(aMember);
		
		
		
		aMember = new Member(
				"홍길순",
				20,
				"010-7778-2131",
				"asd123@naver.com",
				"서울",
				40);
		memberDAO.insertMember(aMember);
		// 인덱스 번호 1인 자료를 가져오세요
		aMember = memberDAO.selectMemberByIndex(1);
		

		testInsertMember(aMember);
	}
	public static void testInsertMember(Member member) {
		System.out.println("member객체의 내용 : " +
							member.toString());
	}
	

}
