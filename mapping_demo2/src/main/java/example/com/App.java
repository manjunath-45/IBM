package example.com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.com.model.Course;
import example.com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       try {
    	   SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
    			   .addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();
       	Session session =sessionFactory.openSession();
    	   Course course1 = new Course();
    	   course1.setCourseName("react");
    	   Course course2 = new Course();
    	   course2.setCourseName("jeakins");
    	   Student student1 = new Student();
    	   student1.setName("rahul");
           Student student2 = new Student();
           student2.setName("brian");
           
           List<Course>  courses = new ArrayList<Course>();
         
           courses.add(course1);
           courses.add(course2);
         //  student1.setCourses(courses);
           student2.setCourses(courses);
          
           session.getTransaction().begin();
       //    session.save(student1);
           session.save(student2);
           
          
           session.getTransaction().commit();
           System.out.println("dono");
           
       }
       catch(Exception e) {
    	   
       }
    }
}
