package com.example.service;

import java.util.List;

import com.example.model.Inventory;

public interface InventoryService {
	
	public Inventory createInventory(Inventory inventory);
	
	public List<Inventory> getAllInventory();

}
