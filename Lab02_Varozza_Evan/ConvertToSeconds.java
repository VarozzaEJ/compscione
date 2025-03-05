import java.util.Scanner;

public class ConvertToSeconds {
    public static void main(String[] args) {
        //Variable Declarations
        int hours;
        int mins;
        int seconds;
        int totalSeconds;

        //Constant Declarations
        final int NUM_SECONDS_IN_MINUTE;
        final int NUM_MINS_IN_HOUR;
        
        //Variable Assignments
        NUM_SECONDS_IN_MINUTE = 60;
        NUM_MINS_IN_HOUR = 60;

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter the number of hours, must be greater than or equal to 0.");
        hours = keyboardInput.nextInt();
        
        System.out.println("Enter the number of minutes, must be between 0 and 60.");
        mins = keyboardInput.nextInt();

        System.out.println("Enter the number of seconds, must be between 0 and 60.");
        seconds = keyboardInput.nextInt();



        totalSeconds = (((hours * NUM_MINS_IN_HOUR) * NUM_SECONDS_IN_MINUTE) + seconds + (mins * NUM_SECONDS_IN_MINUTE));
        System.out.println("The number of hours entered: " + hours);
        System.out.println("The number of minutes entered: " + mins);
        System.out.println("The number of seconds entered: " + seconds);
        System.out.println("The total number of seconds in the time you gave is: " + totalSeconds);
    }
}
