package problems;
import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the earning: ");
		double earning = scanner.nextDouble();
		
		Employee employee = new RegularEmployee(earning);
		double taxAmount = employee.calculateIncomeTax();
		
		System.out.println("Income tax is :" + taxAmount);
		

	}

}
