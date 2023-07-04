package Collections.ExamplesofHashset;

import java.util.HashSet;
import java.util.Iterator;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> h=new HashSet<String>();
	     
	     h.add("Red");
	     h.add("Green");
	     h.add("Black");
	     h.add("White");
	     h.add("Pink");
	     h.add("Yellow");
	     
	     Iterator<String> p = h.iterator();
	     
	     while(p.hasNext()) {
	    	 System.out.println(p.next());
	     }
	     
	}

}
