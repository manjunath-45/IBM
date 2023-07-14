package org.example.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
@ToString

public class Address {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String zipCode;
}
