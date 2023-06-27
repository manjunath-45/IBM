package firstpackage;
import java.util.Scanner;
public class sixth {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
         
		System.out.println("enter a num:");
		int num= scanner.nextInt();
		
		long factorial = 1;
		for (int i =2;i<=num;i++)
		{
			factorial *=1;
		}
		System.out.println("Factorial of "+num+"is "+factorial);
		
		scanner.close();

	}

}
