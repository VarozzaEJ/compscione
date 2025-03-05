package Lab04_Varozza_Evan;

import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        int steps;

        final int STEPS_GOAL = 10000;

        Scanner kbdInput = new Scanner(System.in);

        System.out.println("Enter the number of steps you've taken today.");
        steps = kbdInput.nextInt();

        if(steps > 0 && steps < 1000) {
            System.out.println("You've got a good start! Keep it up.");
        }
        else if(steps >= 1000 && steps < 5000) {
            System.out.println("You're almost halfway there!");
        }
        else if(steps >= 5000 && steps < STEPS_GOAL) {
            System.out.println("You're over halfway there!");
        }
        kbdInput.close();
    }
}
