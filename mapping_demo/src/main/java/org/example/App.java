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
        	/*
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
         /* session.save(ibm); 
        	Company c= session.get(Company.class, "276c4561-7fae-4b58-815a-27ff241e749e");
        	System.out.println(c);
        	session.getTransaction().commit();
        	System.out.println("company cretaed");
        	*/
        	
        	
        	Employee employee1 = new Employee();
        	employee1.setEmployeeId(11);
        	employee1.setFirstName("ABC1");
        	employee1.setLastName("MNC1");
        	employee1.setEmail("abc1@email.com");
            Company ibm = new Company();
            
            
            Employee employee2 = new Employee();
            employee2.setEmployeeId(21);
        	employee2.setFirstName("XYZ1");
        	employee2.setLastName("GFH1");
        	employee2.setEmail("xyz1@email.com");
        	
            ibm.setCompanyId(UUID.randomUUID().toString());
            ibm.setCompanyName("IBM INDIA");
            ibm.setCompanyAddress(new Address("Bangalore","Karnataka","bangalore","54312"));
        	employee1.setCompany(ibm);
        	employee2.setCompany(ibm);
    
        	session.getTransaction().begin();
        	session.save(employee1);
         	session.getTransaction().commit();
        	session.getTransaction().begin();
        	session.save(employee2);
        	session.getTransaction().commit();
        	System.out.println("employees cretaed");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }

}
