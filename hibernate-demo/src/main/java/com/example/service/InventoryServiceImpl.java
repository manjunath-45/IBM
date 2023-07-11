package com.example.service;

import java.util.List;


import javax.persistence.TypedQuery;
import javax.persistence.Parameter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.example.factory.MyHibernateFactory;
import com.example.model.Inventory;

public class InventoryServiceImpl implements InventoryService {

	
	private SessionFactory sessionFactory;
	
	private Session session=null;
	{
		sessionFactory=MyHibernateFactory.getSessionFactory();
	}
	@Override
	public Inventory createInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(inventory);
		session.getTransaction().commit();
		return inventory;
	}
	@Override
	public List<Inventory> getAllInventory() {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		TypedQuery<Inventory> query = session.createQuery("FROM Inventory I" , Inventory.class);
		List<Inventory> list =query.getResultList();
		return list;
	}
	@Override
	public Inventory getAllnventory(int inventoryId) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		Inventory i = session.find(Inventory.class, inventoryId);
		return i;
	}
	@Override
	public List<Inventory> getInventoryByProductName(String productName) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		TypedQuery<Inventory> query = session.createQuery("FROM Inventory I where I.productName=pName",Inventory.class);
		query.setParameter("pName", productName);
		
		return query.getResultList();
	}
	@Override
	public Inventory updateInventoryById(int inventoryId,Inventory inventory) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		Inventory i = session.get(Inventory.class, inventoryId);
		session.getTransaction().commit();
		if(i==null)
		{
			System.out.println("no such id found to update");
			return null;
			
		}
		else 
		{
			
			i.setAvailable(inventory.getAvailable());
			i.setProductId(inventory.getProductId());
			i.setProductName(inventory.getProductName());
			session.getTransaction().begin();
			session.merge(i);
			session.getTransaction().commit();
			return i;
			
		}
		
	}
	@Override
	public void deleteInventory(int inventoryId) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		Inventory i = session.get(Inventory.class, inventoryId);
		session.getTransaction().commit();
		if(i==null)
		{
			System.out.println("no such id found to update");
			
		}
		else 
		{
			session.getTransaction().begin();
			session.remove(i);
			session.getTransaction().commit();
			System.out.println("done");
		}
		
	}
	
	

}
