 //Write a program that asks the user to enter today’s sales for five stores. 
//The program should display a bar chart comparing each store’s sales. 
//Create each bar in the bar chart by displaying a row of asterisks. 
//Each asterisk should represent $100 of sales. Here is an example of the program’s output:
package salesbarchart;

import java.util.Scanner;

/**
 *
 * @author Anu Alli
 */
public class SalesBarchart {

    public static void main(String[] args) {
        double[] store;
        store = new double[5];

        try (Scanner userInput = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.printf(" please enter today\'s sales from store %d: ", i + 1);
                store[i] = userInput.nextDouble();
            }

            System.out.println("\nSALES BAR CHART");

            for (int i = 0; i < 5; i++) {
                System.out.printf("Store %d: ", i + 1);

                for (int c = 0; c < store[i] / 100; c++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            userInput.close();

        }

    }

}
