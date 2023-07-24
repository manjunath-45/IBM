package org.example.service;

import java.util.List;
import java.util.Random;

import org.example.model.Order;
import org.example.model.Stock;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Component

public class OrderOptionsImpl implements OrderOptions {
	
	@Autowired
	private SessionFactory sessFactory;
    
	@Override
	public List<Order> listAllOrders() {
		Session s = sessFactory.openSession();
		s.beginTransaction();
		List<Order> results = s.createQuery("FROM Order O", Order.class).getResultList();
		s.getTransaction().commit();
		return results;
	}

	@Override
	public Order createOrder(Stock stock, Integer quantity, String action) {
		Integer orderNo = new Random().nextInt(1000000);
		double amount = quantity * stock.getPrice();
		
		Double rate = null;
		if ("BUY".equals(action)) {
			rate = 0.5/100;
		} else {
			rate = 1.0/100;
		}
		Double commision = amount * rate;
		Double orderTotal = commision + amount;

		Order order = new Order(orderNo, stock.getName(), stock.getPrice(), action, quantity, amount, commision, orderTotal);

		Session s = sessFactory.openSession();
		s.beginTransaction();
		s.persist(order);
		s.getTransaction().commit();
		return order;

	}

}
