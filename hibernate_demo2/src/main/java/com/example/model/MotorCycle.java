package com.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString

@DiscriminatorValue("MOTORCYCLE")
@Table(name="motorcycle_table")
public class MotorCycle  extends RoadVehicle{
	@Enumerated(EnumType.STRING)
	public final AccelerationType accelerationType=AccelerationType.THROTTLE;
	
    public MotorCycle()
    {
    	super();
    	numWheels=2;
    	numPassenegers=2;
    	make="Bajaj";
    	model="Avenger";
    }
}
