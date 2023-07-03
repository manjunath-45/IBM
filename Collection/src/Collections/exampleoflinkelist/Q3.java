package Collections.exampleoflinkelist;

import java.util.Iterator;
import java.util.LinkedList;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("Red");
		ls.add("Green");
		ls.add("Black");
		ls.add("white");
		ls.add("pink");
		
		Iterator p = ls.listIterator(1);
		
		while( p.hasNext())
		{
			System.out.println(p.next());
		}
		
		

	}

}
