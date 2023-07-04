package Collections.ExamplesofHashset;

import java.util.HashSet;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> h = new HashSet<String>();
		
		     h.add("Red");
		     h.add("Green");
		     h.add("Black");
		     h.add("White");
		     h.add("Pink");
		     h.add("Yellow");
		     
		     System.out.println("The  original HashSet: " +h);
	    
		String[] Array = new String[h.size()];
		h.toArray(Array);
		
		     System.out.println("Array elements: ");
		     for(String element : Array) {
		    	 System.out.println(element);
		     }
	}

}
