package Collection.examples;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		
		List<String> ls= new ArrayList<String>();
		ls.add("RED");
		ls.add("GREEN");
		ls.add("Oraange");
		ls.add("white");
		ls.add("black");
		
		for(String element: ls)
		{
			System.out.println(element);
		}
		
	}
}
