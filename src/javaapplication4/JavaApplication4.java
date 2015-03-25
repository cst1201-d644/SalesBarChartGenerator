/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author 23326809
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     int salesForStore1;
     
     System.out.println("Enter today's sales for store 1: ");
        Scanner keyboard = new Scanner(System.in);
     salesForStore1 = keyboard.nextInt();       
           
        int numberOfStars = salesForStore1/ 100;
        System.out.println("I should print " + numberOfStars + "s");
        
        System.out.print("Sales for store1: ");
               for (int i = 0; i <10; i++)
                   System.out.print("*");
               
               System.out.println();
                   
              
        
        
    }
    
}
