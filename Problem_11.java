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
    public class Problem_11 { // Program to accept a number and check the given number is armstrong number of not
        public static void main ( String[] args ) {
           
            /* 
              Angstrom numbers. 
              These are the numbers (0 and 1 excluded) in which the sum of 
              the cube of the digits is equal to the number itself.
              e.g. 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153.
              Three more such numbers are 370, 371 and 407
            */
            
            int num , store , temp , total = 0 ;
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            sc.close();
            
            store = num ;
            
            while ( num != 0 ){
                temp = store % 10 ;                
                total = total + temp * temp * temp ;                
                num /= 10 ;
            }
            
            if ( total == num )
                System.out.println( num + " is an angstrom number " );
            else 
                System.out.println( num + " is not an angstrom number " );
        
  }  
}