/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesbarchartgenerator;

import java.util.Scanner;

/**
 *
 * @author GKundu
 */
public class SalesBarChartGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int sale1; //Asterisks line 1
        int sale2; //Asterisks line 2
        int sale3; //Asterisks line 3
        int sale4; // Asterisks line 4
        int sale5; // Asterisks line 5
//for user input
        Scanner scanner = new Scanner(System.in);
//ask the user to today's sales for store 1.
        System.out.print("Enter Sales For Store 1 :");
        int salesForStore1 = scanner.nextInt();
        System.out.print("Enter Sales For Store 2 :");
        int salesForStore2 = scanner.nextInt();
        System.out.print("Enter Sales For Store 3 :");
        int salesForStore3 = scanner.nextInt();
        System.out.print("Enter Sales For Store 4 :");
        int salesForStore4 = scanner.nextInt();
        System.out.print("Enter Sales For Store 5 :");
        int salesForStore5 = scanner.nextInt();
// display the bar chart for store 1
        System.out.println(" SALES BAR CHART");
        for (sale1 = 1; sale1 <= salesForStore1; sale1 += 100) {
            System.out.print("*");
        }
        System.out.println("");
// display the bar chart for store 2
        for (sale2 = 1; sale2 <= salesForStore2; sale2 += 100) {
            System.out.print("*");
        }
        System.out.println("");
// display the bar chart for store 3
        for (sale3 = 1; sale3 <= salesForStore3; sale3 += 100) {
            System.out.print("*");
        }
        System.out.println("");
// display the bar chart for store 4
        for (sale4 = 1; sale4 <= salesForStore4; sale4 += 100) {
            System.out.print("*");
        }
        System.out.println("");
// display the bar chart for store 5
        for (sale5 = 1; sale5 <= salesForStore5; sale5 += 100) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
