package Collections.exampleoflinkelist;

import java.util.LinkedList;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList< String> l = new LinkedList<String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		
		System.out.println("originanl linkedlist: " +l);
		
		l.offerLast("pink");
		System.out.println("Final Linkedlist: " +l);

	}

}
