package com.example1;

public class Tester {
	
	public static void main(String[] args) {
		TestQueue s = new TestQueue();
		Thread t = new Thread(s);
		t.start();
		Thread t1 = new Thread(s);
		t1.start();

}


}
