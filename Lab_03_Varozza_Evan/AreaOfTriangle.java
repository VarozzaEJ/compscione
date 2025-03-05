import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner kbdInput = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.###");

        double side1, side2, side3, halfOfPerimeter;

        double area, innerComputedFunction;

        System.out.println("Enter the length of the first side");
        side1 = kbdInput.nextDouble();

        System.out.println("Enter the length of the second side");
        side2 = kbdInput.nextDouble();

        System.out.println("Enter the length of the third side");
        side3 = kbdInput.nextDouble();

        halfOfPerimeter = ((side1 + side2 + side3)/ 2);

        innerComputedFunction = ((halfOfPerimeter) * ((halfOfPerimeter - side1)) * ((halfOfPerimeter - side2)) * ((halfOfPerimeter - side3)));

        area = Math.sqrt(innerComputedFunction);

        System.out.println("The computed area of the triangle is: " + fmt.format(area));

        kbdInput.close();
    }
}
