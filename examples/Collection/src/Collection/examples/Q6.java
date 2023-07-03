package Collection.examples;

import java.util.ArrayList;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls = new ArrayList<String>();
		
		ls.add("red");
		ls.add("green");
		ls.add("orange");
		ls.add("white");
		ls.add("black");
		
		System.out.println(ls);

		ls.remove(2);
		System.out.println("after removing third element:" +ls);
		
	}

}
