package member.memberdao;

import member.vo.MemberVO;
import static member.util.MemberUtil.*;

public class MemberDAO {
	//멤버변수
	MemberVO memberVO;
	//생성자
	public MemberDAO() {
		pl("매개변수가 없는 기본생성자를 실행합니다.");
	}
	public MemberDAO(int id, String name, String passwd, String nick) {
		memberVO = new MemberVO(id, name, passwd, nick);
		pl("매개변수가 있는 생성자를 실행합니다.");
	}
	
	
	//회원 목록
	//결과값이 배열이여야 함.
	public void getMemberList() {
		pl("회원목록을 가져옵니다.");
	}
	//회원 등록
	public void insertMember() {
		pl("회원정보를 추가합니다.");
	}
	//회원 수정
	public void updateMember() {
		pl("회원정보를 수정합니다.");
	}
	//회원 삭제
	public void deleteMember() {
		pl("회원정보를 삭제합니다.");
	}
	
}
