package com.traineeMgmtApp.service;

import com.traineeMgmtApp.dao.TraineeDao;
import com.traineeMgmtApp.dao.TraineeDaoImpl;
import com.traineeMgmtApp.entity.Trainee;
import com.traineeMgmtApp.exception.InvalidBranchException;
import com.traineeMgmtApp.exception.PercentageNotInRangeException;
import com.traineeMgmtApp.exception.TraineeNotFound;

public class TraineeServiceImpl implements TraineeService{
	private final TraineeDao td = new TraineeDaoImpl();
	@Override
	public void addTrainee(Trainee trainee) {
		String branch = trainee.getBranch().toLowerCase();
		double percentage = trainee.getPercentage();
		
		if(percentage < 0 || percentage > 100) {
			throw new PercentageNotInRangeException("Percentage should be between 0 and 100.");
		}
		
		if(!(branch.equals("java") || branch.equals("oracle") || branch.equals("php") || branch.equals("dotnet"))) {
			throw new InvalidBranchException(branch + " is invalid.");
		}
		
		td.addTrainee(trainee);
		
	}

	@Override
	public Trainee getTraineeById(int id) {
	    Trainee trainee = td.findTraineeById(id);
	    if (trainee == null) {
	        throw new TraineeNotFound(
	            "Trainee with Id:" + id + " doesn't exist in the database."
	        );
	    }
	    return trainee;
	}


}
