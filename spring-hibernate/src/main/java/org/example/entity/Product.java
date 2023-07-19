package org.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name ="my_product_table_spring")
public class Product {
    @Id
	private String productId;
    private String productName;
	public Product(String productId, String productName) {

		this.productId = productId;
		this.productName = productName;
	}
	
}
