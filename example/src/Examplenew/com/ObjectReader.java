package Examplenew.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
  
	public static void main(String[] args) {
		try {
		    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("objects.dat"));
		
		    MyClass o1 = (MyClass) inputStream.readObject();
		    MyClass o2 = (MyClass) inputStream.readObject();
		    MyClass o3 = (MyClass) inputStream.readObject();
		    
		  System.out.println(o1);
		  System.out.println(o2);
		  System.out.println(o3);
		    
		    inputStream.close();
		}
		catch (IOException | ClassNotFoundException e )
		{
			e.printStackTrace();
		
		
		}
	
	}
}
