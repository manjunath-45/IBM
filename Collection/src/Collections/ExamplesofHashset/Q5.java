package Collections.ExamplesofHashset;

import java.util.HashSet;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet<String> h = new HashSet<String>();
		h.add("red");
		h.add("Green");
		h.add("Black");
		h.add("white");
		h.add("pink");
		h.add("Yellow");
		
		System.out.println("origianl hashset : " + h);
		System.out.println("checking the above array list is empty or not! " + h.isEmpty());
		System.out.println("remove all the element from hashset: ");
		h.removeAll(h);
		System.out.println("after removing all elements : " + h);
		
	}

}
