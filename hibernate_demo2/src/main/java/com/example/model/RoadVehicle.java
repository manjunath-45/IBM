package com.example.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;

@Entity(name = "RoadVehicleSingle")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name= "road_vehicle_table")
@DiscriminatorColumn(name="VEHICLE_TYPE",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("ROAD_VEHICLE")
@Setter 
@Getter
@AllArgsConstructor

public class RoadVehicle {
	  public enum AccelerationType {PADDLE,THROTTLE};
	  
      @Id
      @Column(name="vehicle_id")
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	  protected int id;
      @Column(name="number_of_passengers")
	  protected int numPassenegers;
      @Column(name="number_of_wheels")
      protected int numWheels;
      @Column(name="making_company")
	  protected String make;
      @Column(name ="model_name")
	  protected String model;
	  
	public RoadVehicle() {
		super();
	}
  
}
