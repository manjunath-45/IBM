package Example.com;

public class Tester {

	
	public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        Employee emp1 = new Employee(1, "John", "Doe", "john@example.com", 50000);
        Employee emp2 = new Employee(2, "Jane", "Smith", "jane@example.com", 60000);
        Employee emp3 = new Employee(3, "Michael", "Johnson", "michael@example.com", 70000);

        // Create employees
        employeeService.createEmployee(emp1);
        employeeService.createEmployee(emp2);
        employeeService.createEmployee(emp3);

        // Display all employees
        System.out.println("All Employees:");
        employeeService.displayAllEmployees();
        System.out.println();

        // Update an employee's salary
        int employeeIdToUpdate = 2;
        Employee updatedEmployee = new Employee(employeeIdToUpdate, "Jane", "Smith", "jane@example.com", 65000);
        employeeService.updateEmployeeById(employeeIdToUpdate, updatedEmployee);

        // Display all employees after update
        System.out.println("All Employees after update:");
        employeeService.displayAllEmployees();
        System.out.println();

        // Delete an employee
        int employeeIdToDelete = 1;
        employeeService.deleteEmployeeById(employeeIdToDelete);

        // Display all employees after delete
        System.out.println("All Employees after delete:");
        employeeService.displayAllEmployees();
    }

}
