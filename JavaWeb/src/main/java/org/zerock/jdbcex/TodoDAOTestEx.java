package org.zerock.jdbcex;

import java.sql.Connection;


import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

class TodoDAOTestEx {
	@Test //이 메소드는 테스트라는 표시
	public void testHikariCP() throws Exception {
		HikariConfig config = new HikariConfig();
		
		//설정
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl("jdbc:mysql://localhost/webdb");
		config.setUsername("webuser");
		config.setPassword("webuser");
		
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("PrepStmtCacheSize", "256");
		config.addDataSourceProperty("PrepStmtCacheSqlLimit", "2048");
		
		//데이터 소스 연결
		HikariDataSource ds = new HikariDataSource(config);
		Connection conn = ds.getConnection();
		
		//연결객체 생성
		System.out.println("데이터 베이스 연결 성공");
		System.out.println(conn);
		conn.close();
		System.out.println("데이터베이스 연결 해제");
	}	
}
