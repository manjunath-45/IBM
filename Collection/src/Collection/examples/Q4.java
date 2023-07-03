package Collection.examples;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls = new ArrayList<String>();
		ls.add("Red");
		ls.add("green");
		ls.add("orange");
		ls.add("white");
		ls.add("black");
		
		System.out.println(ls);
		
		String element = ls.get(0);
		System.out.println("first elemnt:" + element);
		
		String element1 = ls.get(1);
		System.out.println("Second element:" +element1);
		

	}

}
