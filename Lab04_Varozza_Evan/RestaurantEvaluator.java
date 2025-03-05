package Lab04_Varozza_Evan;

import java.util.Scanner;

public class RestaurantEvaluator {
    public static void main(String[] args) {

        boolean hasFish, hasVegan, hasPizza, meetsNeeds;
        
        Scanner kbdInput = new Scanner(System.in);

        System.out.println("Does the restaurant have fish? Type True or False");
        hasFish = kbdInput.nextBoolean();

        System.out.println("Does the restaurant have vegan options? Type True or False");
        hasVegan = kbdInput.nextBoolean();

        System.out.println("Does the restaurant have pizza? Type True or False");
        hasPizza = kbdInput.nextBoolean();

        meetsNeeds = (hasFish && hasVegan || hasFish && hasPizza && hasVegan || hasPizza && hasVegan); 
        System.out.println(meetsNeeds ? "Let's go" : "We've got to think of someplace else");

        kbdInput.close();
    }
}
