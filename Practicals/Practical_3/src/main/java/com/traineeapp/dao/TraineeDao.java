package com.traineeapp.dao;

import com.traineeapp.entity.Trainee;

public interface TraineeDao {
	void addTrainee(Trainee trainee);
	Trainee findById(int traineeId);
}
