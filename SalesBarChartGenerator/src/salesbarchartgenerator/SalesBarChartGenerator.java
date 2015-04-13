/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salesbarchartgenerator;

import java.util.Scanner;

/**
 *
 * @author Kenny Tsang
 */
public class SalesBarChartGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for user input.
        Scanner scanner = new Scanner(System.in);

        //ask the user for today's sales for the store 1.
        System.out.print("Enter the sales for store 1: ");
        int salesForStore1 = scanner.nextInt();

        //ask the user for today's sales for the store 2.
        System.out.print("Enter the sales for store 2: ");
        int salesForStore2 = scanner.nextInt();
        
        //ask the user for today's sales for the store 3.
        System.out.print("Enter the sales for store 3: ");
        int salesForStore3 = scanner.nextInt();
        
        //ask the user for today's sales for the store 4.
        System.out.print("Enter the sales for store 4: ");
        int salesForStore4 = scanner.nextInt();
        
        //ask the user for today's sales for the store 5.
        System.out.print("Enter the sales for store 5: ");
        int salesForStore5 = scanner.nextInt();
        System.out.println();
        
        //display the bar chart for store 1.
        int numberOfAsterisks1 = salesForStore1 / 100;
        System.out.print("Sales for store 1: ");
    
        for (int i = 0; i < numberOfAsterisks1; i++) {
            System.out.print("*");
        }
        System.out.println();

        //display the bar chart for store 2.
        int numberOfAsterisks2 = salesForStore2 / 100;
        System.out.print("Sales for store 2: ");

        for (int i = 0; i < numberOfAsterisks2; i++) {
            System.out.print("*");
        }
        System.out.println();

        //display the bar chart for store 3.
        int numberOfAsterisks3 = salesForStore3 / 100;
        System.out.print("Sales for store 3: ");

        for (int i = 0; i < numberOfAsterisks3; i++) {
        System.out.print("*");
        }
        System.out.println();

        //display the bar chart for store 4.
        int numberOfAsterisks4 = salesForStore4 / 100;
        System.out.print("Sales for store 4: ");

        for (int i = 0; i < numberOfAsterisks4; i++) {
            System.out.print("*");
        }
        System.out.println();

        //display the bar chart for store 5.
        int numberOfAsterisks5 = salesForStore5 / 100;
        System.out.print("Sales for store 5: ");

        for (int i = 0; i < numberOfAsterisks5; i++) {
        System.out.print("*");
        }
        System.out.println();
        
    }
}