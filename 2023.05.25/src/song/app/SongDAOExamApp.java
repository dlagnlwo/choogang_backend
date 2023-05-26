package song.app;

import song.model.SongDAO;

public class SongDAOExamApp {
	public static void main(String[] args) {
		SongDAO songdao = new SongDAO();
		songdao.getConn();
		
		//songdao객체가 디비서버로 연결
		//객체를 이용해서 sql문 처리
		//ResultSet을 반환하면
		//화면에 보여줌(view기능)
		//마지막 close();
		songdao.close(null);
	}
}
