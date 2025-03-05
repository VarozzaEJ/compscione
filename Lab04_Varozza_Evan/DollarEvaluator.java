package Lab04_Varozza_Evan;

import java.util.Scanner;

public class DollarEvaluator {
    public static void main(String[] args) {
        int dollars;
        Scanner kbdInput = new Scanner(System.in);
        

        System.out.println("Enter the amount of money you currently have");
        dollars = kbdInput.nextInt();

        if(dollars == 0) {
            System.out.println("Sorry kid, you're broke! Get your money up.");
        }
        else if(dollars < 100) {
            System.out.println("You've got some spending money!");
        }
        else {
            System.out.println("You're rich dude!");
        }

        kbdInput.close();
    }
    
}
