package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.model.Inventory;
import com.example.service.InventoryService;
import com.example.service.InventoryServiceImpl;

public class App
{
	public static void main(String[] args)
	{
      try
      { 
    	  /*
    	  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Inventory.class).buildSessionFactory();
          Session session=sessionFactory.openSession();
          session.getTransaction().begin();
          session.save(new Inventory(103,12,"eraser",110));
          session.getTransaction().commit();
          System.out.println("One Item Saved...");
          */
    	  
    	 
    	  InventoryService service=new InventoryServiceImpl();
    	  
    	  /*
    	  Inventory i = service.createInventory(new Inventory(105,108,"top",65));
    	  System.out.println(i); 
    	  */
    	  
    	  List<Inventory> i =  service.getAllInventory();
    	  for(Inventory ii:i)
    	  {
    		  System.out.println(i);
    	  }
    	
    	  
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
	}
}
