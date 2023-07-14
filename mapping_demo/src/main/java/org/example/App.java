package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import org.example.model.Address;
import org.example.model.Company;
import org.example.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        try 
        {
        	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Company.class).buildSessionFactory();
        	Session session =sessionFactory.openSession();
        	Employee employee1 = new Employee(new Random().nextInt(10000),"John","Doe","john@gmail.com");
        	Employee employee2 = new Employee(new Random().nextInt(10000),"Marry","public","marry@gmail.com");
        	Employee employee3 = new Employee(new Random().nextInt(10000),"Rahul","Dravid","rahul@gmail.com");
        	

            Company ibm = new Company();
            ArrayList<Employee> list= new ArrayList<Employee>();
            list.add( employee1);
            list.add( employee2);
            list.add( employee3);
            ibm.setCompanyId(UUID.randomUUID().toString());
            ibm.setCompanyName("IBM INDIA");
            ibm.setCompanyAddress(new Address("Bangalore","Karnataka","bangalore","54312"));
        	ibm.setEmployees(list);
        	session.getTransaction().begin();
        	session.save(ibm);
        	session.getTransaction().commit();
        	System.out.println("company cretaed");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }

}
