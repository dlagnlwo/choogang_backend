package org.zerock.jdbcex.dao;

import java.sql.Connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public enum ConnectionUtil {
		INSTANCE;
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
		
		public Connection getConnection() throws Exception {
			return ds.getConnection();
		}
}