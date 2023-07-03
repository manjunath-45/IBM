package Collection.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls = new ArrayList<String>();
		ls.add("RED");
		ls.add("Green");
		ls.add("Orange");
		ls.add("white");
		ls.add("black");
		
		System.out.println("list before sort:"+ls);
		Collections.sort(ls);
		System.out.println("list after sort:" +ls);
	}

}
