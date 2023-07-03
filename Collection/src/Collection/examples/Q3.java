package Collection.examples;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		List<String> ls = new ArrayList<String>();
		ls.add("Red");
		ls.add("Green");
		ls.add("Orange");
		ls.add("White");
		ls.add("Black");
		
		System.out.println(ls);
		
		ls.add(0,"pink");
		ls.add(5,"yellow");
		System.out.println(ls);
		
		
	}

}
