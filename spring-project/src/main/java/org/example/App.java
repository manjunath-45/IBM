package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Random;

import org.example.model.Department;
import org.example.model.Employee;
import org.example.model.Location;
import org.springframework.context.ApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        try 
        {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e = context.getBean("employee",Employee.class);
        System.out.println(e);
        Department d = context.getBean("department",Department.class);
        Location l = context.getBean("location",Location.class);
        l.setLocationId(100);
        l.setLocationName("hyd");
        l.setCountry("india");
        d.setDepartementId(101);
        d.setDepartmentName("sales");
        d.setLocation(l);
        e.setEmployeeId(new Random().nextInt(10000));
        e.setEmployeeName("John Doe");
        e.setSalary(20000);
        e.setDepartment(d);
        
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}
