package Collection.examples;

import java.util.ArrayList;
import java.util.List;

public class Q7 {
	
	public static void main(String[] args) {
		
		List<String> ls  = new ArrayList<String>();
		
		ls.add("red");
		ls.add("green");
		ls.add("orange");
		ls.add("white");
		ls.add("black");
		
		if(ls.contains("red"))
		{
			System.out.println("found");
		
		}
		else 
		{
			System.out.println("not found");
		}
	}

}
