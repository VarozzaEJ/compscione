public class MilesToKilometers {
    public static void main(String[] args) {
        //Constant Declarations
        final double CONVERSION_FACTOR;
        //Variable Declarations
        double miles; 
        double kilometers;

        //Assignments
        miles = 2;
        CONVERSION_FACTOR = 1.60935;

        kilometers = miles * CONVERSION_FACTOR;

        System.out.println("The given number of miles is: " + miles);
        System.out.println("The equivalent amount of kilometers is: " + kilometers);

    }
}