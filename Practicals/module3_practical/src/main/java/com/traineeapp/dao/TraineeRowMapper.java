package com.traineeapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.traineeapp.entity.Trainee;

public class TraineeRowMapper implements RowMapper<Trainee> {
	@Override
	public Trainee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Trainee trainee = new Trainee();
		trainee.setId(rs.getInt("id"));
		trainee.setAge(rs.getInt("age"));
		trainee.setName(rs.getString("name"));
		return trainee;

	}
}
