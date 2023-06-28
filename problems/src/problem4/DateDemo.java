package problem4;
import java.util.Scanner;

public class DateDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        Date date = new Date(day, month, year);
        date.displayDate();

        System.out.println("Is valid month? " + date.isValidMonth());
        System.out.println("Is valid day? " + date.isValidDay());

        Date nextDay = date.getNextDay();
        nextDay.displayDate();

        scanner.close();
    }
}