package member;

//데이터 클래스 
/*회원관리 프로그램에 있어야할 필드
 * id, pw
 * 일련번호 no
 */
public class Member {
	String id;
	String password;
	private int no; //일련번호
	
	//회사 이름을 백반명이상이 쓰니까 공유해야됨.
	//그러므로 static
	static String companyName;
	
}
