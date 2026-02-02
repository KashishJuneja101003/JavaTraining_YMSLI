package com.traineeapp.dao;

import com.traineeapp.entity.Trainee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;

@Transactional
@NoArgsConstructor
public class TraineeDaoJpaImpl implements TraineeDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
	}

	@Override
	public Trainee findById(int traineeId) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		return trainee;
	}

}
