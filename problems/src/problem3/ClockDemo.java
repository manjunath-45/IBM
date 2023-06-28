package problem3;
import java.util.Scanner;

public class ClockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter hours (0-23): ");
	        int hours = scanner.nextInt();

	        System.out.print("Enter minutes (0-59): ");
	        int minutes = scanner.nextInt();

	        System.out.print("Enter seconds (0-59): ");
	        int seconds = scanner.nextInt();

	        Clock clock = new Clock(hours, minutes, seconds);
	        clock.displayTime();

	        System.out.print("Enter new hours (0-23) to update AM/PM: ");
	        int updatedHours = scanner.nextInt();
	        clock.setAMPM(updatedHours);
	        clock.displayTime();

	        scanner.close();
	    }

	}


