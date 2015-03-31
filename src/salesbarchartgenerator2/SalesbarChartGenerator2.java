/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesbarchartgenerator2;

import java.util.Scanner;

/**
 *
 * @author UnicornKitty
 */
public class SalesbarChartGenerator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter the sales for Store1: ");
       int salesForStore1 = scanner.nextInt();
       
       System.out.print("Enter the sales for Store2: ");
       int salesForStore2 = scanner.nextInt();
       
       System.out.print("Enter the sales for Store3: ");
       int salesForStore3 = scanner.nextInt();
       
       System.out.print("Enter the sales for Store4: ");
       int salesForStore4 = scanner.nextInt();
       
       System.out.print("Enter the sales for Store5: ");
       int salesForStore5 = scanner.nextInt();
       
       int numberOfAsterisks = salesForStore1 / 100;
       System.out.println("I should print " + numberOfAsterisks + " *s");
       
       
       
       System.out.println("Sales for Store1: ");
       System.out.println("Sales for Store2: ");
       System.out.println("Sales for Store3: ");
       System.out.println("Sales for Store4: ");
       System.out.println("Sales for Store5: ");
       
       for(int i = 0; i < numberOfAsterisks; i++){
           System.out.print("*");
       }
       
       System.out.println();
       
       
    }
    
}
