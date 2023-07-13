package com.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.ToString;

@Entity
@DiscriminatorValue("CAR")
@ToString
public class Car extends RoadVehicle  {
	
	@Enumerated(EnumType.STRING)
	public final AccelerationType accelerationType=AccelerationType.THROTTLE;
	public Car()
	{
		super();
    	numWheels=4;
    	numPassenegers=5;
    	make="Maruti";
    	model="Baleno";
	}

}
