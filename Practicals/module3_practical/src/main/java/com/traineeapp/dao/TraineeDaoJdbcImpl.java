package com.traineeapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.traineeapp.entity.Trainee;
import com.traineeapp.exception.TraineeDataAccessException;

public class TraineeDaoJdbcImpl implements TraineeDao {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public TraineeDaoJdbcImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		String sql = "INSERT INTO trainees(name, age) VALUES (?, ?)";
		try {
			jdbcTemplate.update(sql, trainee.getName(), trainee.getAge());

		} catch (Exception e) {
			throw new TraineeDataAccessException("JDBC update operation failed");
		}
	}

	@Override
	public Trainee findById(int traineeId) {
		String sql = "SELECT * FROM trainees WHERE id = ?";
		Trainee trainee;
		try {
			trainee = jdbcTemplate.queryForObject(sql, new TraineeRowMapper(), traineeId);
		} catch (Exception e) {
			throw new TraineeDataAccessException("JDBC queryForObject operation failed");
		}

		return trainee;
	}

}
