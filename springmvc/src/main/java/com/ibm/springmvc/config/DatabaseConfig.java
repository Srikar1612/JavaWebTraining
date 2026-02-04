package com.ibm.springmvc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.ibm.springmvc")
public class DatabaseConfig {
	@Bean
	public DataSource dataSource() {
		HikariDataSource hikariDataSource = new HikariDataSource();
		hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/springmvc");
		hikariDataSource.setUsername("Srikar");
		hikariDataSource.setPassword("Srikar@16122003");
		hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return hikariDataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
