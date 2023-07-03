package Collection.examples;

import java.util.ArrayList;
import java.util.List;

public class Q5 {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("Red");
		ls.add("Green");
		ls.add("Orange");
		ls.add("White");
		ls.add("black");
		
		System.out.println(ls);
		
		ls.set(2, "yellow");
        
		System.out.println(ls);
		
	}
	
}
