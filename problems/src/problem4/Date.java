package problem4;

public class Date {

	 private int day;
	    private int month;
	    private int year;

	    public Date(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    public boolean isValidMonth() {
	        return (month >= 1 && month <= 12);
	    }

	    public boolean isValidDay() {
	        if (isValidMonth()) {
	            int maxDays = getMaxDaysInMonth();
	            return (day >= 1 && day <= maxDays);
	        }
	        return false;
	    }

	    private int getMaxDaysInMonth() {
	        int maxDays;
	        switch (month) {
	            case 2:
	                if (isLeapYear()) {
	                    maxDays = 29;
	                } else {
	                    maxDays = 28;
	                }
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                maxDays = 30;
	                break;
	            default:
	                maxDays = 31;
	                break;
	        }
	        return maxDays;
	    }

	    private boolean isLeapYear() {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }

	    public Date getNextDay() {
	        int nextDay = day + 1;
	        int nextMonth = month;
	        int nextYear = year;

	        if (isValidMonth()) {
	            int maxDays = getMaxDaysInMonth();

	            if (nextDay > maxDays) {
	                nextDay = 1;
	                nextMonth++;

	                if (nextMonth > 12) {
	                    nextMonth = 1;
	                    nextYear++;
	                }
	            }
	        }

	        return new Date(nextDay, nextMonth, nextYear);
	    }

	    public void displayDate() {
	        System.out.println("Date: " + day + "/" + month + "/" + year);
	    }
}
