/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salesbarchartgenerator;
import java.util.Scanner;
/**
 *
 * @author class Sameen Qaiser
 */
public class SalesBarChartGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter today's sales for store 1: ");
        int salesForStore1 = scanner.nextInt();
        System.out.print("Enter today's sales for store 2: ");
        int salesForStore2 = scanner.nextInt();
        System.out.print("Enter today's sales for store 3: ");
        int salesForStore3 = scanner.nextInt();
        System.out.print("Enter today's sales for store 4: ");
        int salesForStore4 = scanner.nextInt();
        
        int numberOfAsterisks1 = salesForStore1 / 100;
        int numberOfAsterisks2 = salesForStore2 / 100;
        int numberOfAsterisks3 = salesForStore3 / 100;
        int numberOfAsterisks4 = salesForStore4 / 100;
     
        System.out.println("SALES BAR CHART");
        
        System.out.print("store 1: ");
        for (int i = 0; i < numberOfAsterisks1; i++) {
            System.out.print("*");}
        System.out.println();
        
        System.out.print("store 2: ");
        for (int i = 0; i < numberOfAsterisks2; i++) {
            System.out.print("*");}
        System.out.println();
        
        System.out.print("store 3: ");
        for (int i = 0; i < numberOfAsterisks3; i++) {
            System.out.print("*");}
        System.out.println();
        
        System.out.print("store 4: ");
        for (int i = 0; i < numberOfAsterisks4; i++) {
            System.out.print("*");}
        System.out.println();
    }
    }
    
