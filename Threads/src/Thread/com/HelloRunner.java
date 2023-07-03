package Thread.com;

public class HelloRunner implements Runnable{

 @Override
 public void run() {
	 int i =0;
	 
			 while(true)
			 {
				 System.out.println("i="+i++);
				 if(i==50)
				 {
					 break;
				 }
			 }
 }
}
