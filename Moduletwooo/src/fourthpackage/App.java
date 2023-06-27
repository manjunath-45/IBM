package fourthpackage;


import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class App {

	public static void main(String[] args) {

		Vector<Employee> v = new Vector<Employee>();
		Scanner scanner = new Scanner(System.in);
		EmployeeFactory factory = new EmployeeFactory();
		Employee e;

		int choice = 0;
		do {
			System.out.println("1. Create Employee...");
			System.out.println("2. Display Employee Details...");
			System.out.println("3. Find Employee By Id.");
			System.out.println("0. Exit");
			System.out.print("Enter Your Choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				e = factory.createEmployee();
				v.add(e);
				break;
			case 2:
				Enumeration<Employee> e1 = v.elements();
				while (e1.hasMoreElements()) {
					System.out.println(e1.nextElement());
				}

				break;
			case 3:
				System.out.print("Enter Employee ID: ");
				String id=scanner.next();
				Employee employee = null;
				int count=-1;
				Enumeration<Employee> e2 = v.elements();
				while (e2.hasMoreElements()) {
					employee=e2.nextElement();
					if(employee.getEmployeeId().equals(id))
					{
						System.out.println("found "+employee);
						count++;
						break;
					}
				}
				if(count<0)
				{
					System.out.println("not found");
				}
			
				
				break;
			case 0:
				System.out.println("Bye...!");
				System.exit(1);
				break;
			default:
				System.out.println("Invalid Choice.... Try Again..");
				break;
			}

		} while (choice != 0);

	}

}