package lisa.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class H2jdbcConnectionApp {
	// 멤버변수 4개 선언
	// JDBC_DRIVER 라이브러리 파일 이름
	// final = 상수, 문자열의 내용이 고쳐지면 안됨.
	// 상수를 변수에 대입한 기호상수이므로 모두 대문자
	static final String JDBC_DRIVER = "org.h2.Driver";
	// H2 데이터베이스에 연결할 JDBC프로토콜
	//jdbc:서버주소:포트번호:db경로
	static final String DB_URL = 
			"jdbc:h2:C:\\app\\database\\h2\\java2;MODE=MariaDB;DATABASE_TO_UPPER=false";
	// H2 유저아이디
	static final String USER = "";
	// H2 유저패스워드
	static final String PASS = "";

	public static void main(String[] args) {
		// Connetion : 연결객체
		// 데이터베이스서버에 접속을 시더하여
		// 접속이 되면 데이터베이스와 연결상태를 관리
		// 객체변수를 로컬에 선언하면 보통
		// 가르키는 주소없음인 null로 초기화한다.
		Connection conn = null; 
		Statement stmt = null;
		//데이터베이스프로그래밍은 항상 에러에 대비
		
		try {
			// 0. 사용하려고 하는 데이터베이스와 상호작용 
			// (데이터베이스 통신)하는 자바라이브러리(JDBC)를
			// 자바개발툴(라이브러리 폴더)에 등록한다.
			// 1. JDBC 드라이버를 등록
			// 자바로 데이터베이스 프로그램 개발할 때 데이터베이스 관리계층
			// class.for() : 자바에서 외부자바실행파일의 내용을 읽어온다.
			// 자바외부(파일, 네트워크 등)을 읽어올 때
			// 입출력 에러등 관련
			Class.forName(JDBC_DRIVER);
			//2. 데이터베이스에 연결되면
			System.out.println("데이터베이스 서버에 연결중....");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("h2 데이터베이스 연결 성공...");
			//3. 데이터베이스로 명령을 내리고
			//create table을 이용해서 테이블을 새로 생성하는 sql
			//DB에 SQL쿼리를 보낼 Statement(트럭)을 하나 만들어 줌
			stmt = conn.createStatement(); 
			// conn에 속해있는 Statement문이여야 하므로
			// conn에서 생성
			String createSql = "" + 
					"CREATE TABLE register (" +
					"   id    INTEGER NOT NULL, " +
					"   first VARCHAR(100), " +
					"   last  VARCHAR(100), " +
					"   age   INTEGER, " +
					"   PRIMARY KEY(id)" +
					");";
			
			//stmt를 이용해서 db서버 명령실행
			//stmt로 보내는 쿼리명령은 두종류가 있습니다.
			//update query : insert update delete sql
			//select query : select sql
			stmt.executeUpdate(createSql);
			System.out.println("테이블이 주어진 db에 잘 만들어 졌습니다.");
			
			
			//4. 전부 사용했으면 지원 반납.
			stmt.close();
			conn.close();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 열려있는 모든 디비관련 자원을 다 닫아야 한다.
			// 닫는 순서는
			// 1. DB로부터 전송된 레코드셋을 저장한 레코드객체(RecordSet)
			// 레코드객체가 있으면 close()한다.
			// 2. DB로 명령어를 전송하는 객체가 있으면 close()한다.
			// 3. DB와 연결된 연결객체(Connection)를 close()한다.
			// 4. 에러가 발생할 가능성이 크므로 예외처리가 필요하다.
			// 1번 2번 처리를 여기서 한다.
			try {
				// stmt 종료가 안될 수 있으므로 확실히 종료
				if(stmt != null) {
					stmt.close();
				}
			}catch(SQLException se) {
				//마지막으로 끝나는 명령블록이기 때문에 아무 에러처리 안해도 됨.
			}
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException se) {
				
			}
		}
		System.out.println("finish");
	}

}
