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

public class Problem_09_co {
    public static void main (String[] args ) { // Program to take a number from a user and print individual digits using loop
        
        int num , store , temp , count = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        num = sc.nextInt();
        
        temp = num ;
        
        while ( temp > 0)
        {
            temp /= 10 ;
            count ++ ;
        }
       
        while (num > 0 )
        {
            store = num  % 10 ;            
            System.out.println("number at place " + count +" is " + store );
            num /= 10 ;            
            count -- ;
        }        
    }
}