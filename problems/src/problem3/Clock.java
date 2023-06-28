package problem3;

public class Clock {
	
		 private int hours;
		    private int minutes;
		    private int seconds;
		    private String meridiem;

		    public Clock(int hours, int minutes, int seconds) {
		        if (isValidTime(hours, minutes, seconds)) {
		            this.hours = hours;
		            this.minutes = minutes;
		            this.seconds = seconds;
		            this.meridiem = determineMeridiem(hours);
		        } else {
		            System.out.println("Invalid time entered!");
		        }
		    }

		    private boolean isValidTime(int hours, int minutes, int seconds) {
		        return (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60);
		    }

		    private String determineMeridiem(int hours) {
		        return (hours >= 12) ? "PM" : "AM";
		    }

		    public void setAMPM(int hours) {
		        if (hours >= 0 && hours <= 24) {
		            this.hours = hours;
		            this.meridiem = determineMeridiem(hours);
		        } else {
		            System.out.println("Invalid hour entered!");
		        }
		    }

		    public void displayTime() {
		        String formattedHours = String.format("%02d", hours);
		        String formattedMinutes = String.format("%02d", minutes);
		        String formattedSeconds = String.format("%02d", seconds);
		        System.out.println("Time: " + formattedHours + ":" + formattedMinutes + ":" + formattedSeconds + " " + meridiem);
		    }

	}


