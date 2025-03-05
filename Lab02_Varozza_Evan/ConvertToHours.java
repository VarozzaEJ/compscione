import java.util.Scanner;

public class ConvertToHours {
    public static void main(String[] args) {
        int totalSeconds, hours, minutes, seconds, remainingSeconds;
        double fractionalHours;

        final int NUM_SECONDS_IN_MINUTE = 60;
        final int NUM_SECONDS_IN_HOUR = 3600;


        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter total number of seconds, must be greater than 0.");
        totalSeconds = keyboardInput.nextInt();

        hours = totalSeconds / NUM_SECONDS_IN_HOUR;
        remainingSeconds = totalSeconds % NUM_SECONDS_IN_HOUR;
        minutes = remainingSeconds / NUM_SECONDS_IN_MINUTE;
        seconds = remainingSeconds % NUM_SECONDS_IN_MINUTE;
        fractionalHours = (double)totalSeconds / (double) NUM_SECONDS_IN_HOUR;

        System.out.println("Total number of seconds entered: " + totalSeconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        System.out.println("Fractional hours: " + fractionalHours);
        
        keyboardInput.close();
    }
}
