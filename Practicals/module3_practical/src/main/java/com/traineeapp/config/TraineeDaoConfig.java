package com.traineeapp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.traineeapp.dao.TraineeDao;
import com.traineeapp.dao.TraineeDaoJdbcImpl;
import com.traineeapp.dao.TraineeDaoJpaImpl;

@Configuration
public class TraineeDaoConfig {

	@Bean
	@ConditionalOnProperty(name = "trainee.dao.type", havingValue = "jdbc")
	TraineeDao jdbcDao(JdbcTemplate jdbcTemplate) {
		System.out.println("Working with JDBC");
		return new TraineeDaoJdbcImpl(jdbcTemplate);
	}
	
	@Bean
	@ConditionalOnProperty(name = "trainee.dao.type", havingValue = "jpa")
	TraineeDao jpaDao() {
		System.out.println("Working with JPA");
		return new TraineeDaoJpaImpl();
	}
}
