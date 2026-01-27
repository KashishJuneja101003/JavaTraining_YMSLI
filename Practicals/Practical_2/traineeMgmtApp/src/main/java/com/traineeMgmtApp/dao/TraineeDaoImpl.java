package com.traineeMgmtApp.dao;

import com.traineeMgmtApp.entity.Trainee;
import com.traineeMgmtApp.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class TraineeDaoImpl implements TraineeDao {

	@Override
	public void addTrainee(Trainee trainee) {
		EntityManager em = JpaUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(trainee);
			em.getTransaction().commit();

		} finally {
			em.close();
		}

	}

	@Override
	public Trainee findTraineeById(int id) {
		EntityManager em = JpaUtil.getEntityManager();
		Trainee trainee = null;
		String sql = "Select t from Trainee t where t.id = :id";

		try {
			TypedQuery<Trainee> query = em.createQuery(sql, Trainee.class);
			query.setParameter("id", id);
			trainee = query.getSingleResult();			
		} catch (NoResultException e) {
			return null;
		} 
		finally {
			em.close();
		}
		return trainee;
	}

}