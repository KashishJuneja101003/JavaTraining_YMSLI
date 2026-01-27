package com.traineeMgmtApp.service;

import com.traineeMgmtApp.entity.Trainee;

public interface TraineeService {
	public void addTrainee(Trainee trainee);
	
	public Trainee getTraineeById(int id);
}
