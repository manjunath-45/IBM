package org.example;

import java.util.UUID;


import org.example.config.SpringConfig;
import org.example.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        try 
        {
        	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        	SessionFactory sessionFactory = context.getBean("sessionFactory",SessionFactory.class);
        	Session session = sessionFactory.openSession();
        	session.getTransaction().begin();
        	session.save(new Product(UUID.randomUUID().toString(),"Pencil"));
        	session.getTransaction().commit();
        	System.out.println("one product created");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}
