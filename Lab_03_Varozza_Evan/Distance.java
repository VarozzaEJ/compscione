import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance, combinedX, combinedY;


        DecimalFormat fmt = new DecimalFormat("0.##");

        Scanner kbdInput = new Scanner(System.in);

        System.out.println("Enter the x coordinate of the first point: ");
        x1 = kbdInput.nextDouble();

        System.out.println("Enter the y coordinate of the first point: ");
        y1 = kbdInput.nextDouble();

        System.out.println("Enter the x coordinate of the second point: ");
        x2 = kbdInput.nextDouble();

        System.out.println("Enter the y coordinate of the second point: ");
        y2 = kbdInput.nextDouble();

        combinedX = x2 - x1;
        combinedY = y2 - y1;

        distance = Math.sqrt((Math.pow(combinedX, 2)) + (Math.pow(combinedY, 2)));
        

        System.out.println("The distance computed is: " + fmt.format(distance));
        kbdInput.close();
    }
}
