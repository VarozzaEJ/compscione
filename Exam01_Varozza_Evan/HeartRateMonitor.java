package Exam01_Varozza_Evan;

import java.util.Scanner;

public class HeartRateMonitor {
    public static void main(String[] args) {
        //Variable Declarations
        String patientsName;
        int heartRateMeasurement1, heartRateMeasurement2, heartRateMeasurement3; 

        //Constant Declarations and Assignments
        final int HEART_RATE_MEASUREMENTS = 3;

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter your Name.");
        patientsName = keyboardInput.nextLine();

        System.out.println("Enter your first Heart Rate Measurement, must be greater than 0.");
        heartRateMeasurement1 = keyboardInput.nextInt();
        
        System.out.println("Enter your second Heart Rate Measurement, must be greater than 0.");
        heartRateMeasurement2 = keyboardInput.nextInt();
        
        System.out.println("Enter your third Heart Rate Measurement, must be greater than 0.");
        heartRateMeasurement3 = keyboardInput.nextInt();

        System.out.println("Patients Name: " + patientsName);
        System.out.println("Average Heart Rate: " + (double) ((heartRateMeasurement1 + heartRateMeasurement2 + heartRateMeasurement3) / (double)HEART_RATE_MEASUREMENTS));

        keyboardInput.close();
    }   
}
