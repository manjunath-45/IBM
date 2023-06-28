package Example.com;
import java.util.Vector;

public class Employee {
	
	 private int id;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private double salary;

	    public Employee(int id, String firstName, String lastName, String email, double salary) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.email = email;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
	                + ", salary=" + salary + "]";
	    }

}
