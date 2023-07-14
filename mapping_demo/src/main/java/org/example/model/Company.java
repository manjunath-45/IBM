package org.example.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="company_table")
@Data
public class Company {
	@Id
	@Column(name="company_id")
	private String CompanyId;
	@Column(name="company_name")
	public String CompanyName;
	@Embedded
	public Address CompanyAddress;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Collection<Employee> employees;

}
