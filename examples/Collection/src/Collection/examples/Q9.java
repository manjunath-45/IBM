package Collection.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		System.out.println("List1:" +List1);
		
		List<String> List2 = new ArrayList<String>();
		List2.add("a");
		List2.add("b");
		List2.add("c");
		List2.add("d");
		System.out.println("List2:" +List2);
		
		Collections.copy(List1, List2);
		System.out.println("copy list1 to list2, \nAfter copy: ");
		
		System.out.println("List1 : "+List1);
		System.out.println("List2 : "+List2);
		
	}

}
