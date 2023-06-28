package Example.com;
import java.util.Vector;
public class EmployeeServiceImpl extends EmployeeService {
	
	private Vector<Employee> employees;

    public EmployeeServiceImpl() {
        employees = new Vector<>();
    }

    @Override
    void createEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee created successfully!");
    }

    @Override
    void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found!");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    @Override
    void deleteEmployeeById(int id) {
        boolean isDeleted = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                isDeleted = true;
                System.out.println("Employee with ID " + id + " deleted successfully!");
                break;
            }
        }

        if (!isDeleted) {
            System.out.println("Employee with ID " + id + " not found!");
        }
    }

    @Override
    void updateEmployeeById(int id, Employee updatedEmployee) {
        boolean isUpdated = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setSalary(updatedEmployee.getSalary());
                isUpdated = true;
                System.out.println("Employee with ID " + id + " updated successfully!");
                break;
            }
        }

        if (!isUpdated) {
            System.out.println("Employee with ID " + id + " not found!");
        }
    }
	
	
}
