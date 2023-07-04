package com.example1;



public class TestQueue implements Runnable {
private Myqueue myqueue;
	
	{
		myqueue=new Myqueue();
	}
	
	@Override
	public void run() {
		
		myqueue.push('a');
		myqueue.push('b');
		myqueue.push('b');
		myqueue.push('b');
		myqueue.push('b');
		myqueue.push('b');
		myqueue.push('b');
		myqueue.push('b');
		System.out.println(myqueue.pop());
		System.out.println(myqueue.pop());
		System.out.println(myqueue.pop());
		System.out.println(myqueue.pop());
	}
	

}
