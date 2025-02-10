import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        int milesDriven;
        double gallonsUsed, mpg;

        Scanner scan = new Scanner(System.in); //NOTE This is a call to the scanner constructor to create a new Scanner called Scan

        System.out.println("Enter amount of miles driven");

        milesDriven = scan.nextInt();

        System.out.println("Enter gallons of fuel used.");

        gallonsUsed = scan.nextDouble();

        mpg = milesDriven / gallonsUsed;

        System.out.println("You had " + mpg + " miles to the gallon!");

        
    }
}