package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
 
@Entity

public class Stock {
	
	@Id
	@Column(name = "name")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	private Double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Stock() {
		super();
	}
	public Stock(String name2, Double price2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stock [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
		
	
}
