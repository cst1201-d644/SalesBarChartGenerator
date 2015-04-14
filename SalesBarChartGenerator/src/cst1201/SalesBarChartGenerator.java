package cst1201;

import java.util.Scanner;

public class SalesBarChartGenerator {

    public static void main(String[] args) {
        int sale1;
        int sale2;
        int sale3;
        int sale4;
        int sale5;

        java.util.Scanner scanner = new Scanner(System.in);

        System.out.print("Enter todays sales for store 1 :");
        int salesForStore1 = scanner.nextInt();
        System.out.print("Enter todays sales for store 2 :");
        int salesForStore2 = scanner.nextInt();
        System.out.print("Enter todays sales for store 3 :");
        int salesForStore3 = scanner.nextInt();
        System.out.print("Enter todays sales for store 4 :");
        int salesForStore4 = scanner.nextInt();
        System.out.print("Enter todays sales for store 5 :");
        int salesForStore5 = scanner.nextInt();

        System.out.println(" SALES BAR CHART");
        for (sale1 = 1; sale1 <= salesForStore1; sale1 += 100) {
            System.out.print("*");
        }
        System.out.println("");

        for (sale2 = 1; sale2 <= salesForStore2; sale2 += 100) {
            System.out.print("*");
        }
        System.out.println("");

        for (sale3 = 1; sale3 <= salesForStore3; sale3 += 100) {
            System.out.print("*");
        }
        System.out.println("");

        for (sale4 = 1; sale4 <= salesForStore4; sale4 += 100) {
            System.out.print("*");
        }
        System.out.println("");

        for (sale5 = 1; sale5 <= salesForStore5; sale5 += 100) {
            System.out.print("*");
        }
        System.out.println("");

    }

}
