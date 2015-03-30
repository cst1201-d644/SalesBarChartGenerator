/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salesbarchartgenerator;
import java.util.Scanner;
/**
 *
 * @author JianLang Lin
 */
public class SalesBarChartGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int saleforstore1,saleforstore2,saleforstore3,saleforstore4,saleforstore5;
        System.out.print("Enter sale for store one   $");
        saleforstore1=keyboard.nextInt();
        System.out.print("Enter sale for store two   $");
        saleforstore2=keyboard.nextInt();
        System.out.print("Enter sale for store three $");
        saleforstore3=keyboard.nextInt();
        System.out.print("Enter sale for store four  $");
        saleforstore4=keyboard.nextInt();
        System.out.print("Enter sale for store five  $");
        saleforstore5=keyboard.nextInt();
        int sum1=saleforstore1/100,
            sum2=saleforstore2/100,
            sum3=saleforstore3/100,
            sum4=saleforstore4/100,
            sum5=saleforstore5/100;
        System.out.println("Sales bar chat");
        System.out.print("Store1:");
        for (int i=0;i<sum1;i++)
            System.out.print("*");
        System.out.println();
        System.out.print("Store2:");
        for (int i=0;i<sum2;i++)
            System.out.print("*");
        System.out.println();
        System.out.print("Store3:");
        for (int i=0;i<sum3;i++)
            System.out.print("*");
        System.out.println();
        System.out.print("Store4:");
        for (int i=0;i<sum4;i++)
            System.out.print("*");
        System.out.println();
        System.out.print("Store5:");
        for (int i=0;i<sum5;i++)
            System.out.print("*");
        System.out.println();
    }
    
}
