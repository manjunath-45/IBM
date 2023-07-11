package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.model.Inventory;
import com.example.model.Product;
import com.example.service.InventoryService;
import com.example.service.InventoryServiceImpl;

public class App
{
	public static void main(String[] args)
	{
      try
      { 
    	 /* 
    	  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Inventory.class).addAnnotatedClass(Product.class).buildSessionFactory();
          Session session=sessionFactory.openSession();
          session.getTransaction().begin();
          session.save(new Inventory(110,13,"rat",110));
          session.save(new Product(1,"bat",245));
          session.getTransaction().commit();
          System.out.println("One Item Saved...");
          
    	  */
    	 
    	  InventoryService service=new InventoryServiceImpl();
    	  
    	  /*
    	  Inventory i = service.createInventory(new Inventory(105,108,"top",65));
    	  Inventory j = service.createProduct(new Product(2,"top",65));
    	  System.out.println(i); 
    	  System.out.println(j); 
    	  */
          
    	  
    	 /*
    	   List<Inventory> i =  service.getAllInventory();
    	  for(Inventory ii:i)
    	  {
    		  System.out.println(i);
    	  }
    	  
    	  List<Product> j =  service.getAllProduct();
    	  for(Inventory jj:j)
    	  {
    		  System.out.println(j);
    	  }
    	*/
    	  
          
    	/* Inventory  i = service.getAllnventory(101);
    	 if(i==null)
    	 {
    		 System.out.println("no such is food ");
    		 
    	 }
    	 else 
    	 {
    		 System.out.println(i);
    	 }
    	 
    	 
    	 Inventory  j = service.getAlProduct(101);
    	 if(j==null)
    	 {
    		 System.out.println("no such is product ");
    		 
    	 }
    	 else 
    	 {
    		 System.out.println(j);
    	 }
    	  */
    	  
          
          
    	 /* 
    	  * 
    	  List<Inventory> list=service.getInventoryByProductName("Laptop");
    	  
    	  for(Inventory i:list)
    	  {
    		System.out.println(i);  
    	  }
    	    List<Product> list=service.getProductByName("mobile");
    	  
    	  for(Product j:list)
    	  {
    		System.out.println(j);  
    	  }
    	  */
          
    	/*   
    	  Inventory i=service.updateInventoryById(100, new Inventory(107,"desktop",6798));
    	  System.out.println(i);
    	  
    	  if(i==null) 
    	  {
    		  System.out.println("unable to update ");
    	  }
    	  else 
    	  {
    		  System.out.println("updated");
    	  }
    	  
    	  */
          
    	  service.deleteInventory(100);
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
	}
}
