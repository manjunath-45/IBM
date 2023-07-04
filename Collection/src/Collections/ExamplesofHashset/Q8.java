package Collections.ExamplesofHashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q8 {

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
		     
		Set<String> t = new TreeSet<String>(h);
		
		System.out.println("TreeSet elements:");
		for(String element : t) {
			System.out.println(element);		}
	}

}
