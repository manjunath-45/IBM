package Collections.exampleoflinkelist;

import java.util.LinkedList;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		LinkedList <String> l = new LinkedList<String>();
		l.add("Red");
		l.add("Green");
		l.add("Black");
		
		System.out.println("Original : "+l);
		
		LinkedList<String> lt = new LinkedList<String>();
		lt.add("white ");
		lt.add("Pink");
		
		l.addAll(1,lt);
		
		System.out.println("LinkedList :" +l);
		
		
	}

}
