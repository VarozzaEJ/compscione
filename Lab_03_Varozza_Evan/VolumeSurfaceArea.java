import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeSurfaceArea {
    public static void main(String[] args) {
        int radius;

        double surfaceArea, volume;

        final double fourThirds = (1.33333333333);

        Scanner kbdInput = new Scanner(System.in);

        DecimalFormat fmt = new DecimalFormat("0.####");

        System.out.println("Enter the radius of a circle");
        radius = kbdInput.nextInt();

        volume = ((fourThirds * Math.PI) * (Math.pow(radius, 3)));

        surfaceArea = ((4 * Math.PI) * (Math.pow(radius, 2)));

        System.out.println("The computed volume is: " + fmt.format(volume));
        System.out.println("The computed surface area is: " + fmt.format(surfaceArea));

        kbdInput.close();
    }
}
