package org.example.hibernate_demo_3.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter


public class InternationalCD extends CD {

	private String language;

	public InternationalCD(String cdName,String language) {
		super(cdName);
		// TODO Auto-generated constructor stub
		this.language=language;
	}

	
	
}
