package Collections.exampleoflinkelist;

import java.util.LinkedList;

public class Q6 {
	
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		System.out.println("Original Linkedlist:" +l);
		
		l.addFirst("White");
		
		l.addLast("pink");
		System.out.println(" final linked list :"+l);
	}

}
