package org.example.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="company_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	@Id
	@Column(name="company_id")
	private String CompanyId;
	@Column(name="company_name")
	public String CompanyName;
	@Embedded
	public Address CompanyAddress;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "company")
	//@JoinColumn(name= " company_id")
	private Collection<Employee> employees;

}
