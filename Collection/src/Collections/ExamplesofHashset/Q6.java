package Collections.ExamplesofHashset;

import java.util.HashSet;

public class Q6 {

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
		     
		HashSet <String> ht = new HashSet<String>();
		ht = (HashSet)h.clone();
		System.out.println("cloned Hash Set:"+ht);
		
	}

}
