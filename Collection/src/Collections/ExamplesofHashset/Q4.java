package Collections.ExamplesofHashset;

import java.util.HashSet;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h = new HashSet<String>();
		
		h.add("Red");
	     h.add("Green");
	     h.add("Black");
	     h.add("White");
	     h.add("Pink");
	     h.add("Yellow");
	     
	     System.out.println("The HashSet: " +h);
	     
	     h.removeAll(h);
	     System.out.println(" Hashset after removing all element" +h);
		

	}

}
