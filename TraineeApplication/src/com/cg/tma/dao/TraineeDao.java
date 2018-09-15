package com.cg.tma.dao;

import java.util.List;

import com.cg.tma.entities.Trainee;



public interface TraineeDao
{
	List<Trainee> fetchAllTrainee();
	void addTrainee(Trainee trainee);
	Trainee deleteTrainee(Integer traineeId);
	Trainee retrieveTrainee(Integer traineeId);
	void modify(Trainee trainee);
}
