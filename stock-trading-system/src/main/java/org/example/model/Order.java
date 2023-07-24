package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="orders")

public class Order {


	
	@Id
	private Integer orderNo;
	@Column(name="stock")
	private String stockName;
	@Transient
	private Double stockprice;
	private String action;
	private Integer quantity;
	private Double amount;
	private Double commision;
	private Double orderTotal;
	
	public Order(Integer orderNo2, String name, Double price, String action2, Integer quantity2, double amount2,
			Double commision2, Double orderTotal2) {
		
	}
}
