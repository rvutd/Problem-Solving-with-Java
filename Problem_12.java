/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.understanding.programs;

/**
 *
 * @author JOHN
 */
import java.util.Scanner;
public class Problem_12 { // Program to print odd numbers from 1 to 100
    public static void main ( String [] args) {
        
        int num , co , verify ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100: ");
        num = sc.nextInt();
        sc.close();
        
        verify = num ;
        co = num % 2 ;
      
        if ( co == 0 ){
            num += 1 ;
            System.out.println("Odd numbers: " + num);
            
            while ( verify < 99 && num < 99 ){
            num += 2 ;
            System.out.println("Odd numbers: " + num);
            verify ++ ;     
        }
       }
        else 
            while ( verify < 99 && num < 99){
            num  += 2 ;
            System.out.println("Odd numbers: " + num);
            verify ++ ;
            }     
   }
}
