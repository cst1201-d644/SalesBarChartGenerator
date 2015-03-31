/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

import java.util.Scanner;

/**
 *
 * @author Evan Chin
 */
public class SalesBarChartGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask the user for today's sales for the store 1.
        int salesForStore1;
        System.out.println("Enter sales for store 1: ");
        salesForStore1 = scanner.nextInt();

        //display the bar chart for store 1.
        // ask the user for today's sales for the store 2.
        int salesForStore2;
        System.out.println("Enter sales for store 2: ");
        salesForStore2 = scanner.nextInt();

        //display the bar chart for store 2.
        // ask the user for today's sales for the store 3.
        int salesForStore3;
        System.out.println("Enter sales for store 3: ");
        salesForStore3 = scanner.nextInt();

        //display the bar chart for store 3.
        // ask the user for today's sales for the store 4.
        int salesForStore4;
        System.out.println("Enter sales for store 4: ");
        salesForStore4 = scanner.nextInt();

        //display the bar chart for store 4.
        // ask the user for today's sales for the store 5.
        int salesForStore5;
        System.out.println("Enter sales for store 5: ");
        salesForStore5 = scanner.nextInt();
        
        System.out.println();

        //display the bar chart for store 5.
        {
            int numberofAstericks1 = salesForStore1 / 100;
            {
                System.out.println("I should print " + numberofAstericks1 + "*s.");
            }
            for (int i = 0; i < numberofAstericks1; i++) {
                System.out.print("*");
            }
            System.out.println();

            int numberofAstericks2 = salesForStore2 / 100;
            {
                System.out.println("I should print " + numberofAstericks2 + "*s.");
            }
            for (int j = 0; j < numberofAstericks2; j++) {
                System.out.print("*");
            }
            System.out.println();

            int numberofAstericks3 = salesForStore3 / 100;
            {
                System.out.println("I should print " + numberofAstericks3 + "*s.");
            }
            for (int k = 0; k < numberofAstericks3; k++) {
                System.out.print("*");
            }
            System.out.println();

            int numberofAstericks4 = salesForStore4 / 100;
            {
                System.out.println("I should print " + numberofAstericks4 + "*s.");
            }
            for (int l = 0; l < numberofAstericks4; l++) {
                System.out.print("*");
            }
            System.out.println();

            int numberofAstericks5 = salesForStore5 / 100;
            {
                System.out.println("I should print " + numberofAstericks5 + "*s.");
            }
            for (int m = 0; m < numberofAstericks5; m++) {
                System.out.print("*");
            }
            System.out.println();

            System.out.println();
        }
    }
}