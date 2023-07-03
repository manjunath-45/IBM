package Thread.com;

public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		HelloRunner r = new HelloRunner();
		Thread t1 = new Thread(r);
		t1.start();
		Thread t2 = new Thread(r);
		t2.start();
	}

}
