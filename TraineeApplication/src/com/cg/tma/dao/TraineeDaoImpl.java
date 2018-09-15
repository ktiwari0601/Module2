package com.cg.tma.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.cg.tma.entities.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao
{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Trainee> fetchAllTrainee() 
	{
		String jpql="SELECT t FROM Trainee t";
		TypedQuery<Trainee> query = em.createQuery(jpql,Trainee.class);
		return query.getResultList();
	}

	@Override
	public void addTrainee(Trainee trainee) 
	{
		em.persist(trainee);
		
	}

	@Override
	public Trainee deleteTrainee(Integer traineeId) 
	{
		String jpql="SELECT t FROM Trainee t WHERE traineeId=:tid";
		TypedQuery<Trainee> query = em.createQuery(jpql,Trainee.class);
		query.setParameter("tid", traineeId);
		Trainee traineeList=query.getSingleResult();
		em.remove(traineeList);
		return traineeList;
		
		
	}

	@Override
	public Trainee retrieveTrainee(Integer traineeId) 
	{
		String jpql="SELECT t FROM Trainee t WHERE traineeId=:tid";
		TypedQuery<Trainee> query = em.createQuery(jpql,Trainee.class);
		query.setParameter("tid", traineeId);
		Trainee traineeList=query.getSingleResult();
		return traineeList;
		
		
	}

	@Override
	public void modify(Trainee trainee) 
	{
		em.merge(trainee);
		
	}

}
