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
public class Problem_13 { // Program to print odd numbers from 1 to 10 in reverse
    public static void main (String[] args ) {
        
        int num , co , verify ;
        Scanner sc  = new Scanner ( System.in );
        System.out.println("Enter a number from 1 to 10: ");
        num = sc.nextInt();
        sc.close();
        
        co = num % 2 ;
        verify = num ;
        
        if ( co == 0 ){
            num +=1 ;
            while ( verify > 0 && num > 1 ){
                num -= 2 ;
                System.out.println("Odd numbers in reverse order: " + num );
                verify -- ;
            }
        }
        else
           while ( verify > 0 && num > 1){
            num -= 2 ;
            System.out.println("Odd numbers in reverse order: " + num );
           }
        
    }
    
}
