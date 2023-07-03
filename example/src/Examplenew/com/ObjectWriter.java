package Examplenew.com;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriter {
	
	public static void main(String[] args) {
		
		try {
		    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objects.dat"));
		
		    MyClass o1 = new MyClass("o1");
		    MyClass o2 = new MyClass("o2");
		    MyClass o3 = new MyClass("o3");
		    
		    outputStream.writeObject(o1);
		    outputStream.writeObject(o2);
		    outputStream.writeObject(o3);
		    
		    outputStream.close();
		}
		catch (IOException e )
		{
			e.printStackTrace();
		
		
		}
	
		
	}

}
