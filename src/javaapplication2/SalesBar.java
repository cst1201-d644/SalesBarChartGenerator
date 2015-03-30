package javaapplication2;

import java.util.Scanner;

/**
 *
 * ALEKSANDRA Madalinska hw
 */
public class SalesBar {

    private static int sales1;
    private static int sales2;
    private static int sales3;
    private static int sales4;
    private static int sales5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  int sales1, sales2, sales3, sales4, sales5;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter todays sales for store 1: ");
        sales1 = keyboard.nextInt();
        System.out.print("Enter todays sales for store 2: ");
        sales2 = keyboard.nextInt();
        System.out.print("Enter todays sales for store 3: ");
        sales3 = keyboard.nextInt();
        System.out.print("Enter todays sales for store 4: ");
        sales4 = keyboard.nextInt();
        System.out.print("Enter todays sales for store 5: ");
        sales5 = keyboard.nextInt();
        System.out.println("SALES BAR CHART");
        System.out.print("Store 1:");
        for (int i = 0; i < sales1; i += 100) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Store 2:");
        for (int i = 0; i < sales2; i += 100) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Store 3:");
        for (int i = 0; i < sales3; i += 100) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Store 4:");
        for (int i = 0; i < sales4; i += 100) {
            System.out.print("*");

        }
        System.out.println();
        System.out.print("Store 5:");
        for (int i = 0; i < sales5; i += 100) {
            System.out.print("*");

        }
        System.out.println();
    }
}
