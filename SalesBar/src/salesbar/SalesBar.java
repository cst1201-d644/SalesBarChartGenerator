package salesbar;

import java.util.Scanner;

/**
 *
 * @author Devya
 */
public class SalesBar {

    public static void main(String[] args) {

        //ask the user for today's sales for the store 1.       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter today's sale for store1: ");
        int salesForStore1 = scanner.nextInt();

        //display the bar chart for store 1
        int numberOfAsterisks = salesForStore1 / 100;
        System.out.println("I should print " + numberOfAsterisks + "*s");

        System.out.print("Sales for store 1: ");
        for (int i = 0; i < numberOfAsterisks; i++) {
            System.out.print("*");

        }
        System.out.println();

        System.out.println("Enter sale for store2: ");
        int salesForStore2 = scanner.nextInt();

        int numberOfAsterisk = salesForStore2 / 100;
        System.out.println("I should print " + numberOfAsterisk + "*s");

        System.out.print("Sales for store 2: ");
        for (int i = 0; i < numberOfAsterisk; i++) {
            System.out.print("*");

        }
        System.out.println();

        System.out.println("Enter sale for store3: ");
        int salesForStore3 = scanner.nextInt();
        int numberOfAsteriskss = salesForStore3 / 100;
        System.out.println("I should print " + numberOfAsteriskss + "*s");

        System.out.print("Sales for store 3: ");
        for (int i = 0; i < numberOfAsteriskss; i++) {
            System.out.print("*");

        }
        System.out.println();

        System.out.println("Enter sale for store4: ");
        int salesForStore4 = scanner.nextInt();

        int numberOfAsterisksss = salesForStore4 / 100;
        System.out.println("I should print " + numberOfAsterisksss + "*s");

        System.out.print("Sales for store 4: ");
        for (int i = 0; i < numberOfAsterisksss; i++) {
            System.out.print("*");

        }
        System.out.println();
        
        System.out.println("Enter sale for store5: ");
        int salesForStore5 = scanner.nextInt();
        int numberOfAsteriskssss = salesForStore5 / 100;
        System.out.println("I should print " + numberOfAsteriskssss + "*s");

        System.out.print("Sales for store 5: ");
        for (int i = 0; i < numberOfAsteriskssss; i++) {
            System.out.print("*");

        }
        System.out.println();
                   
    }
}
