package Lab04_Varozza_Evan;

import java.util.Scanner;

public class HeartRateMonitor {
    public static void main(String[] args) {
        final int LOWER_BOUND = 120;
        final int UPPER_BOUND = 150;

        int heartRate;

        Scanner kbdInput = new Scanner(System.in);

        System.out.println("Enter your current heart rate.");
        heartRate = kbdInput.nextInt();

        if(heartRate <= UPPER_BOUND && heartRate >= LOWER_BOUND) {
            System.out.println("You're right on track!");
        }
        else if(heartRate < LOWER_BOUND) {
            System.out.println("You're doing great, try to push a bit harder!");
        }
        else if(heartRate > UPPER_BOUND) {
            System.out.println("You're on fire, try to slow it down a bit.");
        }

        kbdInput.close();
    }
}