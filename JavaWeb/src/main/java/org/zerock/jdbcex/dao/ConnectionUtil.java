package org.zerock.jdbcex.dao;

import java.sql.Connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public enum ConnectionUtil {
	//싱글톤패턴 적용하여 언제든지 객체가 한번만 생성되도록 enum클래스에 INSTANCE
	//다른 클래스에서 INSTANCE를 부름
	//ex) ConnectionUtil.INSTANCE.getConnection()
	INSTANCE;
	//히카리 데이터 소스 ds변수 생성
	//멤버변수
	private HikariDataSource ds;
	
	//생성자
	ConnectionUtil() {
		HikariConfig config = new HikariConfig();
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl("jdbc:mysql://localhost:3306/webdb");
		config.setUsername("webuser");
		config.setPassword("webuser");
		
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "256");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		
		ds = new HikariDataSource(config);
	}
	
	//getConnection()메소드만 부르면 jdbc 쓸수있음
	public Connection getConnection() throws Exception {
		return ds.getConnection();
	}
}
