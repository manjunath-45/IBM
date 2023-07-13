package org.example.hibernate_demo_3.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter

@Setter
@Entity
public class SpecialEditionCD extends CD {
	

	private String feature;
	public SpecialEditionCD(String cdName,String feature) {
		super(cdName);
		// TODO Auto-generated constructor stub
		this.feature= feature;
	}

	

}
