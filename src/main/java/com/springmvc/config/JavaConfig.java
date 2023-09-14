package com.springmvc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class JavaConfig {
	
	@Autowired
	Environment env;
	
	@Bean("dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("spring.jdbcDriver"));
		dataSource.setUrl(env.getProperty("spring.jdbcUrl"));
		dataSource.setUsername(env.getProperty("spring.jdbcUsername"));
		dataSource.setPassword(env.getProperty("spring.jdbcPassword"));
		
		return dataSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate template=new JdbcTemplate(getDataSource());
		return template;
	}
}
