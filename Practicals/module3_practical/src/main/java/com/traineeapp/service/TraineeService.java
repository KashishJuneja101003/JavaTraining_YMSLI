package com.traineeapp.service;

import org.springframework.stereotype.Service;

import com.traineeapp.dao.TraineeDao;
import com.traineeapp.entity.Trainee;
import com.traineeapp.exception.InvalidTraineeCredentials;
import com.traineeapp.exception.TraineeDataAccessException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TraineeService {
	private final TraineeDao traineeDao;
	
	public void addTrainee(Trainee trainee) {
		if(trainee.getName().equals("") || trainee.getAge() <= 0) {
			throw new InvalidTraineeCredentials("Enter Valid Trainee Credentials");
		}
		
		traineeDao.addTrainee(trainee);
	}
	
	public Trainee findById(Integer id) {
		Trainee trainee = traineeDao.findById(id);
		if (trainee == null) {
		    throw new TraineeDataAccessException("Trainee not found");
		}		
		return trainee;
	}
}
