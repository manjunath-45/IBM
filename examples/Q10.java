package Collection.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q10 {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("Red");
		ls.add("green");
		ls.add("orange");
		ls.add("white");
		ls.add("black");
		System.out.println("list before shuffling:\n" +ls);
		Collections.shuffle(ls);
		System.out.println("list after shuffling:\n" +ls);

	}

}
