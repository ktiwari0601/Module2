package com.cg.tma.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tma.dao.TraineeDao;
import com.cg.tma.entities.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService 
{

	@Autowired
	TraineeDao tdao;
	@Override
	public List<Trainee> fetchAllTrainee() 
	{
		return tdao.fetchAllTrainee();
	}

	@Override
	public void addTrainee(Trainee trainee) 
	{
		tdao.addTrainee(trainee);

	}

	@Override
	public Trainee deleteTrainee(Integer traineeId) 
	{
		return tdao.deleteTrainee(traineeId);
	}

	@Override
	public Trainee retrieveTrainee(Integer traineeId)
	{
		return tdao.retrieveTrainee(traineeId);
	}

	@Override
	public void modify(Trainee trainee) 
	{
		tdao.modify(trainee);
		
	}

}
