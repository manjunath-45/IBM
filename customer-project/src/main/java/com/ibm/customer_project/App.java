package com.ibm.customer_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.ibm.customer_project.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException , ClassNotFoundException
    
    {
    	FileInputStream  inputStream=null;
	    FileOutputStream  outputStream=null;
      	ObjectOutputStream output=null;
      	ObjectInputStream input=null;
      	
       
      	try
        {
        	 inputStream = new FileInputStream("data.ser");
        	  outputStream = new FileOutputStream("data.ser");
        	 output = new ObjectOutputStream(outputStream);
        	 input = new ObjectInputStream(inputStream);
        	 
        	Product product = new Product("pencil", 1.2 , 1);
        	Product product1 = new Product("pen", 1.2, 2);
        	List<Product> list = new ArrayList<>();
        	list.add(product);
        	list.add(product1);
        	output.writeObject(list);
        	Object o = input.readObject();
        	List<Product> list1 =null;
        	if(o instanceof List) 
        	{
        		list1= (List<Product>)o;
        	}
        
        	for(Product p:list1)
        	{
        		System.out.println(p);
        		
        	}
        	
        	
        } 
        catch ( IOException e )
        {
        	
          e.printStackTrace();
        }
      	finally {
      		input.close();
      		output.close();
      		
      	}
       
    }
}
