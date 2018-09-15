package com.cg.tma.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Trainee")
public class Trainee 
{
	
	@Id
	@Column(name="traineeId")
	@NotNull(message="Id is Mandatory")
	private Integer traineeId;
	@NotEmpty(message="Name is Mandatory")
	@Pattern(regexp="[A-Z][A-Za-z]{3,15}",message="Name should contain letters only <br> Size shold be min 3 and max 15")
	@Column(name="traineeName")
	private String traineeName;
	@NotEmpty(message="Domain is Mandatory")
	@Column(name="traineeDomain")
	private String traineeDomain;
	@NotEmpty(message="Location is Mandatory")
	@Column(name="traineeLocation")
	private String traineeLocation;
	
	public Trainee() 
	{
		
	}

	public Trainee(Integer traineeId, String traineeName, String traineeDomain,
			String traineeLocation) 
	{
		
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}

	public Integer getTraineeId() 
	{
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) 
	{
		this.traineeId = traineeId;
	}

	public String getTraineeName() 
	{
		return traineeName;
	}

	public void setTraineeName(String traineeName) 
	{
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation()
	{
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) 
	{
		this.traineeLocation = traineeLocation;
	}

	@Override
	public String toString() 
	{
		return "Trainee [traineeId=" + traineeId + ", traineeName="
				+ traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + "]";
	}
	
	
	
	
	
}
