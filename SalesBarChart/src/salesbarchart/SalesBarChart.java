/* 
* To change this license header, choose License Headers in Project Properties. 
* To change this template file, choose Tools | Templates 
* and open the template in the editor. 
*/ 
package SalesBarChart; 
import java.util.Scanner; 
 /** 
* 
* @author Gcifuentes8
*/ 
public class SalesBarChart { 
/** 
* @param args the command line arguments 
*/ 
public static void main(String[] args) { 

 Scanner scan = new Scanner(System.in); 
    System.out.println("Enter the sales of store 1."); 
int numberofSales1 = scan.nextInt(); 
int storesales1 = numberofSales1/100; 
    for (int i = 0; i < storesales1; i++) { 
            
    System.out.print("* "); 
} 
    System.out.println(""); 

    System.out.println("Enter the sales of store 2:"); 
 int numberofSales2 = scan.nextInt(); 
 int storesales2= numberofSales2/100; 
    for (int x = 0; x < storesales2; x++) { 
    System.out.print("* "); 
} 
    System.out.println(""); 

    System.out.println("Enter the sales of store 3:"); 
int numberofSales3 = scan.nextInt(); 
int storesales3= numberofSales3/100; 
    for (int x = 0; x < storesales3; x++) { 
    System.out.print("* "); 
 } 
    System.out.println(""); 

    System.out.println("Enter the sales of store 4:"); 
int numberofSales4 = scan.nextInt(); 
int storesales4= numberofSales4/100; 
    for (int x = 0; x < storesales4; x++) { 
    System.out.print("* "); 
 } 
    System.out.println(""); 
    System.out.println("Enter the sales of store 5:"); 
int numberofSales5 = scan.nextInt(); 
int storesales5 = numberofSales5/100; 
    for (int x = 0; x < storesales5; x++) { 
    System.out.print("* "); 
 } 
    System.out.println(""); 

 
  } 

 
} 
