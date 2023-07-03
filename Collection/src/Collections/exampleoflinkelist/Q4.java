package Collections.exampleoflinkelist;

import java.util.Iterator;
import java.util.LinkedList;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		LinkedList<String> l = new LinkedList<String>();
		 
		l.add("red");
		l.add("green");
		l.add("black");
		l.add("pink");
		l.add("orange");
		
		System.out.println(" current order :" +l);
		
		Iterator i = l.descendingIterator();
		
		System.out.println("reverse order : ");
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		
	}

}
