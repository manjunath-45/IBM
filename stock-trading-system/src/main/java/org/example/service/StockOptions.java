package org.example.service;

import java.util.List;

import org.example.model.Stock;


public interface StockOptions {
	
	List<Stock> getAllStocks();

	Stock getStockByName(String name);

	void createStock(String name, Integer price);

    void createStock(String name, Double price);
}
