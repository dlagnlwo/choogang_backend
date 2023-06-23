package org.zerock.jdbcex;

import java.sql.Connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPTestApp {
	public static void main(String[] args) throws Exception {
		// 히카리 커넥션풀 설정파일 만들기
		HikariConfig config = new HikariConfig();
		// 설정을 하는 겨우에는 항목을 구분해야하므로 항상 키 = 값형식
		// 즉 맵형식을 사용한다.
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl("jdbc:mysql://localhost:3306/webdb");
		config.setUsername("webuser");
		config.setPassword("webuser");
		// PreparedsStatement 사용 여부
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		
		//히카리 데이터소스 생성, 디비 종류 상관없음
		HikariDataSource ds = new HikariDataSource(config);
		//커넥션 객체 conn
		//conn = DriverManager가 ds로 바뀜
		Connection conn = ds.getConnection();
		System.out.println("데이터소스에 연결성공!");
		
		System.out.println(conn);
		conn.close();
		System.out.println("데이터소스에 연결해제");
	}
}
