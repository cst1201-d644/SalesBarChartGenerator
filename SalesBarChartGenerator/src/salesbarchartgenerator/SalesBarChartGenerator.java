/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesbarchartgenerator;

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
        // TODO code application logic here

        Scanner keyboard = new Scanner(System.in);
        System.out.println("today's sales for store 1 is: ");
        int store1sales = keyboard.nextInt();
        
        System.out.println("today's sales for store 2 is: ");
        int store2sales = keyboard.nextInt();
        
        System.out.println("today's sales for store 3 is: ");
        int store3sales = keyboard.nextInt();
        
        System.out.println("today's sales for store 4 is: ");
        int store4sales = keyboard.nextInt();
        
        System.out.println("today's sales for store 5 is: ");
        int store5sales = keyboard.nextInt();

        System.out.println();
        System.out.println("SALES BAR CHART");

        int sales1 = store1sales / 100;
        System.out.println("Store 1:");
        for (int i = 0; i < sales1; i++) {
            System.out.print("*");
        }
        System.out.println();

        int sales2 = store2sales / 100;
        System.out.println("Store 2:");
        for (int i = 0; i < sales2; i++) {
            System.out.print("*");
        }
        System.out.println();

        int sales3 = store3sales / 100;
        System.out.println("Store 3:");
        for (int i = 0; i < sales3; i++) {
            System.out.print("*");
        }
        System.out.println();

        int sales4 = store4sales / 100;
        System.out.println("Store 4:");
        for (int i = 0; i < sales4; i++) {
            System.out.print("*");
        }
        System.out.println();

        int sales5 = store5sales / 100;
        System.out.println("Store 5:");
        for (int i = 0; i < sales5; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
