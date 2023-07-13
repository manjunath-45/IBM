package com.example;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.example.model.Car;
import com.example.model.MotorCycle;
import com.example.model.RoadVehicle;

public class App 
{
    public static void main( String[] args )
    {
    	
    	try 
    	{
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(RoadVehicle.class).addAnnotatedClass(Car.class).addAnnotatedClass(MotorCycle.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.getTransaction().begin();
       /* session.save(new RoadVehicle());
        session.getTransaction().commit();*/
      session.save(new Car());
    
        session.save(new MotorCycle());
        session.getTransaction().commit();
        System.out.println("done");
        
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    
    }
}
