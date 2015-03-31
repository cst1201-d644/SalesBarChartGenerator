/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesbarchartgen;

import java.util.Scanner;

/**
 *
 * @author Diandre
 */
public class SalesBarChartGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Retrieve Input from User for all store sales.
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Sales for store 1 today is: ");
        int Sale1 = Scanner.nextInt();

        System.out.println("Sales for store 2 today is: ");
        int Sale2 = Scanner.nextInt();

        System.out.println("Sales for store 3 today is: ");
        int Sale3 = Scanner.nextInt();
        
        System.out.println("Sales for store 4 today is: ");
        int Sale4 = Scanner.nextInt();

        System.out.println("today's sales for store 5 is: ");
        int Sale5 = Scanner.nextInt();

        System.out.println();
        
        // Asterisks Display
        int Asterisk1 = Sale1 / 100;
        System.out.println("Store 1:");
        for (int i = 0; i < Asterisk1; i++) {
            System.out.print("*");
        }
        System.out.println();
        int Asterisk2 = Sale2 / 100;
        System.out.println("Store 2:");
        for (int i = 0; i < Asterisk2; i++) {
            System.out.print("*");
        }

        int Asterisk3 = Sale3 / 100;
        System.out.println("Store 3:");
        for (int i = 0; i < Asterisk3; i++) {
            System.out.print("*");
        }
        System.out.println();

        int Asterisk4 = Sale4 / 100;
        System.out.println("Store 4:");
        for (int i = 0; i < Asterisk4; i++) {
            System.out.print("*");
        }
        System.out.println();

        int Asterisk5 = Sale5 / 100;
        System.out.println("Store 5:");
        for (int i = 0; i < Asterisk5; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
