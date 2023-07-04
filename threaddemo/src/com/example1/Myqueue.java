package com.example1;

public class Myqueue {
	
	private int front= -1;
	private int rear = -1;
	
	private char[] info=new char[6];
	
	
	public  void push(char item)
	{
		synchronized (this) {
		
			info[++rear]=item;
		}
		
	}
	
	public synchronized char pop()
	{
		return info[front--];
	}

}
