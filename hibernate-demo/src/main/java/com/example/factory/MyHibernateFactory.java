package com.example.factory;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.model.Inventory;
import com.example.model.Product;

public class MyHibernateFactory {
   
	private static SessionFactory sessionFactory;
	{
		
	}
	public static SessionFactory getSessionFactory()
	
	{

		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Inventory.class).addAnnotatedClass(Product.class).buildSessionFactory();
		return sessionFactory;
	}
}
