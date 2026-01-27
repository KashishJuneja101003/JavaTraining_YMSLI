package com.traineeMgmtApp.dao;

import com.traineeMgmtApp.entity.Trainee;

public interface TraineeDao {
	public void addTrainee(Trainee trainee);
	
	public Trainee findTraineeById(int id);
}
