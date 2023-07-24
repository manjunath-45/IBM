package org.example.service;

import java.util.List;

import org.example.model.Order;
import org.example.model.Stock;

public interface OrderOptions {

	List<Order> listAllOrders();
	Order createOrder(Stock stock, Integer quantity, String action);
}
