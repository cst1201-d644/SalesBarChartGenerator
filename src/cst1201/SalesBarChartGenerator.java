/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class SalesBarChartGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ask the user for today's sales for the store 1.       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter today's sale for store1: ");
        int salesForStore1 = scanner.nextInt();

       //display the bar chart for store 1
        int numberOfAsterisks = salesForStore1/100;
        System.out.println("I should print " + numberOfAsterisks + "*s");
        
        System.out.print("Sales for store 1: ");
        for (int i = 0; i< numberOfAsterisks; i++) {
            System.out.print("*");
            
        }
        System.out.println();
        
    }
}
