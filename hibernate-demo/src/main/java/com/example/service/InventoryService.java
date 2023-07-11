package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Inventory;

public interface InventoryService {
	
	public Inventory createInventory(Inventory inventory);
	
	public List<Inventory> getAllInventory();

	public Inventory getAllnventory(int inventoryId);
	
	public List<Inventory> getInventoryByProductName(String productName);
	
	public Inventory updateInventoryById(int inventoryId, Inventory inventory);
	
	public void deleteInventory(int inventoryid);
	
}
