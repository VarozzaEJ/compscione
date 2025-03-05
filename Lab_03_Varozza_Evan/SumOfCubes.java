import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner kbdInput = new Scanner(System.in);
        double num1, num2, result;

        System.out.println("Enter a number: ");
        num1 = kbdInput.nextInt();

        System.out.println("Enter a second number: ");
        num2 = kbdInput.nextInt();

        result = ((Math.pow(num1, 3)) + (Math.pow(num2, 3)));

        System.out.println("The sum of the cubes of " + (int)num1 + " and " + (int)num2 + " is: " + (int)result);

        kbdInput.close();
    }
}