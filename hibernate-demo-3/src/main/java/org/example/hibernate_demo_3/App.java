package org.example.hibernate_demo_3;

import org.example.hibernate_demo_3.model.CD;
import org.example.hibernate_demo_3.model.InternationalCD;
import org.example.hibernate_demo_3.model.SpecialEditionCD;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
          SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(InternationalCD.class).addAnnotatedClass(CD.class).addAnnotatedClass(SpecialEditionCD.class).buildSessionFactory();
          Session session = sessionFactory.openSession();
         InternationalCD iCd=new InternationalCD("Name A" ,"French");
          SpecialEditionCD sCD=new SpecialEditionCD("Name B" ,"3D");
          session.getTransaction().begin();
        session.save(iCd);
          session.save(sCD);
          session.getTransaction().commit();
          System.out.println("done");
     }
}
