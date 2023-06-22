package com.mysql.cj.jdbc.dao;

import java.sql.Connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public enum testConnection {
	INSTANCE;
	HikariDataSource ds;
	
	testConnection(){
		HikariConfig config = new HikariConfig();
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl("jdbc:mysql://localhost/webdb");
		config.setUsername("webuser");
		config.setPassword("webuser");
		
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "256");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		ds = new HikariDataSource(config);
	}
	public Connection getConn() throws Exception {
		return ds.getConnection();
	}
	
	
}
