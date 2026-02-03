package com.ibm.springjdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.ibm.springjdbc")
public class DatabaseConfig {

 @Bean
 public DataSource dataSource() {
  HikariDataSource ds = new HikariDataSource();
  ds.setJdbcUrl("jdbc:mysql://localhost:3306/payroll");
  ds.setUsername("Srikar");
  ds.setPassword("Srikar@16122003");
  ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
  return ds;
 }

 @Bean
 public JdbcTemplate jdbcTemplate(DataSource dataSource) {
  return new JdbcTemplate(dataSource);
 }
}

