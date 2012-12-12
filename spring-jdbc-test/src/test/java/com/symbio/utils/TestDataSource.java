package com.symbio.utils;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestDataSource {
	
	public static DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/quickstart";
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, "root", "root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}

}
